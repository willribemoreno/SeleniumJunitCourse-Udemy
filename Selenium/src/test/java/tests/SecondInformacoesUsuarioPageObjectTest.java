package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;

import pages.LoginPage;
import support.Web;


public class SecondInformacoesUsuarioPageObjectTest {
	
	public WebDriver navegador;
	
	@BeforeEach
	public void setUp() {
//		rodar os testes offline
		navegador = Web.chromeInstance();
//		rodar os testes na nuvem
//		navegador = Web.createBrowserStack();
	}
	
//	@Test
	@DisplayName("Testing taskit page")
	@ParameterizedTest(name = "{index} => type = {0}, contact = {1}, message = {2}")
	@CsvFileSource(resources = "/InformacoesUsuarioInputData.csv")

	public void testABC(String type, String contact, String message) {
		
		String toastText = new LoginPage(navegador)
		.clickSignIn()
		.typeLogin("julio0001")
		.typePassword("123456")		
		.clickOnSignIn()
		.clickOnMe()
		.clickOnMoreDataAboutYouTab()
		.clickOnAddMoreDataButton()
		.addContact(type, contact)
		.captureTextFromToast();
		
		assertEquals(message, toastText);
	}
	
	@AfterEach
	public void tearDown() {
		navegador.quit();
	}
	
}
