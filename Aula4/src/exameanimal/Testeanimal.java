package exameanimal;

public class Testeanimal {
	public static void main(String[] args) {
		Jacare jacare= new Jacare();
		Baleia baleia=new Baleia();
		Veterinario vet=new Veterinario();
		Humano humano=new Humano();
		vet.examinar(jacare);
		vet.examinar(baleia);
		//vet.examinar(vet);
		//vet.examinar(humano);
	}

}
