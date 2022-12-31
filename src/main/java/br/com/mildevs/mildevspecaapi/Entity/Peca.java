package br.com.mildevs.mildevspecaapi.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


@Entity
public class Peca {
	
	@Id
	@Column(name="codigo_barras",  nullable = false)
	@NotNull(message = "O código de barras não pode ser nulo")
	private Long codBarra;
	
	@Column(name = "nome_Peca", nullable = false)
	@NotBlank(message = "O nome da Peca deve ser preenchida")
	private String nomePeca;
	
	@Column(name = "modelo_do_carro",  nullable = false)
	@NotBlank(message = "O modelo do carro deve ser preenchido")
	private String modeloCarro;
	
	@Column( nullable = false)
	@NotBlank(message = "O nome do fabricante deve ser preenchido")
	private String nomeFabricante;
	
	@Column( nullable = false)
	@NotNull(message = "O preço não pode ser nulo")
	private double precoCusto;
	
	@Column( nullable = false)
	@NotNull(message = "O preço de venda não pode ser nulo")
	private double precoVenda;
	
	@Column( nullable = false)
	@NotNull(message = "A quantidade de estoque não pode ser nula")
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
