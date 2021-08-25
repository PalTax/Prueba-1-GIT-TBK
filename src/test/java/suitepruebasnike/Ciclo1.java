package suitepruebasnike;

import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ciclo1 {
	private WebDriver driver;
	private String url;
	private WebDriverWait wait;

	@AfterTest
	public void finPrueba() {
		 driver.close();
	}

	@BeforeTest
	public void preparacionPruebas() throws InterruptedException {
		String rutaChromeDriver = Paths
				.get(System.getProperty("user.dir"), "\\src\\test\\resources\\driver\\chromedriver.exe").toString();
		System.setProperty("webdriver.chrome.driver", rutaChromeDriver);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		url = "https://www.nike.com/cl/";
	}

	 @Test
	public void CP001_Login_Error() {

		driver.get(url);
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Únete a nosotros')]")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
				"div.u-full-width.u-full-height:nth-child(12) div.grid.Z25uR9U5.fixed-fluid.ncss-container._1WKaQgke.css-oh6fxi.css-1dikzjl:nth-child(4) div.ncss-row.grid-row div.grid-col.va-sm-t.ncss-col-lg-12.ncss-col-md-12.ncss-col-sm-12.ncss-col-lg-offset-0.ncss-col-md-offset-0.ncss-col-sm-offset-0 div:nth-child(1) div.vmLDU1wi._38689zM8._15UrorU4 div.YEqpdVMc.cta-container.hasText > a.dz_xjzja._2minRfAM.ncss-btn-primary-dark:nth-child(2)")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[7]/form[1]/div[2]/input[1]")))
				.sendKeys("pruebaqa@gmail.com");
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[7]/form[1]/div[3]/input[1]")))
				.sendKeys("abc123");
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[7]/form[1]/div[6]/input[1]"))).click();
		String a = wait
				.until(ExpectedConditions.elementToBeClickable(
						By.xpath("//li[contains(text(),'El correo electrónico o la contraseña se ha introd')]")))
				.getText();
		Assert.assertEquals(a, "El correo electrónico o la contraseña se ha introd");
	}

	@Test
	public void CP002_Seleccion_Zapatilla_Para_Comprar() {
		driver.get(url);
		driver.manage().window().maximize();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//header/div[1]/div[1]/div[2]/nav[1]/div[2]/ul[1]/li[1]/a[1]")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//body/div[@id='app-root']/div[@id='react-root']/div[1]/div[3]/div[1]/div[5]/div[2]/main[1]/section[1]/div[1]/div[1]/div[1]/figure[1]/a[2]/div[1]/div[1]/img[1]")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'10 (CL 42)')]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//body/div[@id='app-root']/div[@id='react-root']/div[@id='PDP']/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/button[1]")))
				.click();
		String b = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[contains(text(),'TU CUENTA PARA TODO LO RELACIONADO CON NIKE')]"))).getText();
		Assert.assertEquals(b, "TU CUENTA PARA TODO LO RELACIONADO CON NIKE");
	}

	@Test
	public void CP003_Modulo_Mujer_Agregar_A_Favoritos() {
		driver.get(url);
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Mujer')]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//body/div[@id='ciclp-app']/div[1]/div[6]/div[2]/div[1]/div[1]/figure[1]/figcaption[1]/div[1]/div[1]/a[1]")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//body/div[@id='app-root']/div[@id='react-root']/div[1]/div[3]/div[1]/div[5]/div[2]/main[1]/section[1]/div[1]/div[1]/div[1]/figure[1]/a[2]/div[1]/div[1]/img[1]")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//body/div[@id='app-root']/div[@id='react-root']/div[@id='PDP']/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/button[1]")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'XS (0–2)')]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//body/div[@id='app-root']/div[@id='react-root']/div[@id='PDP']/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/button[2]/span[1]")))
				.click();
		String c = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[contains(text(),'TU CUENTA PARA TODO LO RELACIONADO CON NIKE')]"))).getText();
		Assert.assertEquals(c, "TU CUENTA PARA TODO LO RELACIONADO CON NIKE");
	}

	@Test
	public void CP004_Modulo_Ayudas_Twiter() {
		driver.get(url);
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'OBTENER AYUDA')]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='experience-wrapper']/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]"))).click();
		String d = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//span[contains(text(),'Athletes helping athletes, 7 days a week. Language')]"))).getText();
		Assert.assertEquals(d, "Athletes helping athletes, 7 days a week. Language");

	}

	@Test
	public void CP005_Ver_Favoritos_Usuario_Registrado() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'BUSCAR TIENDA')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='brickworkApp']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")).sendKeys("Santiago, Santiago Metropolitan, Chile");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[@id='brickworkApp']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[contains(text(),'Nike Ripley Costanera')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[20]/div[2]/div[1]/div[5]/button[1]/span[1]/span[1]")).click();
		Thread.sleep(3000);
		String e = wait
				.until(ExpectedConditions.elementToBeClickable(
						By.xpath("//h1[contains(text(),'Nike Ripley Costanera')]")))
				.getText();
		Assert.assertEquals(e, "Nike Ripley Costanera");

	}
	
	
	
	
	

}
