package java009_inheritance.prob.part04;

public class HealthRate extends Health {
	double sw;
	double chk;
	String b;
	

	public HealthRate(String name, double height, double weight) {
		super(name, height, weight);

	}

	private double standardHealth() {
		// 표준체중 로직구현을 구현하세요.
		sw = (height-100) * 0.9; 
		System.out.println(sw);

		return sw;
	}

	private String rateCheck() {
		// 비만도를 로직구현을 구현하세요
		standardHealth();
		chk = (weight-sw)/(sw/100);
		System.out.println(chk);

		if(chk>=20) {
			b = "비만"; }
		else if (chk>=10 && chk<20) {
			b = "과체중"; }
		else b = "정상";
		return b;
	}

	// prn()메소드 오버라이딩
	@Override
	public void prn() {
		System.out.printf("%s님의 신장 %.0f , 몸무게 %.0f  %s입니다.\n", name, height, weight, rateCheck());
	}

}// end HealthRate