package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoreArticlePage { 
	public WebDriver driver;
	By article = By.xpath("(//span[contains(.,'Add to cart')])[1]"); 
	By article2 = By.xpath("(//span[contains(.,'Add to cart')])[2]");
	By article3 = By.xpath("(//span[contains(.,'Add to cart')])[4]");

	By contin = By.cssSelector("span[title='Continue shopping']");
	By moveart = By.xpath("(//span[@class='available-now'])[1]");
	By moveart2 = By.xpath("(//span[@class='available-now'])[2]");
	By moveart3 = By.xpath("(//span[@class='available-now'])[4]");
	By price = By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[1]/td[6]/span");
	By price2 = By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[2]/td[6]/span");
	By price3 = By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[3]/td[6]/span");
	By totalproduct = By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tfoot/tr[1]/td[3]");
	By priceship =By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tfoot/tr[3]/td[2]");
	By total =By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tfoot/tr[7]/td[2]/span");
	By view = By.cssSelector("a[title='View my shopping cart']");
	By checkout = By.cssSelector("a[id='button_order_cart']");
	
	public MoreArticlePage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getArticle() {
		return driver.findElement(article);
	}
	public WebElement getArticle2() {
		return driver.findElement(article2);
	}
	public WebElement getArticle3() {
		return driver.findElement(article3);
	}
    public WebElement getContinue() {
    	return driver.findElement(contin);
    }
    public WebElement getMove() {
    	return driver.findElement(moveart);
    }
    public WebElement getMove2() {
    	return driver.findElement(moveart2);
    }
    public WebElement getMove3() {
    	return driver.findElement(moveart3);
    }
    public WebElement getPrice() {
    	return driver.findElement(price);
    }
    public WebElement getPrice2() {
    	return driver.findElement(price2);
    }
    public WebElement getPrice3() {
    	return driver.findElement(price3);
    }
    public WebElement getTotalproductprice() {
    	return driver.findElement(totalproduct);
    }
    public WebElement getPriceship() {
    	return driver.findElement(priceship);
    }
    public WebElement getTotal() {
    	return driver.findElement(total);
    }
    public WebElement getView() {
    	return driver.findElement(view);
    }
    public WebElement getCheckout() {
    	return driver.findElement(checkout);
    }
}
