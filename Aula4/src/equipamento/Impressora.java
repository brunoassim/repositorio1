package equipamento;

public class Impressora extends Eletronico {
	private int pontosPorPolegada;

	public int getPontosPorPolegada() {
		return pontosPorPolegada;
	}

	public void setPontosPorPolegada(int pontosPorPolegada) {
		this.pontosPorPolegada = pontosPorPolegada;
	}

	public Impressora(String fabricante, double preco) {
		super(fabricante, preco);
	}

	public void imprimir() {
		System.out.println("imprimindo");
	}
	/*public double calcularPrecoFinal(){
		return super.getPreco()*1.02;
	}*/
	
}
