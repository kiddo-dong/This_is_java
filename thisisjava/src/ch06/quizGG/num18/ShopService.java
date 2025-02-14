package ch06.quizGG.num18;

public class ShopService {
	private static ShopService singleton = new ShopService(); // 생성자 매개 값 x, 자동생성
	
	// singleton 객체에 대한 생성자
	private ShopService() {
	}
	
	// 정적 클래스타입 메소드
	public static ShopService getInstance() { // getInstance 메소드
		return singleton;
	}
	
	
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("same instance");
		} else {
			System.out.println("other instace");
		}
	}
}
