package sample6;

public class BeanFactory {
	public Tv getBean(String beanName) {
		if(beanName.equals("lg")) {
			return new LgTv();
		}else if(beanName.equals("samsung")) {
			return new SamsungTv();
		}
		return null;
	}
}
