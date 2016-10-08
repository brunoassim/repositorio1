package equipamento;

public class TestaEquipamento {

	public static void main(String args[]) {
		Equipamento impressora = new Impressora("fabricante", 500);
		Equipamento tv = new Televisao("fabricante", 400);
		Equipamento cadeira = new Cadeira("fabricante", 300);
		System.out.println(imprimePrecoFinais(impressora,tv,cadeira));
		// Teclado teclado =new Teclado("fabricante", 100, "pt/br");
		// teclado.getTeclado();
	}
	
	public static double imprimePrecoFinais(Equipamento... equipamentos){
		double valorTotal=0;
		for(Equipamento equipamento:equipamentos){
			System.out.println(equipamento.getClass().getSimpleName()+": "+equipamento.calcularPrecoFinal());
			valorTotal+=equipamento.calcularPrecoFinal();
		}
		
		return valorTotal;
	}
}
