package test03;

import java.util.List;

public interface FirstJdbcDao {
	public void execute(String string);   // 전체보기
	public List<GoodsEntity> listGoods(); // 전체보기2

	public int insert(String code, String name, int price, String maker);	//삽입 
	public int delete(String name); // 삭제 
	public GoodsEntity findGoods(String code); // 검색하기
	public int update(GoodsEntity entity); // 수정하기
}
