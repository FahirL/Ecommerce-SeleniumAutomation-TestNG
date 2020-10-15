package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ArticlePage {
	public WebDriver driver;
	By article = By.cssSelector("a[title='Blouse']");
	By color = By.cssSelector("a[id='color_8']");
	By title = By.cssSelector("h1[itemprop='name']");
	By price = By.cssSelector("span[id='our_price_display']");
	By add = By.cssSelector("button[name='Submit']");  
	By successadd = By.cssSelector("div[class='layer_cart_product col-xs-12 col-md-6'] h2");
	By proceed = By.cssSelector("a[title='Proceed to checkout']");
	By untilprice = By.cssSelector("td[id='total_product']");
	By checkout = By.cssSelector("a[class='button btn btn-default standard-checkout button-medium'] span");
	By checkout2 = By.cssSelector("button[name='processAddress']");
	By checkbox = By.cssSelector("input[id='cgv']");
	By checkout3 = By.cssSelector("button[name='processCarrier']");
	By payment = By.cssSelector("a[title='Pay by bank wire']");
	By confirm = By.cssSelector("button[class='button btn btn-default button-medium']");
	By confirmtext = By.cssSelector("div[id='center_column'] div p strong");

	public ArticlePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getArticle() {
		return driver.findElement(article);
	}
	public WebElement useColor() {
		return driver.findElement(color);
	}
	public WebElement checkTitle() {
		return driver.findElement(title);
	}
	public WebElement getPrice() {
		return driver.findElement(price);
	}
	public WebElement addArticle() {
		return driver.findElement(add);
	}
	public WebElement successAdd() {
		return driver.findElement(successadd);
	}
	public WebElement getProceed() {
		return driver.findElement(proceed);
	}
	public WebElement getUntilPrice() {
		return driver.findElement(untilprice); 
	}
	public WebElement checkOut() {
		return driver.findElement(checkout);
	}
	public WebElement checkOut2() {
		return driver.findElement(checkout2);
	}
	public WebElement checkOut3() {
		return driver.findElement(checkout3);
	}
	public WebElement checkBox() { 
		return driver.findElement(checkbox);
	}
	public WebElement usePay() {
		return driver.findElement(payment);
	}
	public WebElement confirmOrder() {
		return driver.findElement(confirm);
	}
    public WebElement confirmText() {
    	return driver.findElement(confirmtext);
    }
}
