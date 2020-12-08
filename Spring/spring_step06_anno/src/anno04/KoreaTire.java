package anno04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component			//기본값 koreaTire
public class KoreaTire implements Tire {
	
	@Override
	public String getBrand() {
		return "한국타이어";
	}
	
}
