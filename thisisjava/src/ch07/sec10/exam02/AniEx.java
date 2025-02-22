package ch07.sec10.exam02;

public class AniEx {
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.sound();
		System.out.print("dog : ");
		d.breathe();
		
		System.out.println();
		
		c.sound();
		System.out.print("cat : ");
		c.breathe();
		
		// AniSound(Ani a = new Dog()); 와 동일
		AniSound(d);
		// AniSound(Ani a = new Cat()); 와 동일
		AniSound(c);
	}
	
	public static void AniSound(Ani a){
		a.sound();
	}
}
