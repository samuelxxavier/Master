package Metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void pausa(int tempo) throws InterruptedException {

		Thread.sleep(tempo);
	}

	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}
	
	public void click (By elemento) {
		driver.findElement(elemento).click();
	}
	
	public void executarNavegador(String url) {
		
		System.setProperty("webdriver.chrome.driver", "./Drive.chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void validatTexto(String texto, By elemento) {
		
		 String texto1 = driver.findElement(elemento).getText();
		 assertEquals(texto, texto1);
		
		
	}
	
	public void scroll(By elemento) {
		
		WebElement element = driver.findElement(elemento);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
     
	public void  screnShoot(String print) throws IOException {
		 TakesScreenshot scrShot = ((TakesScreenshot)driver);
		 File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		 File Destfile = new File(print);
		 FileUtils.copyFile(SrcFile, Destfile);
	}
}
