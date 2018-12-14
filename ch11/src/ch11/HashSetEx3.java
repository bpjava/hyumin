/**HashSet에서  
 * 인스턴스가 동일할때에도 클래스 변수의 중복 처리가 안된당.
 */
package ch11;

import java.util.*;

public class HashSetEx3 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		// 중복처리 O : 1개만출력
		set.add("abc");
		set.add("abc");
		// 중복처리 X: 2개다출력
		set.add(new Person("David",10));
		set.add(new Person("David",10));

		System.out.println(set);
	}
}

//person클래스 정의
class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+":"+age;
	}
}