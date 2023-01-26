package br.com.mildevs.mildevspecaapi.DTO;

import org.springframework.beans.BeanUtils;

import br.com.mildevs.mildevspecaapi.Entity.Categoria;
import br.com.mildevs.mildevspecaapi.Entity.Peca;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public class CriarPecaDTO {
	
	
	@NotBlank()
	private String nomePeca;
	
	
	@NotBlank()
	private String modeloCarro;
	
	
	@NotBlank()
	private String nomeFabricante;
	
	
	@Positive(message = "Não pode ser nulo ou negativo")
	private double precoCusto;
	
	
	@Positive(message = "Não pode ser nulo ou negativo")
	private double precoVenda;
	
	
	@PositiveOrZero(message = "A quantidade não pode ser negativa")
	private int quantEstoque;
	
	
	@Enumerated(EnumType.STRING)
	private Categoria categoria;
	
	
	public Peca toEntity() {
		Peca peca = new Peca();
		BeanUtils.copyProperties(this, peca);
		return peca;
		
	}
	
	
	
}
