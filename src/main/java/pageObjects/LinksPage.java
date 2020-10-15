package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinksPage {
	public WebDriver driver;
	
	
	By email = By.cssSelector("input[id='email']");
	By password = By.cssSelector("input[id='passwd']");
	By signin = By.cssSelector("button[id='SubmitLogin']");
	By getsignin = By.cssSelector("a[title='Log in to your customer account']");
	By dresses = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
	
	public LinksPage(WebDriver driver) {
		  this.driver=driver;
	  }

	  public WebElement inputEmail() 
	  {
		  return driver.findElement(email);
	  }
	  public WebElement inputPass()
	  {
		  return driver.findElement(password);
	  }
	  public WebElement getLogin()
	  {
		  return driver.findElement(signin);
	  }
	  public WebElement getLoginAcc() 
	  {
		  return driver.findElement(getsignin);
	  }
	  public WebElement getDresses()
	  {
		  return driver.findElement(dresses);
	  }
}
