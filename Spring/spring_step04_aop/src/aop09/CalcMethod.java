package aop09;

import org.springframework.stereotype.Component;

@Component(value="calc")
public class CalcMethod {

	public void sum(int a, int b) {
		System.out.println("\t" + a + " + " + b + " = " + (a+b));
	}
	
	public void div(int a, int b) {
		double ans = 0.0;
		
		try {
			ans = a / b;
			System.out.println(a + " / " + b + " = " + ans);
		} catch(Exception e) {
			System.out.println("\t0으로 나눌수 없습니다.");
		}
	}
}
