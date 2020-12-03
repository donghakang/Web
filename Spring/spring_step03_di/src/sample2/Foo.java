package sample2;

public class Foo implements InterFoo{
	public Foo() {
		System.out.println("default constructor");
//		System.out.println("--------------------------------");
	}
	
	public Foo(String str) {
		System.out.println(str);
//		System.out.println("--------------------------------");
	}
	
	public Foo(int n, String str) {
		System.out.println(n + " : " + str);
//		System.out.println("--------------------------------");
	}
	
	public Foo(int n, String str, boolean isTrue) {
		System.out.println(n + " : " + str + " : " + isTrue);
//		System.out.println("--------------------------------");
	}
	
	public Foo(Bar bar) {
		System.out.println(bar);
//		System.out.println("--------------------------------");
	}
}
