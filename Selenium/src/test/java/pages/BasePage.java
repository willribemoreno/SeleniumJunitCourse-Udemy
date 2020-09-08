package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
	
	protected WebDriver navegador;
	
	public BasePage(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	public String captureTextFromToast() {
		
		return navegador.findElement(By.id("toast-container")).getText();
			
		
	}
}
