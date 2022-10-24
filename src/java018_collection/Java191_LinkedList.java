package java018_collection;

import java.util.LinkedList;

/* 
 * Queue(큐)
 * 1. FIFO(First In First Out) : 제일 먼저 저장한 요소를 제일 먼저 꺼낸다.
 * 2. 최근 사용문서, 인쇄작업 대기목록, 버퍼 등
 * offer로 넣고 poll로 가져옴 
 * (pointer 이동해서 처리하기 때문에 pop해도 가져오긴 함)
 */

public class Java191_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nQueue = new LinkedList<String>();
		
		//append
		nQueue.offer(new String("java"));
		nQueue.offer(new String("jsp"));
		nQueue.offer(new String("spring"));
		
		while(!nQueue.isEmpty())
			System.out.println(nQueue.poll());
		
	} // end main

} // end class
