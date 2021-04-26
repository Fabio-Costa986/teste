package metodos;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class Metodo {
	
	
	WebDriver driver;

	public void abrirNavegador(String url, String navegador) {

		if (navegador == "Chrome") {
			System.setProperty("webdriver.chrome.driver", "./src/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();

		} else if (navegador == "firefox") {
			System.setProperty("webdriver.chrome.driver", "./src/Drivers/geckodriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();

		} else {

			System.out.println("navegador inválido, Chrome ou firefox");
		}

	}

	public void fechar() {

		driver.quit();
	}

	public void escrever(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);
	}

	
	public void clicar(By elemento) {

		driver.findElement(elemento).click();
	}

	public void validarCampos() {
		
		Assert.assertEquals("Teste", driver.findElement(By.id("nome")).getText());
		Assert.assertEquals("teste@gmail.com", driver.findElement(By.id("email")).getText());
		
		
	}

	

}
