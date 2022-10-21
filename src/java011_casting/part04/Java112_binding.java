package java011_casting.part04;

public class Java112_binding {

	// 결합도(의존도)가 낮아진다.
	public static void process(HomeTv tv) {
		tv.turnOn();
		tv.soundUp();
		
		if(tv instanceof SamsungTv) {
			SamsungTv stv = (SamsungTv)tv;
			stv.move();
		} else if(tv instanceof LgTv) {
			LgTv ltv = (LgTv)tv;
			ltv.call();	
			}

		}
	
	public static void main(String[] args) {
		
		LgTv lg = new LgTv("LG");
		process(lg);
		
		SamsungTv ss = new SamsungTv("SamgSung");
		process(ss);
		
	}

}
