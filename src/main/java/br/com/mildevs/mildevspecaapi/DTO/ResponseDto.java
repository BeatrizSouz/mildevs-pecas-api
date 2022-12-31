package br.com.mildevs.mildevspecaapi.DTO;

public class ResponseDto {
	private String mensagem;

	public ResponseDto(String mensagem) {
		
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	

}
