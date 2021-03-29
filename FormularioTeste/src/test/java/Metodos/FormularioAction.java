package Metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Elementos.FormularioScreen;

public class FormularioAction {
	WebDriver driver;
	FormularioScreen screen = new FormularioScreen();

	public void abrirNavegador(String site) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();

	}

	public void preencherFormulario(By elemento, String texto) throws InterruptedException {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void click(By elemento) throws InterruptedException {

		driver.findElement(elemento).click();

	}

	public void preencherDados(String email, String Phone, String username, String password, String confirma)
			throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("phone")).sendKeys(Phone);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("confirmpassword")).sendKeys(confirma);

	}


	
	public void ElementExists(By elemento, String txtEsperado) throws InterruptedException {

		String texto = driver.findElement(elemento).getText();
		Assert.assertTrue(texto.contains(txtEsperado));
	}

	public void screenShot(String nome) throws IOException {

		TakesScreenshot srcShot = ((TakesScreenshot) driver);
		File SrcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./src/evidencia/" + nome + ".png");
		FileUtils.copyFile(SrcFile, DestFile);
	}

	public void scrollVertical(By el) {
		
		WebElement element = driver.findElement(el);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	}
	public void esperar(int tempo) throws InterruptedException {

		Thread.sleep(tempo);
	}

	public void fecharBrowser() throws InterruptedException {
		driver.quit();
	}


}
