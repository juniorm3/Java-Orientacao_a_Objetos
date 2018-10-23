
public class TestaProjeto {

	public static void main(String[] args) {
		Conta contaMarcela = new Conta(123,456);
//		contaMarcela.titular = new Cliente();
		contaMarcela.setTitular(new Cliente());
//		contaMarcela.titular.nome = "Marcela";
		contaMarcela.getTitular().setNome("Marcela");;
		
//		System.out.println(contaMarcela.titular.nome);
		System.out.println(contaMarcela.getTitular().getNome());
		System.out.println(Conta.getTotal());

	}

}
