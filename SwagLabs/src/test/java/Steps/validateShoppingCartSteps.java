package Steps;

import PageObject.validateShoppingCartPageObject;
import net.thucydides.core.annotations.Step;

public class validateShoppingCartSteps {

	validateShoppingCartPageObject validateShoppingCartPageObject;
	
	@Step
	public void openApp() {
		validateShoppingCartPageObject.open();
	}
	
	@Step
	public void ingresarCredenciales() {
		validateShoppingCartPageObject.ingresarCredenciales();
	}
	
	@Step
	public void confirmarLogin() {
		validateShoppingCartPageObject.confirmarLogin();
	}
	
	@Step
	public void agregarProducto() {
		validateShoppingCartPageObject.agregarProducto();
	}
	
	@Step
	public void eliminarProducto() {
		validateShoppingCartPageObject.eliminarProducto();
	}
}
