package PageObject;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

@DefaultUrl ("https://www.saucedemo.com/")

public class validateShoppingCartPageObject extends PageObject{

	//VARIABLES GLOBALES
	String user, pass;

	//CREACION ELEMENTOS
	static By texUser = generalElements.texUser.getValor_campo();
	static By textPass = generalElements.textPass.getValor_campo();
	static By inputUser = generalElements.inputUser.getValor_campo();
	static By inputPass = generalElements.inputPass.getValor_campo();
	static By btnLogin = generalElements.btnLogin.getValor_campo();
	static By addPro = generalElements.addPro.getValor_campo();
	static By cart = generalElements.cart.getValor_campo();
	static By deletePro = generalElements.deletePro.getValor_campo();


	@WhenPageOpens
	public void maximiseScreen() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(),200);
		getDriver().manage().window().maximize();
		Thread.sleep(1000);
	}

	public void ingresarCredenciales() {

		try {
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(getDriver(),200);
			wait.until(ExpectedConditions.visibilityOfElementLocated(texUser));
			
			//VALIDACION ELEMENTO USER VISIBLE
			find(texUser).isVisible();
			user = find(texUser).getText().substring(24,37);
			System.out.println("***************************************************************************************");
			System.out.println("[SwagLabs.com] - NOMBRE DE USUARIO: "+user);
			System.out.println("***************************************************************************************");
			
			//VALIDACION ELEMENTO PASS VISIBLE
			find(textPass).isVisible();
			pass = find(textPass).getText().substring(24,36);
			System.out.println("***************************************************************************************");
			System.out.println("[SwagLabs.com] - CONTRASEÑA: "+pass);
			System.out.println("***************************************************************************************");
			
			//VALIDACION ELEMENTO INPUT USER
			find(inputUser).isVisible();
			Thread.sleep(1000);
			find(inputUser).clear();
			Thread.sleep(1000);
			find(inputUser).sendKeys(user);
			
			//VALIDACION ELEMENTO INPUT PASS
			find(inputPass).isVisible();
			Thread.sleep(1000);
			find(inputPass).clear();
			Thread.sleep(1000);
			find(inputPass).sendKeys(pass);
			
			
		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[SwagLabs.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
			
		}

	}
	
	public void confirmarLogin() {

		try {
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(getDriver(),200);
			wait.until(ExpectedConditions.visibilityOfElementLocated(btnLogin));
			
			//VALIDACION ELEMENTO USER VISIBLE
			find(btnLogin).isVisible();
			find(btnLogin).click();

			
		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[SwagLabs.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}
	}
	
	public void agregarProducto() {

		try {
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(getDriver(),200);
			wait.until(ExpectedConditions.visibilityOfElementLocated(addPro));
			find(addPro).isVisible();
			find(addPro).click();
			
		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[SwagLabs.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}
	}
	
	public void eliminarProducto() {

		try {
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(getDriver(),200);
			wait.until(ExpectedConditions.visibilityOfElementLocated(cart));
			find(cart).isVisible();
			find(cart).click();
			Thread.sleep(3000);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(deletePro));
			find(deletePro).isVisible();
			find(deletePro).click();
			System.out.println("***************************************************************************************");
			System.out.println("[SwagLabs.com] - CASO DE PRUEBA EXITOSO");
			System.out.println("***************************************************************************************");

			
		}catch(Exception e) {
			System.out.println("***************************************************************************************");
			System.out.println("[SwagLabs.com] - ERROR: "+e.getMessage());
			System.out.println("***************************************************************************************");

			fail();
		}
	}
}
