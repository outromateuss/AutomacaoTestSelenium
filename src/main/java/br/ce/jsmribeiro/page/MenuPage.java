package br.ce.jsmribeiro.page;

import br.ce.jsmribeiro.core.BasePage;

public class MenuPage extends BasePage {
	
	public void acessarTelaInserirConta(){
		clicarLink("Contas");
		clicarLink("Adicionar");
	}

	public void acessarTelaListarConta() {
		clicarLink("Contas");
		clicarLink("Listar");
	}
	
	public void  acessarMovimentacao() {
		clicarLink("Criar Movimentação");
	}

}
