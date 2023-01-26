package br.com.mildevs.mildevspecaapi.DTO;

import br.com.mildevs.mildevspecaapi.Entity.Categoria;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public class RetornaPecaDTO {

	private Long codBarra;
	
	@NotBlank()
	private String nomePeca;
	
	
	@NotBlank()
	private String modeloCarro;
	
	
	@NotBlank()
	private String nomeFabricante;
	
	
	@Positive()
	private double precoVenda;
	
	
	@PositiveOrZero()
	private int quantEstoque;
	
	
	@Enumerated(EnumType.STRING)
	private Categoria categoria;


	
	public Long getCodBarra() {
		return codBarra;
	}


	public void setCodBarra(Long codBarra) {
		this.codBarra = codBarra;
	}


	public String getNomePeca() {
		return nomePeca;
	}


	public void setNomePeca(String nomePeca) {
		this.nomePeca = nomePeca;
	}


	public String getModeloCarro() {
		return modeloCarro;
	}


	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}


	public String getNomeFabricante() {
		return nomeFabricante;
	}


	public void setNomeFabricante(String nomeFabricante) {
		this.nomeFabricante = nomeFabricante;
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


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
