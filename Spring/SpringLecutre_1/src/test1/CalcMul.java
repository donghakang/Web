package test1;

public class CalcMul implements Calc{
	private int a;
	private int b;
	public CalcMul() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CalcMul(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
	@Override
	public String toString() {
		return this.a + " + " + this.b + " = " + this.calculate();
	}
	
	@Override
	public int calculate() {
		return this.a * this.b;
	}
	
}
