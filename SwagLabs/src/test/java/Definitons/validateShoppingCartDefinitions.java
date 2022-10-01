package Definitons;

import Steps.validateShoppingCartSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class validateShoppingCartDefinitions {
	
	@Steps
	validateShoppingCartSteps validateShoppingCartSteps;

	@Given("^El usuario abre la pagina de swag labs$")
	public void el_usuario_abre_la_pagina_de_swag_labs() throws Throwable {
		validateShoppingCartSteps.openApp();
	}


	@When("^Ingresa credenciales en los campos \"([^\"]*)\" y \"([^\"]*)\"$")
	public void ingresa_credenciales_en_los_campos_y(String arg1, String arg2) throws Throwable {
		validateShoppingCartSteps.ingresarCredenciales();
	}

	@When("^Realiza click en btn \"([^\"]*)\"$")
	public void realiza_click_en_btn(String arg1) throws Throwable {
		validateShoppingCartSteps.confirmarLogin();
	}

	@When("^Agrega producto al carrito de compras$")
	public void agrega_producto_al_carrito_de_compras() throws Throwable {
		validateShoppingCartSteps.agregarProducto();
	}


	@Then("^Realiza eliminacion del producto exitosamente$")
	public void realiza_eliminacion_del_producto_exitosamente() throws Throwable {
		validateShoppingCartSteps.eliminarProducto();
	}
}
