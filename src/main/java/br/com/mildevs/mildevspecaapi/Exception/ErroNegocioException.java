package br.com.mildevs.mildevspecaapi.Exception;

public class ErroNegocioException extends Exception {
	private static final long serialVersionUID = -6801584901385221248L;
	
	public ErroNegocioException(String mensagem) {
		super(mensagem);
	}

}
