package pessoa;

public class PessoaFisica extends Pessoa{
private String cpf;
public PessoaFisica(String nome,String cpf){
	super(nome);
	this.setCpf(cpf);
	
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
}
