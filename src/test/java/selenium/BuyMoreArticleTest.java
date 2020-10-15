package selenium;

import java.io.IOException;
import java.text.DecimalFormat;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LinksPage;
import pageObjects.MoreArticlePage;
import resources.base;

public class BuyMoreArticleTest extends base {
	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
	}

	@Test
	public void MoreArticles() throws IOException, InterruptedException {

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
		LinksPage lp = new LinksPage(driver);
		lp.getLoginAcc().click();
		lp.inputEmail().sendKeys("test123@live.com");
		lp.inputPass().sendKeys("testtest123");
		lp.getLogin().click();
		Thread.sleep(2000);
		lp.getDresses().click();
		MoreArticlePage mp = new MoreArticlePage(driver);
		Thread.sleep(1000);

//		WebElement element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/span/span"));
		Actions action = new Actions(driver);
		action.moveToElement(mp.getMove()).build().perform();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "arguments[0].click();";
		js.executeScript(script, mp.getArticle());
		Thread.sleep(2000);
		mp.getContinue().click();
		action.moveToElement(mp.getMove2()).build().perform();
		js.executeScript(script, mp.getArticle2());
		Thread.sleep(2000);
		mp.getContinue().click();
		action.moveToElement(mp.getMove3()).build().perform();
		js.executeScript(script, mp.getArticle3());
		Thread.sleep(2000);
		mp.getContinue().click();
		WebElement view = mp.getView();
		action.moveToElement(view).build().perform();
		mp.getCheckout().click();
		Thread.sleep(2000);
		String price = mp.getPrice().getAttribute("innerHTML");  // first article price
		String price2 = mp.getPrice2().getAttribute("innerHTML"); // second article price
		String price3 = mp.getPrice3().getAttribute("innerHTML"); // third article price
		String totalproduct = mp.getTotalproductprice().getAttribute("innerHTML"); // total prices of articles

		price = price.replace("$", "");
		price2 = price2.replace("$", "");
		price3 = price3.replace("$", "");
		totalproduct = totalproduct.replace("$", "");
		double a = Double.parseDouble(price);
		double b = Double.parseDouble(price2);
		double c = Double.parseDouble(price3);
		double d = Double.parseDouble(totalproduct);
		double num = 0;
		num = a + b + c; // testing the value of total prices
		DecimalFormat format = new DecimalFormat("0.##");
		Assert.assertEquals(format.format(num), format.format(d));
		double sum = 0;
		String priceship = mp.getPriceship().getAttribute("innerHTML"); // price shipping
		String total = mp.getTotal().getAttribute("innerHTML"); // total price with shipping
		priceship = priceship.replace("$", "");
		total = total.replace("$", "");
		double e = Double.parseDouble(priceship);
		sum = num + e; // testing the value when add price shipping
		DecimalFormat format1 = new DecimalFormat("0.##");
		Assert.assertEquals(format1.format(sum), total);
		action.moveToElement(mp.getTotal()).build().perform();
		Thread.sleep(2000);
	}
	@AfterTest
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	
		
	}

}