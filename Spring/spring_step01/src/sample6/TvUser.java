package sample6;

/*
$ javac TvUser.java   ---> TvUser.class
$ java TvUser  lg       //or  samsung
*/
//결합도가 높다
//정적바인딩(static binding): 컴파일 시점에 호출 함수를 결정한다
public class TvUser {
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		Tv tv=(Tv)factory.getBean(args[0]);
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}
}






