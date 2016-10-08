package Area;

public class Quadrado implements AreaCalculavel{
	double lado;
	
	public Quadrado(double l){
		lado=l;
	}
	public double getArea() {
		// TODO Auto-generated method stub
		return lado*lado;
	}
}
