package sample6;

public class LgTv implements Tv{
	 @Override
	   public void powerOn() {
	      System.out.println("LG TV - 전원을 켠다");
	   }
	   @Override
	   public void powerOff() {
	      System.out.println("LG TV - 전원을 끈다");
	   }
	   public void volumeUp() {
	      System.out.println("LG TV - 소리를 높인다");
	   }
	   @Override
	   public void volumeDown() {
	      System.out.println("LG TV - 소리를 줄인다");
	   }
}
