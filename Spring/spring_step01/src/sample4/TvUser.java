package sample4;

/*
$ javac TvUser.java   ---> TvUser.class
$ java TvUser  lg       //or  samsung
*/
//결합도가 높다
//정적바인딩(static binding): 컴파일 시점에 호출 함수를 결정한다
public class TvUser {
	public static void main(String[] args) {
		String ob=args[0];
		
		if(ob.equals("samsung")) {
			SamsungTv tv=new SamsungTv();
			tv.powerOn();
			tv.powerOff();
			tv.volumeUp();
			tv.volumeDown();
		}else if(ob.equals("lg")) {
			LgTv tv=new LgTv();
			tv.turnOn();
			tv.turnOff();
			tv.soundUp();
			tv.soundDown();
		}
	}
}






