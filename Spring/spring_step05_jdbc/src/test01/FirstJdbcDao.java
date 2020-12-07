package test01;

public interface FirstJdbcDao {
	/*
	 * execute: 전체 출력 
	 * insert : 추가
	 * delete : 삭제
	 */
	public void execute(String sql);									
	public int insert(String code, String name, int price, String maker); 
	public int delete(String name);
}
