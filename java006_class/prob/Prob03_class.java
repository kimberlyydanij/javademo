package java006_class.prob;
/*
 * draw()메소드를   [실행결과]를 참조하여 구현하세요.
 * 
 * [실행결과]
 * &&&&&&&&&&
 * %%%%%%%%%%%%%%%%%%%%
 * %%%%%%%%%%%%%%%%%%%%
 * %%%%%%%%%%%%%%%%%%%%
 */

class Box {
	private int width, height; // 박스의 너비와 높이
	private char fillChar; // 박스를 그리는 데 사용하는 문자

	public Box() { // 매개 변수 없는 생성자
		this(10, 1); // this() 이용
	}

	public Box(int width, int height, char fillChar) { // 너비외 높이의 2 매개 변수를 가진 생성자
		this.width = width;
		this.height = height;
	}

	public void draw() { // 박스 그리는 메소드
		///////////// 여기에서 구현하세요.

		for(int i=0;i<this.height;i++) {
			for(int j=0;j<this.width;j++) {
				System.out.printf("%c",this.fillChar);
	
			} // end j
			System.out.println();
		} // end i
		

	}// end draw()

	public void fill(char c) { 
		// 박스를 그리는데 사용하는 문자 설정
		this.fillChar = c;
		
	}//end fill( )
}//end class

public class Prob03_class {

	public static void main(String[] args) {
		//여기를  구현하세요.
		Box box[] = new Box[2];
		box[0] = new Box(10,1,'&');
		box[1] = new Box(20,3,'%');

		for(int i =0;i<box.length;i++) {
			box[i].draw();
		} // end i

		
		
	} //end main
		
} //end class


