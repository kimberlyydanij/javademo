package cats;

public class CatsTest {


// 학생 클래스를 생성하여 생성된 객체(인스턴스)에 각각 다른 이름과
//  주소를 대입한다.

public static void main(String[] args) {
	
			Cats cat1 = new Cats();
		cat1.catName = "로또";
		
		cat1.address = "천호동";
		
		cat1.showCatInfo();
		
		Cats cat2 = new Cats();
		cat2.catName = "미미";
		cat2.address = "고덕동";
		
		cat2.showCatInfo();
									
} // end main
} // end class
