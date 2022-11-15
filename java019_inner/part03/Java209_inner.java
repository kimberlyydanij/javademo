package java019_inner.part03;

// 지역변수에서 메소드를 호출하려면 final이 붙어있어야 한다..?
// 매개변수는 내부클래스에서 사용하던지, 메소드에서만 사용하던지 한가지만
// 으로 사용해야 한다.

public class Java209_inner {

	public static void main(String[] args) {
		OuterLocal outer = new OuterLocal();
		outer.call(100);

	} // end main

} // end class
