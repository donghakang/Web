package el;

public class Compute {
	public static int sum(String x, String y) {
		int a = 0;
		int b = 0;

		try {
			a = Integer.parseInt(x);
			b = Integer.parseInt(y);
		} catch (Exception e) {

		}

		return a + b;
	}

	public static int multi(String x, String y) {
		int a = 0;
		int b = 0;

		try {
			a = Integer.parseInt(x);
			b = Integer.parseInt(y);
		} catch (Exception e) {

		}

		return a * b;
	}
}
