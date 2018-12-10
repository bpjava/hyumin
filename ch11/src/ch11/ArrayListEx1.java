
/** ArrayList의 기본적인 메서드를 이용해 객체 다루기
 * List 인터페이스를 구현 -> 저장된 순서를 유지한다.
 * collections 클래스의 sort 메서드로 정렬
 * 공통요소 삭제하기( get(int index) 메서드,for문 이용)
 */
package ch11;

import java.util.*;

class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		// 정렬(Collections.sort()
		Collections.sort(list1);		
		Collections.sort(list2);
		print(list1, list2);
		
		//모든 요소를 포함할때 true
		System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));
		
		// add(Object obj)를 이용해 새 객체 저장
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		
		// set(int index, Object obj)를 이용해 다른 객체로 변경
		list2.set(3, "AA");
		print(list1, list2);
		
		// list1 에서 list2와 겹치는 부분만 남기고 나머지는 삭제
		System.out.println("list1.retainAll(list2):"+ list1.retainAll(list2));
		print(list1,list2);
		
		// list2 에서 list1에 포함된 객체들을 삭제
		for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
					list2.remove(i);
		}
		print(list1,list2);
	}// main문의 끝
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}
}// class
