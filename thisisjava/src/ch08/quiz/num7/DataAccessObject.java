package ch08.quiz.num7;

public interface DataAccessObject {
	// 데이터 베이스 추상 메소드 생성
	void select();
	void insert();
	void update();
	void delete();
}
