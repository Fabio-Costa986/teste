package steps;

import elementos.Elemento;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodo;

public class Steps {
	
	Metodo met = new Metodo();
	Elemento el = new Elemento();
	
	@Given("que eu esteja no formulario {string}")
	public void que_eu_esteja_no_formulario(String url) {
		
		met.abrirNavegador(url, "Chrome");
		
	   
	}

	@When("preencher os campos obrigatorios")
	public void preencher_os_campos_obrigatorios() throws Throwable {
	   
		met.escrever(el.getNome(), "Teste");
		met.escrever(el.getEmail(), "teste@gmail.com");
		met.clicar(el.getSalvar());
		
		
	}

	@Then("cadastro efetuado")
	public void cadastro_efetuado() throws Throwable {
		
		met.validarCampos();
		met.fechar();
	   
	}

}
