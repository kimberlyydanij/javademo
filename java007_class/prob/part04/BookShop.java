package java007_class.prob.part04;

public class BookShop {
	//멤버변수
	String title;
	String code;
	int price;

	BookShop(String title, String code, int price) {
		this.title = title;
		this.code = code;
		this.price = price;
	}
	
	public String toString() {
		return String.format("%5s %8d",code,price);
	}
}//end class
