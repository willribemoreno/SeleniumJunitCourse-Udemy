package support;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	
public static WebDriver chromeInstance() {
		
		//setProperty é responsável por informar qual navegador será utilizado e qual o path do webdriver
		System.setProperty("webDriver.chrome.driver", "C:\\DriversSelenium\\chromedriver.exe");
		//WebDriver é uma o tipo, classe do navegador. A linha abaixo cria uma nova instância do objeto chrome, ou seja, abre o navegador
		WebDriver navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//navegando para a página do taskit
		navegador.get("http://www.juliodelima.com.br/taskit");	
		
		return navegador;
	}
}
