package app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement womenTag;
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getWomenTag() {
		return womenTag;
	}
	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement DressesTag;
	
	public WebElement getDressesTag() {
		return DressesTag;
	}
	
	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement shirtsTag;
	
	public WebElement getshirtsTag() {
		return shirtsTag;
	}
	}
	


