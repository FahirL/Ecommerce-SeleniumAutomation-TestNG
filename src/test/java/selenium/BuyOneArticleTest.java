package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.ArticlePage;
import pageObjects.LinksPage;
import resources.base;

public class BuyOneArticleTest extends base {
	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
	}

	@Test
	public void OneArticle() throws IOException, InterruptedException {

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		ArticlePage ap = new ArticlePage(driver);
		ap.getArticle().click();
		String blouse = ap.checkTitle().getText();
		Assert.assertEquals("Blouse", blouse);
		Thread.sleep(1000);
		ap.useColor().click();
		String price = ap.getPrice().getText();
		ap.addArticle().click();
		ap.successAdd().isDisplayed();
		ap.getProceed().click();
		String untilprice = ap.getUntilPrice().getText();
		Assert.assertEquals(price, untilprice);
		Thread.sleep(1000);
		ap.checkOut().click();
		LinksPage lp = new LinksPage(driver);
		lp.inputEmail().sendKeys("test123@live.com");
		lp.inputPass().sendKeys("testtest123");
		lp.getLogin().click();
		driver.findElement(By.cssSelector("textarea[name='message']"))
				.sendKeys("Hi, I want them to deliver this to me as soon as possible!");
		ap.checkOut2().click();
		ap.checkBox().click();
		ap.checkOut3().click();
		ap.usePay().click();
		ap.confirmOrder().click();
		String cotext = ap.confirmText().getText();
		Assert.assertEquals("Your order on My Store is complete.", cotext);

	}

	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();

	}

}
