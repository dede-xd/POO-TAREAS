package ClaseAbs;

public class Main {
	public static void main(String[] args) {
		
		Humano humano1 = new Humano();
		Animal animalC = new AnimalCarnivoro();
		Animal animalH = new AnimalHervivoro();
		
		humano1.Comer();
		animalC.Comer();
		animalH.Comer();
	}
}
