package support;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Web {
	
	public static final String USERNAME = "williamribeiro1";
	public static final String AUTOMATE_KEY = "pBhpDDqPZ42QajuZyzqa";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
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

	public static WebDriver createBrowserStack() {
		
		DesiredCapabilities caps = new DesiredCapabilities();
        
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "80");
		caps.setCapability("name", "williamribeiro1's First Test");
		
		WebDriver navegador = null;
		
		try {
			navegador = new RemoteWebDriver(new URL(URL), caps);
			navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			//navegando para a página do taskit
			navegador.get("http://www.juliodelima.com.br/taskit");	
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println("There is a problem on your URL: " + e.getMessage());
		}
		
		return navegador;
	}
}
