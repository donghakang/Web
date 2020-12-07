package test02;

import java.util.List;

public interface FirstJdbcDao {
	public List<GoodsEntity> listGoods(); // 전체보기2

	public GoodsEntity findGoods(String code); // 검색하기

	public int update(GoodsEntity entity); // 수정하기
}
