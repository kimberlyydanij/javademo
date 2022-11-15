package java009_inheritance.part08;

public class Java099_inheritance {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		fe.setWater(1000);
		fe.setSpeed(100);
		fe.setColor("Red");
		fe.waterSpread();
		System.out.println(fe.toString());
	
		OwnerEngine oe = new OwnerEngine();
		oe.setSeat(8);
		oe.information();
		oe.setSpeed(80);
		oe.setColor("Black");
		System.out.println(oe.toString());
		
	} //end main

} // end class
