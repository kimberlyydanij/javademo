package java017_collection;

public class Sawon {
	private String name;
	private int one;
	private int two;
	private int three;
	
	public Sawon() {
	}

	public Sawon(String name, int one, int two, int three) {
		super();
		this.name = name;
		this.one = one;
		this.two = two;
		this.three = three;
	}
	
	private int jumsuTotal() {
		
		return one+two+three;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOne() {
		return one;
	}

	public void setOne(int one) {
		this.one = one;
	}

	public int getTwo() {
		return two;
	}

	public void setTwo(int two) {
		this.two = two;
	}

	public int getThree() {
		return three;
	}

	public void setThree(int three) {
		this.three = three;
	}

	public String toString() {
		return String.format("%5s, %5d %5d %5d %7d",name,one,two,three,jumsuTotal());
	}
}
