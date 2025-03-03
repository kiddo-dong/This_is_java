package ch08.gpt.que1;

public class Sound {
	public static void main(String[] args) {
		Animal[] animal = new Animal[3];
		animal[0] = new Cat();
		animal[1] = new Dog();
		animal[2] = new Cow();
		
		for(int i=0; i<animal.length; i++) { 
			System.out.println(animal[i].makeSound());
		}
	}
}
