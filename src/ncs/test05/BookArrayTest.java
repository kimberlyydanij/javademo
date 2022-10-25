package ncs.test05;

/*
 * 자바의 정석, 남궁성, 도우출판, 30000원, 10% 할인
 * 할인된 가격 : 27000원
 * 열혈강의 자바, 구정은, 29000원, 10% 할인
 * 할인된 가격 : 261000원
 * 객체지향 JAVA8, 금영욱, 30000원, 10% 할인
 * 할인된 가격 : 27000원
 */
public class BookArrayTest {

	public static void main(String[] args) {
		Book bArray [] = new Book[3];
		bArray[0] = new Book("자바의정석","남궁성",30000,"도우출판",0.1f);
		bArray[1] = new Book("열혈강의 자바","구정은",29000,"프리렉",0.1f);
	    bArray[2] = new Book("객체지향 JAVA8","금영욱",30000,"북스홈",0.1f);
	    
	    for(Book data : bArray) {
	    	System.out.printf("%s, %s, %s, %d원, %d%% 할인\n"
	    			,data.getTitle(),data.getAuthor(),data.getPublisher()
	    			,data.getPrice(),(int)((data.getDiscountRate())*100));
	    	System.out.printf("할인된 가격 : %d원\n",data.getPrice()-(int)(data.getPrice()*data.getDiscountRate()));
	    } //end for
	} // end main

} // end class
