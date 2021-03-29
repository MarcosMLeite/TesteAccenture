package Teste;

import Elementos.FormularioScreen;
import Metodos.FormularioAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FormularioTeste {
	FormularioScreen screen = new FormularioScreen();
	FormularioAction action = new FormularioAction();
	
	@Given("^Que acesse o site \"([^\"]*)\"$")
	public void que_acesse_o_site(String arg1) throws Throwable {
		action.abrirNavegador(arg1);
	}

	@When("^Preencho todos os formularios$")
	public void preencho_todos_os_formularios() throws Throwable {
		action.click(screen.make);
		action.esperar(2000);
		action.click(screen.marca);
		action.click(screen.model);
		action.click(screen.modelo);
		action.preencherFormulario(screen.cylinder, "1000");
		action.preencherFormulario(screen.engine, "200");
		action.scrollVertical(screen.date);
		action.click(screen.date);
		action.esperar(3000);
		action.click(screen.dia);
		action.click(screen.numberSeats);
		action.click(screen.number);
		action.click(screen.no);
		action.click(screen.Seats);
		action.click(screen.numero);
		action.click(screen.fuelType);
		action.click(screen.fuel);
		action.preencherFormulario(screen.Payload, "900");
		action.preencherFormulario(screen.totalWeight, "700");
		action.preencherFormulario(screen.listPrice, "2000");
		action.preencherFormulario(screen.license, "1020");
		action.preencherFormulario(screen.annual, "2020");
		action.click(screen.next);
		action.esperar(2000);
		action.preencherFormulario(screen.firstName, "Marc");
		action.preencherFormulario(screen.lastName, "Moreira");
		action.preencherFormulario(screen.Aniversario, "02/21/1978");
		action.click(screen.sexo);
		action.preencherFormulario(screen.streetAddress, "av Autonomistas");
		action.click(screen.país);
		action.scrollVertical(screen.country);
		action.click(screen.country);
		action.preencherFormulario(screen.zipCode, "06020010");
		action.preencherFormulario(screen.city, "Osasco");
		action.click(screen.occupation);
		action.click(screen.official);
		action.esperar(2000);
		action.click(screen.hobbies);
		action.preencherFormulario(screen.website, "www.google.com");
		action.click(screen.next1);
		action.preencherFormulario(screen.startDate, "05/23/2021");
		action.click(screen.Insurance);
		action.click(screen.valor);
		action.click(screen.bonus);
		action.esperar(2000);
		action.click(screen.damage);
		action.click(screen.damageInsurence);
		action.click(screen.optionalProduct);
		action.click(screen.courtesy);
		action.click(screen.car);
		action.click(screen.next3);
		action.esperar(2000);
		action.click(screen.silver);
		action.scrollVertical(screen.next4);
		action.click(screen.next4);
		action.esperar(3000);
	    
	}

	@Then("^Formulario enviado com sucesso$")
	public void formulario_enviado_com_sucesso() throws Throwable {
		action.preencherDados("mmljas@bol.com.br", "5511974983032", "maguana", "Ma270314", "Ma270314");
		action.click(screen.btnEnviar);
		action.esperar(9000);
		action.ElementExists(screen.btnMsg, "Sending e-mail success!");
		action.screenShot("Sending e-mail success!");
		action.fecharBrowser();
	   
	}
}
