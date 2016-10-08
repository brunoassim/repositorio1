package funcionarios;

public class FolhaPagamento {
	private double valorTotal = 0;

	public double calcular(Funcionario... funcionarios) {
		for (Funcionario fun : funcionarios) {
			System.out.println(fun.getClass().getSimpleName() + ": "
					+ fun.getNome() + " Salario base:  " + fun.getSalario()
					+ " Salario com bonificação: "
					+ fun.getSalariosComBonificacao()
					+ " Total da bonificação:  "
					+ fun.getPorcentagemAdicional()*fun.getSalario());
			valorTotal += fun.getSalariosComBonificacao();
		}

		return valorTotal;
	}
}
