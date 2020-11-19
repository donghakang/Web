package entity;

public class Product {
	private int no;
	private String item;
	private int price;
	private String regdate;

	/* Constructor */
	public Product() {
		super();
	}
	public Product(int no, String item, int price, String regdate) {
		super();
		this.no = no;
		this.item = item;
		this.price = price;
		this.regdate = regdate;
	}

	/* getter setter */
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getregdate() {
		return regdate;
	}
	public void setregdate(String regdate) {
		this.regdate = regdate;
	}

}
