package br.ce.jsmribeiro.page;

import org.openqa.selenium.By;

import br.ce.jsmribeiro.core.BasePage;

public class MovimentacaoPage extends BasePage {
	
	public void setDataDaMovimentacao(String dataMov) {
		escrever("data_transacao", dataMov);
	}
	
	public void setDataDoPagamento(String dataPag) {
		escrever("data_pagamento", dataPag);
	}
	
	public void setDescricao(String descricao) {
		escrever("descricao", descricao);
	}
	
	public void setInteressado(String interessado) {
		escrever("interessado", interessado);
	}

	public void setValor(String valor) {
		escrever("valor", valor);
	}
	
	public void setConta(String conta) {
		selecionarCombo("conta", conta);
	}
	
	public void setStatusPago() {
		clicarRadio("status_pago");
	}
	
	public void salvar() {
		clicarBotaoPorTexto("Salvar");
	}
	
	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));

	}
}
