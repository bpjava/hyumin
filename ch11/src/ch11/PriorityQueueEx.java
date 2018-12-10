/** 자료구조 힙의 저장 방법
 * 저장된 순서가 아닌 우선순위가 높을 순서대로 출력된다
 * ( 숫자뿐만아니라 객체도 가능 - 크기 비교 방법을 제공하여야함)
 * 
 */
package ch11;

import java.util.*;

class PriorityQueueEx {
	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		pq.offer(3);	// pq.offer(new Integer(3)); 오토박싱
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		System.out.println(pq); // pq의 내부 배열을 출력
		
		Object obj = null;
		
		// PriorityQueue 에 저장된 요소를 하나씩 꺼낸다.
		while((obj = pq.poll()) !=null)
			System.out.println(obj);
	}

}
