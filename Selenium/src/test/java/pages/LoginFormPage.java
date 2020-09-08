package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage extends BasePage{	
	
	public LoginFormPage(WebDriver navegador) {
		super(navegador);
	}

	public LoginFormPage typeLogin(String login){
		
		// identificando o formulário de login: id "signinbox"
		// digitar no campo com name "login" que está dentro do formulário de id "signinbox" o texto "julio0001"
		//formularioSignInBox.findElement(By.name("login")).sendKeys("julio0001");
		navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys(login);		
		
		return this;
	}

	public LoginFormPage typePassword(String password) {		
	
		//navegador.findElement(By.name("password")).sendKeys(password);
		//navegador.findElement(By.xpath("[placeholder=\"Excuse me, can you tell us a secret?\"]")).sendKeys(password);
		navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys(password);
		
		return this;
	}
	
	public SecretPage clickOnSignIn() {
		navegador.findElement(By.linkText("Sign In".toUpperCase())).click();
		
		return new SecretPage(navegador);
	}
	
	public SecretPage login(String login, String password) {
		typeLogin(login);
		typePassword(password);
		clickOnSignIn();
		
		return clickOnSignIn();
	}
}
