package exameanimal;

public class Veterinario extends Humano {
	
	public void examinar(Examinavel animal){
		//if(animal instanceof Humano){
		//	throw new IllegalArgumentException("nao posso examinar Humanos");
		//}
		animal.examinar());
	}

}
