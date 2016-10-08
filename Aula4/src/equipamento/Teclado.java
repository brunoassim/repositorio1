package equipamento;

public class Teclado extends Equipamento {
	public Teclado(String fabricante, double preco, String layout) {
		super(fabricante, preco);
		this.layout = layout;
		// TODO Auto-generated constructor stub
	}

	private String layout;

	public void getTeclado() {
		System.out.println(layout);
	}

}
