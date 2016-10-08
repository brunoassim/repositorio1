package funcionarios;

public class Funcionarios {
	public static void main(String[] args) {

		Gerente gerente = new Gerente("Pedro", 1000);
		Supervisor supervisor = new Supervisor("Paulo", 800);
		Secretaria secretaria = new Secretaria("Joana", 500);
		FolhaPagamento folha = new FolhaPagamento();
		System.out.println("Valor total a ser pago aos funcionarios: "
				+ folha.calcular(gerente, supervisor, secretaria));
	}
}
