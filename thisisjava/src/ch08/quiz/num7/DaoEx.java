package ch08.quiz.num7;

import 	java.util.Scanner;

public class DaoEx {
	// 정적 메소드 (매개변수 Interface 타입)
	public static void dbWork(DataAccessObject dao) {
		if(dao instanceof OracleDao oracle_db) {
			oracle_db.select();
			oracle_db.insert();
			oracle_db.update();
			oracle_db.delete();
		} else if(dao instanceof MySqlDao mysql_db) {
			mysql_db.select();
			mysql_db.insert();
			mysql_db.update();
			mysql_db.delete();
		}
		else {
			System.out.println("잘못된 입력 입니다.");
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("사용할 데이터 베이스 선택");
		System.out.println("| 1.Orecle | 2.MySql |");
		
		System.out.print("입력> ");
		int num = in.nextInt();
		
		switch(num) {
			case 1:	
				dbWork(new OracleDao());
				break;
				
			case 2:
				dbWork(new MySqlDao());
				break;
				
			default :
				System.out.println("잘못된 입력 입니다.");
				break;
		}
		
		
	}
}
