package java010_abstract_interface.part04;

public interface CarRun {
	int carCoun = 5;  //public static final carCount = 5;
	//public CarRun() {}
	//static {System.out.println("CarRun"); }
	void prn(); //abstract public
	//void display() {}
	class Sun{  //public  static class Sun {
		public Sun() {
		  System.out.println("Sun Constructor");
		}
	}
}
