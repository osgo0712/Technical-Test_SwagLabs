#Escenario 1
Feature: Swag Labs
  Como usuario deseo validar funcionalidad de "carrito de compras" agregando y eliminando productos
 
	Scenario: Ingresar al home de swag labs y realizar inicio de sesion
   
    Given El usuario abre la pagina de swag labs
    When Ingresa credenciales en los campos "Username" y "Password"
    And Realiza click en btn "Login"
    And Agrega producto al carrito de compras
    Then Realiza eliminacion del producto exitosamente
