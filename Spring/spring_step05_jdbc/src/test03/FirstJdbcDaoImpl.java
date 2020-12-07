package test03;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class FirstJdbcDaoImpl extends JdbcDaoSupport implements FirstJdbcDao {

	// 전체보기 1 (익명 중첩 클래스) --------------------------------------
	@Override
	public void execute(String sql) {
		System.out.println("교재코드		교재		가격		출판사 ");
		System.out.println("-----------------------------------");
		
		RowMapper<GoodsEntity> mapper = new RowMapper<GoodsEntity>() {
			@Override
			public GoodsEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
				String code=rs.getString("CODE");
	            String name=rs.getString("NAME");
	            int price=rs.getInt("PRICE");
	            String maker=rs.getString("MAKER");
	            
	            System.out.printf("%s  %s  %d  %s\n",code,name,price,maker);
	            return null;
			}
		};
		super.getJdbcTemplate().query(sql, mapper);
	}

	// 전체보기 2 (중첩클래스) --------------------------------------------
	@Override
	public List<GoodsEntity> listGoods() {
		RowMapper<GoodsEntity> rowMapper = new GoodsRowMapperEx();
		return super.getJdbcTemplate().query("SELECT * FROM GOODSINFO", rowMapper);
	}

	// 중첩 클래스 : FirstJdbcDaoImpl$GoodsRowMapperEx.class
	public class GoodsRowMapperEx implements RowMapper<GoodsEntity> {

		@Override
		public GoodsEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
			GoodsEntity entity = new GoodsEntity();
			entity.setCode(rs.getString("CODE"));
			entity.setName(rs.getString("NAME"));
			entity.setPrice(rs.getInt("PRICE"));
			entity.setMaker(rs.getString("MAKER"));

			return entity;
		}
	}

	// 추가하기 --------------------------------------------------------
	@Override
	public int insert(String code, String name, int price, String maker) {
		return super.getJdbcTemplate().update("INSERT INTO GOODSINFO(CODE,NAME,PRICE,MAKER) VALUES(?,?,?,?)",
				new Object[] { code, name, price, maker });
	}

	// 삭제하기 --------------------------------------------------------
	@Override
	public int delete(String name) {
		// TODO Auto-generated method stub
		return super.getJdbcTemplate().update("DELETE FROM GOODSINFO WHERE NAME=?", new Object[] { name });
	}

	// 검색 ----------------------------------------------------------
	@Override
	public GoodsEntity findGoods(String code) {
		RowMapper<GoodsEntity> mapper = new RowMapper<GoodsEntity>() {
			@Override
			public GoodsEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
				GoodsEntity entity = new GoodsEntity();
				entity.setCode(rs.getString("CODE"));
				entity.setName(rs.getString("NAME"));
				entity.setPrice(rs.getInt("PRICE"));

				entity.setMaker(rs.getString("MAKER"));

				return entity;
			}
		};
		return super.getJdbcTemplate().queryForObject("SELECT * FROM GOODSINFO WHERE CODE=?", mapper, code);
	}

	// 수정 ----------------------------------------------------------
	@Override
	public int update(GoodsEntity entity) {
		return super.getJdbcTemplate().update("UPDATE GOODSINFO SET NAME=?, PRICE=?, MAKER=? WHERE CODE=?",
				new Object[] { entity.getName(), entity.getPrice(), entity.getMaker(), entity.getCode() });

	}

}
