package Area;

public class Circulo implements AreaCalculavel{

	
	double raio;
	public Circulo(double r){
		raio=r;
	}
	public double getArea() {
		return raio*raio*Math.PI;
		// TODO Auto-generated method stub
		}

}
