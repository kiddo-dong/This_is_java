package ch08.quiz.num7;

public class MySqlDao implements DataAccessObject{
	static final String mysql = "MySql";
	
	@Override
	public void select() {
		System.out.println(mysql + " DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println(mysql + " DB에 삽입");
	}

	@Override
	public void update() {
		System.out.println(mysql + " DB를 수정");
	}

	@Override
	public void delete() {
		System.out.println(mysql + " DB에서 삭제");
	}

}
