package anno03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engineer {
	@Autowired
	@Qualifier(value="emp2")
	private Emp emp;

	@Autowired
	@Qualifier(value="dev_dept")
//	@Resource(name="dev_dept")			// Autowired + Qualifier. --> 버전이 높으면 안된다. (자바 전용)
 	private String dept;
	public Engineer() {
		super();
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return emp.toString() + '\n' + dept + "에 근무합니다.";
	}
	
	
	
}
