package locadoratop;

public class Filme {
	private String nomeFilme;
	private String genero;
	private String Classificacao;
	private int idFilme;
	private String duracao;
	String situacao;
	
	//metodo construtor
	public Filme(int id){
		this.idFilme = id;		
		
	}

	public void disponibilidade(String situacao) {

		if (this.situacao == "disponivel") {
			System.out.println("Filme Disponivel");
		} else
			System.out.println("Filme Alugado");
	}
	
	public String getDuracao() {
		return duracao;
	}
	
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	public int getIdFilme() {
		return idFilme;
	}
	
	/*public void setIdFilme(int idFilme) {
		if(idFilme > 0  && idFilme <= 1000) {
			this.idFilme = idFilme;
			return;
		}else {
			System.out.println("id filme tem que estar entre 1 e 1000");
		}
		
	}*/
	
	public String getClassificacao() {
		return Classificacao;
	}
	
	public void setClassificacao(String classificacao) {
		Classificacao = classificacao;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getNomeFilme() {
		return nomeFilme;
	}
	
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	

}
