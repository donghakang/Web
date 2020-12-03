package sample6;

public class Developer extends Emp{
	private String dept;

	public Developer() {
		super();
	}

	public Developer(String name, int salary) {
		super(name, salary);
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString() + "\t부서: " + dept;
	}
	
	
}
