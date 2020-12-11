package model;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDao {
	public String getHello() {
		return "HelloDao가 호출됨";
	}
}
