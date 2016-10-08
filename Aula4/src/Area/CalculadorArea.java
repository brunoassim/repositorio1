package Area;

public class CalculadorArea {
	public static void main(String[] args) {
		AreaCalculavel circulo=new Circulo(5);
		AreaCalculavel quadrado=new Quadrado(4);
		AreaCalculavel retangulo=new Retangulo(4,5);
		System.out.println(calcular(circulo));
		System.out.println(calcular(quadrado));
		System.out.println(calcular(retangulo));
	}
public static double calcular(AreaCalculavel obj){
	return obj.getArea();
	
}
}
