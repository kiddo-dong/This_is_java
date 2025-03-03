package ch08.quiz.num6;

public class SoundableEx {
	
	
	public static void printSound(Soundable sa) {
		System.out.println(sa.sound());
	}
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
