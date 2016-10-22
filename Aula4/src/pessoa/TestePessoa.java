package pessoa;

public class TestePessoa {
	public static void main(String args[]) {
		PessoaFisica pessoaf = new PessoaFisica("Bruno", "092.092.092-08");
		PessoaJuridica pessoaj = new PessoaJuridica("DexaTranning",
				"1234.1234.4321-09");
		System.out.println(pessoaf.getNome() + pessoaf.getCpf());
		System.out.println(pessoaj.getNome() + pessoaj.getCnpj());
	}

}
