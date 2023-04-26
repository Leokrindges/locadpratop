package locadoratop;

public class Locadora {

	private Cliente cliente;
	private Filme filmes;
	private String situacao;
	private Aluguel alugueis;
	
	
	public Locadora() {
		
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Filme getFilmes() {
		return filmes;
	}
	public void setFilmes(Filme filmes) {
		this.filmes = filmes;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public Aluguel getAlugueis() {
		return alugueis;
	}
	public void setAlugueis(Aluguel alugueis) {
		this.alugueis = alugueis;
	}	

}
