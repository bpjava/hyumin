/** Vector의 용량(capacity)과 크기(size)에 관한것 */

package ch11;

import java.util.*;

class VectorEx1 {
	public static void main(String[] args) {
		Vector v = new Vector(5); // 용량(capacity)이 5인 Vector생성
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);
		
		v.trimToSize();//빈공간을 없앤다. 용량과 크기가 같아진다.
		System.out.println("=== After trimToSize() ===");
		print(v);
		
		v.ensureCapacity(6); // !새 인스턴스를 생성하게된다.
		System.out.println("=== After ensureCapacity(6) ===");
		print(v);
	
		// !Vector는 capacity 가 부족할 경우 자동적으로 기존의 크기보다 2배의 크기로 증가
		v.setSize(7); 
		System.out.println("=== After setSize(7) ===");
		print(v);
		
		// 모든 요소를 삭제
		v.clear();
		System.out.println("=== After clear() ===");
		print(v);
	}

	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("Size :" + v.size());
		System.out.println("capacity:" + v.capacity());
	}
}
