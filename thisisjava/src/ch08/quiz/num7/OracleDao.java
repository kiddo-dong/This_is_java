package ch08.quiz.num7;

public class OracleDao implements DataAccessObject{
	static final String oracle= "Oracle";
	
	@Override
	public void select() {
		System.out.println(oracle + " DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println(oracle + " DB에 삽입");
	}

	@Override
	public void update() {
		System.out.println(oracle + " DB를 수정");
	}

	@Override
	public void delete() {
		System.out.println(oracle + " DB에서 삭제");
	}

}
