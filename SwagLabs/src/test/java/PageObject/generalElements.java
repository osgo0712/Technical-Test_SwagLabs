package PageObject;

import org.openqa.selenium.By;

public enum generalElements {

	//FEATURE INICIO DE SESION
	texUser (By.xpath("//div[@class='login_credentials']")),
	textPass (By.xpath("//div[@class='login_password']")),
	inputUser (By.xpath("//*[@id=\"user-name\"]")),
	inputPass (By.xpath("//*[@id=\"password\"]")),
	btnLogin (By.xpath("//*[@id=\"login-button\"]")),
	addPro (By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory'])[position()=1]")),
	cart (By.xpath("//div[@class='shopping_cart_container']")),
	deletePro (By.xpath("//button[@class='btn btn_secondary btn_small cart_button']"));
	
	
	//FEATURE ADD TO CAR
	
	private By valor_campo;

	private generalElements(By valor_campo) {
		this.valor_campo = valor_campo;
	}

	public By getValor_campo() {
		return valor_campo;
	}

	public void setValor_campo(By valor_campo) {
		this.valor_campo = valor_campo;
	}
}
