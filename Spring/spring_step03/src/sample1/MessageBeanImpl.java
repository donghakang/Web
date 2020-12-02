package sample1;

public class MessageBeanImpl implements MessageBean {
	private String fruit;
	private int cost;
	
	
	
	public MessageBeanImpl(String fruit) {
		super();
		this.fruit = fruit;
		System.out.println(fruit + " MessageBeanImpl 생성자 호출 ");
	}

	public void setCost(int cost) {
		this.cost = cost;
		System.out.println("STATUS: setCost()");
	}


	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println(this.fruit + "\t" + this.cost);
	}

	@Override
	public void sayHello(String a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a + "\t" + b);
	}

}
