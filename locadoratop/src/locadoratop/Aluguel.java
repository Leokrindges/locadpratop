package locadoratop;

public class Aluguel {

	private String locatario;
	private int idAluguel;
	private int diasAlugado;
	private String dataDevolucao;
	private int valorDaDiaria = 5;
	private int total;
	
	//metodo construtor
	public Aluguel() {
		
	}

	public void setDiasLocados(int dias) {
		this.diasAlugado = dias;
	}
	public int getDiasAlugado() {
		return diasAlugado;
	}

	public String getLocatario() {
		return locatario;
	}

	public void setLocatario(String locatario) {
		this.locatario = locatario;
	}

	public int getIdAluguel() {
		return idAluguel;
	}

	public void setIdAluguel(int idAluguel) {
		if(idAluguel > 0 && idAluguel <= 200) {
			this.idAluguel = idAluguel;
			return;
		}else {
			System.out.println("Tem que ser um id entre 1 e 200");
		}
		
		
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public int getValorDaDiaria() {
		return valorDaDiaria;
	}

	public void setValorDaDiaria(int valorDaDiaria) {
		this.valorDaDiaria = valorDaDiaria;
	}

	public int getTotal() {
		this.total = this.diasAlugado * valorDaDiaria;
		return total;
	}


}
