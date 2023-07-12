package br.ce.jsmribeiro.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.jsmribeiro.core.BaseTest;
import br.ce.jsmribeiro.page.MenuPage;
import br.ce.jsmribeiro.page.MovimentacaoPage;

public class MovimentacaoTest extends BaseTest{
	
	private MenuPage menuPage = new MenuPage();
	private MovimentacaoPage movPage = new MovimentacaoPage();
	
	@Test
	public void inserirMovimenta��o() {
		menuPage.acessarMovimentacao();
		
		movPage.setDataDaMovimentacao("23/06/2023");
		movPage.setDataDoPagamento("27/06/2023");
		movPage.setDescricao("Movimenta��o do Teste");
		movPage.setInteressado("Qualquer pessoa");
		movPage.setValor("3000");
		movPage.setConta("Conta de Teste Alterado");
		movPage.setStatusPago();
		movPage.salvar();
		
		Assert.assertEquals("Movimenta��o adicionada com sucesso!", movPage.obterMensagemSucesso());
	}
}
