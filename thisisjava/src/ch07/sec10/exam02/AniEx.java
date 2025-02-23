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
		
		System.out.println();
		
		human choi = new human("최동현");
		choi.sound();
		choi.breathe();
		System.out.println(choi.owner);
	}
	
	public static void AniSound(Ani a){
		a.sound();
	}
}
