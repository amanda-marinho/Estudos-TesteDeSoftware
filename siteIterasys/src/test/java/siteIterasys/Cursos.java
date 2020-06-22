package siteIterasys;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cursos {
	String url ;		//endereço do site alvo
	WebDriver driver;	//objeto do Selenium WebDriver

	@Before
	public void iniciar() {
		url = "https://iterasys.com.br";
		System.setProperty("webdriver.gecko.driver",
			"/home/amanda/Documentos/TI/TESTES/teste-workspace/siteIterasys/drivers/firefox/26/geckodriver-v0.26.0-linux64/geckodriver");

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);	//verifica a cada tempo definido se a pagina já carregou
		driver.manage().window().maximize();	//maximiza a tela caso ela abra pequena
		
	}
	
	@After
	public void finalizar() {
		driver.quit();	//matar o processo
	}
	
	@Test
	public void consultarCurso() {
		//HOME
		driver.get(url);	//abrir o navegador na pagina indicada pela url
		driver.findElement(By.id("searchtext")).clear();
		driver.findElement(By.id("searchtext")).sendKeys("Mantis");
		//tirar screenshot
		driver.findElement(By.id("btn_form_search")).click();
		
		//PÁGINA LISTA DE CURSOS
		driver.findElement(By.cssSelector("span.comprar")).click();
		
		//PÁGINA DE COMPRA
		String titulo = "Mantis";
		String preco = "R$ 49,99";
		
		//assertEquals(resultadoEsperado, resultadoAtual);
		assertEquals(titulo, driver.findElement(By.cssSelector("span.item-title")).getText());
		
		assertEquals(preco, driver.findElement(By.cssSelector("span.new-price")).getText());
	}
	
	
}
