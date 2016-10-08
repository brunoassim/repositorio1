package exameanimal;

public class Testeanimal {
	public static void main(String[] args) {
		Jacare jacare= new Jacare();
		Baleia baleia=new Baleia();
		Veterinario vet=new Veterinario();
		vet.examinar(jacare);
		vet.examinar(baleia);
	}

}
