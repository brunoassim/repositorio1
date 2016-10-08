package Area;

public class Retangulo implements AreaCalculavel {
double largura,altura;
public Retangulo(double a, double b){
	largura=a;
	altura=b;
}
@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return largura*altura;
	}

}
