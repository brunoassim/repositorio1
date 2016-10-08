package equipamento;

public class Eletronico extends Equipamento{

	public Eletronico(String fabricante, double preco) {
		super(fabricante, preco);
		// TODO Auto-generated constructor stub
	}

	public double calcularPrecoFinal(){
		return super.getPreco()*1.10;
	}

}
