package anno02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component  ==> 기본값: myFoodMgr 로 객체 생성 (첫번째 문자만 소문자로 변되어 bean을 만)
@Component(value="myFood")				//<bean id="myFood" class="anno02.MyFoodMgr">와 동일
public class MyFoodMgr {	
	@Autowired							//<bean id="myFood" class="anno02.MyFoodMgr" p:favoriteFood-ref="favoriteFood">
	@Qualifier(value="unfavoriteFood")	// 객체를 바꿔버린다.
	private Food favoriteFood;
	@Autowired							//<bean id="myFood" class="anno02.MyFoodMgr" p:unfavoriteFood-ref="unfavoriteFood">
	private Food unfavoriteFood;		// Autowire는 Setter 를 생략할 수 있다.
	
	/* 
	public void setFavoriteFood(Food favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	
	public void setUnfavoriteFood(Food unfavoriteFood) {
		this.unfavoriteFood = unfavoriteFood;
	}
	*/
	
	@Override
	public String toString() {
		return "MyFoodMgr [좋아하는 음식=" + favoriteFood + ", 싫어하는 음식=" + unfavoriteFood + "]";
	}
}




