package ch08.gpt.que4;


public class OrderProcessor {
	public static void main(String[] args) {
		// 리스트 
		Order[] odrs = {new olineOrder(), new PhoneOrder(), new storeOrder()};
		
		for(Order odr : odrs) {
			System.out.println(odr.placeOrder() + " 주문이 완료되었습니다.");
		}
		
	}
}
