package test3;

public class MyCats {
	private Cat cat;
	private String firstCatName;
	private int firstCatAge;
	private String secondCatName;
	private int secondCatAge;
	
	public void catNameInfo() {
		cat.catName(firstCatName, secondCatName);
	}
	
	public void catAgeInfo() {
		cat.catAge(firstCatAge, secondCatAge);
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public void setFirstCatName(String firstCatName) {
		this.firstCatName = firstCatName;
	}

	public void setFirstCatAge(int firstCatAge) {
		this.firstCatAge = firstCatAge;
	}

	public void setSecondCatName(String secondCatName) {
		this.secondCatName = secondCatName;
	}

	public void setSecondCatAge(int secondCatAge) {
		this.secondCatAge = secondCatAge;
	}
	
	
}
