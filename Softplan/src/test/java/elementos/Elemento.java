package elementos;

import org.openqa.selenium.By;

public class Elemento {
	
	private By nome = By.id("nome");
	private By email = By.id("mail");
	private By salvar = By.id("button");
	
	
	public By getNome() {
		return nome;
	}
	public By getEmail() {
		return email;
	}
	public By getSalvar() {
		return salvar;
	}
	
	
	
	
	

}
