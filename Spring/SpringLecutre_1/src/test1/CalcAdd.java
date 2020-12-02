package test1;

public class CalcAdd implements Calc{
	private int a;
	private int b;
	
	public CalcAdd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CalcAdd(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public int calculate() {
		return this.a + this.b;
	}

	@Override
	public String toString() {
		return this.a + " + " + this.b + " = " + this.calculate();
	}
	
	
}
