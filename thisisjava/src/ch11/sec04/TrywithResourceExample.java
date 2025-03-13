package ch11.sec04;

public class TrywithResourceExample {
	public static void main(String[] args) {
		
		// try(open() 및 블록 내용 수행) -> 문장 빠져나감(close() 수행)
		try(MyResource res = new MyResource("A")) {
			String data = res.read1(); // return "100"
			int value = Integer.parseInt(data);
		} catch(Exception e){ // -> try문의 } 종료 시 close 수행됨.(예외발생 x)
			System.out.println("예외처리 : " + e.getMessage()); 
		}
		
		System.out.println("==========================================");
		
		// try(open -> 블록 수행중 예외 발생) -> catch -> catch 수행 후 close() 수행
		try(MyResource res = new MyResource("B")){
			String data = res.read2(); // return "abc"
			int value = Integer.parseInt(data); // abc 이므로 숫자타입이 아니므로 예외 발생
		} catch(Exception e) {
			System.out.println("예외처리 : " + e.getMessage());
		}
	}
}
