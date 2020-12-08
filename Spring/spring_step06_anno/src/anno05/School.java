package anno05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="mySchool")
public class School {
	@Autowired
	@Qualifier(value="person")
	public Student person;
	
	@Autowired
	@Qualifier(value="grade")
	public int grade;
	
	public School() {
		super();
	}

	public School(Student person, int grade) {
		super();
		this.person = person;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "ABC고등학교 [학생정보=" + person.toString() + ", 학년=" + grade + "]";
	}
	
	
}
