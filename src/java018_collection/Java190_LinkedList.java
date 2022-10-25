package java018_collection;
/*
 * Stack(스택)
 * 1. LIFO(Last In Fist Out) : 마지막에 저장된 요소를 먼저 꺼낸다.
 * 2. 수식계산, 수식 괄호검사, undo/redo, 뒤로/ 앞으로
 * pop() 하면 메모리에서 완전히 데이터를 꺼내오고 빈 스택이 됨
 * push/pop
 */

import java.util.LinkedList;

public class Java190_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nStack = new LinkedList<String>();
		
		//append
		nStack.push(new String("java"));
		nStack.push(new String("jsp"));
		nStack.push(new String("spring"));
		
		//System.out.println(nStack.pop());
		//System.out.println(nStack.pop());
		//System.out.println(nStack.pop());
		//System.out.println(nStack.pop()); //java.util.NoSuchElementException
		
		while(!nStack.isEmpty())
			System.out.println(nStack.pop());
			

	} //end main

} // end class
