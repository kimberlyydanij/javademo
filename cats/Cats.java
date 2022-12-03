package cats;

public class Cats {

	   // 학생 클래스의 속성을 멤버 변수로 선언하고 메서드를 구현한다
	
		public int catId;
		public String catName;
		public String address;
		
		public void showCatInfo() {
			System.out.println(catName + "," + address);
		} // end catInfo
		
		public String getCatName() {
			return catName;
		} // end getCatName
		
	
} // end class
