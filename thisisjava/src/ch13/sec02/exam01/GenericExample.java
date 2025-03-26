package ch13.sec02.exam01;

public class GenericExample {
	public static void main(String[] args) {
		Product<Tv, String> pd1= new Product<>();
		pd1.setkind(new Tv());
		pd1.setmodel("smart Tv");
		
		Tv t = pd1.getkind();
		String tvModel = pd1.getmodel();
		System.out.println(t);
		System.out.println(tvModel);
		
		
		Product<Car, String> pd2 = new Product<>();
		pd2.setkind(new Car());
		pd2.setmodel("suv");
		
		Car c = pd2.getkind();
		String carModel = pd2.getmodel();
		System.out.println(c);
		System.out.println(carModel);
	}
}
