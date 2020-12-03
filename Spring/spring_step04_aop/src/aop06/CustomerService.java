package aop06;

import org.springframework.stereotype.Component;

// 기본값: customerService --> 하지만 main 에서는 customer로 접근한다.
// 							 그래서 value 값을 넣어준다.
@Component(value="customer")
public class CustomerService implements Person{
	
	@Override
	public void work() {
	
		System.out.println( "고객 서비스 진행");

	}
}
