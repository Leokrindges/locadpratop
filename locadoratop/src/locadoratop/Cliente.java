package locadoratop;

public class Cliente {

	private String nome;
	private int id;
	private String cpf;
	private String endereco;
	
	//metodo construtor
	public Cliente() {
		
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if ((id > 0) && (id <= 100)) {
			this.id = id;
			return;
		} else {
			System.out.println("ID invalido! Digite um ID de 1 a 100");
			return;
		}
	}

}
