package poly;

public class MainController {
	public static void main(String[] args) {
		
		ConsoleView aView = new ConsoleView();

		Speakable anAnimal1 = new Animal();
		Speakable aDog1 = new Dog();
		Speakable aDuck1 = new Duck();
		
		aView.print("anAnimal1 says: " + anAnimal1.speak());
		aView.print("aDog1 says: " + aDog1.speak());
		aView.print("aDuck1 says: " + aDuck1.speak());

	}
}
