package br.com.mildevs.mildevspecaapi.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Peca {
	
	@Id
	@Column(name="codigo_barras",  nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codBarra;
	
	@Column(name = "nome_Peca", nullable = false)
	
	private String nomePeca;
	
	@Column(name = "modelo_do_carro",  nullable = false)
	
	private String modeloCarro;
	
	@Column( nullable = false)
	
	private String nomeFabricante;
	
	@Column( nullable = false)
	private double precoCusto;
	
	@Column( nullable = false)
	private double precoVenda;
	
	@Column( nullable = false)
	private int quantEstoque;
	
	@Column(name = "Tipo_categoria",  nullable = false)
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

	public String getNomeFabricante() {
		return nomeFabricante;
	}

	public void setNomeFabricante(String nomeFabricante) {
		this.nomeFabricante = nomeFabricante;
	}

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

	public String getModeloCarro() {
		return modeloCarro;
	}

	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Peca [codBarra=" + codBarra + ", nomePeca=" + nomePeca + ", modeloCarro="
				+ modeloCarro + ", nomeFabricante=" + nomeFabricante + ", precoCusto=" + precoCusto + ", precoVenda="
				+ precoVenda + ", quantEstoque=" + quantEstoque + ", categoria=" + categoria + "]";
	}

	

	
	
	


	
	
	





}
