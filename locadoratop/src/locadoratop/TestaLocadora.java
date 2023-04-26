package locadoratop;

public class TestaLocadora {

	public static void main(String[] args) {
		
		//criei uma referncia locadora para a classe locadora
		Locadora locadora = new Locadora();
		
		//criei uma refrencia cliente para a classe cliente
		Cliente cliente = new Cliente();
		//criei um metodo que que aponta
		//do atributo cliente para o objeto cliente 
		locadora.setCliente(cliente);
	
		cliente.setNome("Leoanardo");
		cliente.setCpf("111.111.111-11");
		cliente.setEndereco("Brasil");
		
		//criei uma refrencia cliente para
		//a classe Filme que passa o valor 50 para o construtor
		Filme filmes = new Filme(50);
		//criei um metodo que que aponta
		//do atributo Filmes para o objeto filmes
		locadora.setFilmes(filmes);
		filmes.setNomeFilme("Praticando Composição de Objetos");
		filmes.setClassificacao("Livre");
		filmes.setDuracao("1h45min");
		filmes.setGenero("Educacional");
		filmes.situacao = "alugado";
		
		//criei uma refrencia cliente para a classe Aluguel
		Aluguel dvds = new Aluguel();
		
		//criei um metodo que que aponta
		//do atributo Alugueis para o objeto dvds
		locadora.setAlugueis(dvds);
		dvds.setIdAluguel(154);
		dvds.setLocatario(cliente.getNome());
		dvds.setDataDevolucao("28 de Janeiro de 2023");
		// dvds.quantidade = 1;
		dvds.setDiasLocados(3);
	
		//imprime os dados
		System.out.println(" DADOS DO CLIENTE");
		System.out.println("------------------");
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("CPF :" + cliente.getCpf());
		System.out.println("Endereço: " + cliente.getEndereco());

		System.out.println();
		System.out.println(" DADOS DO FILME");
		System.out.println("----------------");
		System.out.println("Nome do Filme: " + filmes.getNomeFilme());
		System.out.println("ID do filme: " + filmes.getIdFilme());
		System.out.println("Classificação Etaria: " + filmes.getClassificacao());
		System.out.println("Duração: " + filmes.getDuracao());
		System.out.println("Genero: " + filmes.getGenero());

		System.out.println();
		System.out.println(" SITUAÇÃO DO FILME");
		System.out.println("--------------------");
		System.out.println("Nome do Filme: " + filmes.getNomeFilme());
		filmes.disponibilidade(filmes.situacao);
		System.out.println("Locatario: " + dvds.getLocatario());
		System.out.println("Id do filme: " + filmes.getIdFilme());
		System.out.println("Total pago pelas: " + dvds.getDiasAlugado() + " diarias é de R$" + dvds.getTotal());
		System.out.println("Data de devolução: " + dvds.getDataDevolucao());
	}

}
