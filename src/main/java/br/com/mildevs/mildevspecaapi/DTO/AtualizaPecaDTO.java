package br.com.mildevs.mildevspecaapi.DTO;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public class AtualizaPecaDTO {
	@Positive(message = "Não pode ser nulo ou negativo")
	private double precoCusto;
	
	
	@Positive(message = "Não pode ser nulo ou negativo")
	private double precoVenda;
	
	
	@PositiveOrZero(message = "A quantidade não pode ser negativa")
	private int quantEstoque;


	public double getPrecoCusto() {
		return precoCusto;
	}


	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}


	public double getPrecoVenda() {
		return precoVenda;
	}


	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}


	public int getQuantEstoque() {
		return quantEstoque;
	}


	public void setQuantEstoque(int quantEstoque) {
		this.quantEstoque = quantEstoque;
	}
	
	

}
