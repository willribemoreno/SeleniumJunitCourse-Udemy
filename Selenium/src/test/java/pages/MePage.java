package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MePage extends BasePage {

	public MePage(WebDriver navegador) {
		super(navegador);		
	}
	
	public MePage clickOnMoreDataAboutYouTab(){
		
		navegador.findElement(By.linkText("more data about you".toUpperCase())).click();
		
		return this;
	}
	
	public AddContactPage clickOnAddMoreDataButton() {
		navegador.findElement(By.cssSelector("#moredata > div.row.center > button")).click();		
		
		return new AddContactPage(navegador);
	}
}
