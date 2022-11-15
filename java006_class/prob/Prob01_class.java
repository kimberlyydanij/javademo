package java006_class.prob;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 */

public class Prob01_class {

	public static void main(String[] args) {
		//여기를 구현하세요.////////////////////	
		double area;
		double[] size = new double[]{10.0,2.0};
		String[] food = new String[]{"자바피자","자바도넛"};
		for(int i=0;i<food.length;i++)
			System.out.printf("%s의 면적은 %.2f\n",food[i],size[i]*size[i]*3.14);

	}//end main()

}//end class
