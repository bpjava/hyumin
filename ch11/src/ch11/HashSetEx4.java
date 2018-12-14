/** HashSet- equals()와 hashCode()의 오버라이딩
 * 을 통해 String 클래스에서 같은 내용의 문자열에 대한 중복처리하기
 
 */
package ch11;

import java.util.*;

public class HashSetEx4 {
	public static void main(String[] args) {
HashSet set = new HashSet();
		
		// 중복처리 O : 1개만출력
		set.add("abc");
		set.add("abc");
		// 중복처리 X: 2개다출력
		set.add(new Person2("David",10));
		set.add(new Person2("David",10));

		System.out.println(set);
	}
}

//person2클래스 정의
class Person2 {
	String name;
	int age;

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Person2) {
			Person2 tmp = (Person2)obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		
		return false;
	}
	
	public int hashCode() {
		return Objects.hash(name,age); // int hash(Object... values)
		// return (name+age).hashCode();
	}
	
	public String toString() {
		return name+":"+age;
	}
}
	