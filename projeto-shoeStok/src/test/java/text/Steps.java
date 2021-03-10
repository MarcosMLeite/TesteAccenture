package text;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elementos.Elementos;
import pages.Metodos;

public class Steps {

	Metodos gu = new Metodos();
	Elementos ma = new Elementos();
	
		
	

	@Given("^acesso site \"([^\"]*)\"$")
	public void acesso_site(String arg1) throws Throwable {
		gu.abrirNavegador(arg1);
	}

	@When("^pesquiso \"([^\"]*)\"$")
	public void pesquiso(String arg1) throws Throwable {
		gu.esperar(6000);
		gu.preencher(ma.btnPesquisar, arg1);
		gu.esperar(6000);
		gu.clicar(ma.btnLupa);
		gu.clicar(ma.btnShoe);
		gu.clicar(ma.btnNumeroSapato);
		gu.esperar(4000);
	}

	@Then("^coloco  o sapato na sacola$")
	public void coloco_o_sapato_na_sacola() throws Throwable {
	    
		gu.clicar(ma.btnComprar);
		gu.esperar(4000);
		gu.validarTexto(ma.btnCarrinho, "Meu carrinho");
		gu.validarElementExists(ma.btnResumo, "Resumo da compra");
		gu.screenShot("Sapato Social Couro Shoestock Cadarço Masculino");
		gu.fecharBrowser();
	}
	@When("^coloco na sacola$")
	public void coloco_na_sacola() throws Throwable {
		gu.clicar(ma.btnComprar);
		gu.esperar(4000);
		
	   
	}

	@Then("^excluo da sacola$")
	public void excluo_da_sacola() throws Throwable {
	   gu.clicar(ma.btnExcluirSacola);
	   gu.esperar(5000);
	   gu.validarElementExists(ma.btnCarrinhoVazio, "Seu carrinho está vazio");
	   gu.fecharBrowser();
	}
}
