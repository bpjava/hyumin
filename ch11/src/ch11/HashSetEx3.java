/**HashSet����  
 * �ν��Ͻ��� �����Ҷ����� Ŭ���� ������ �ߺ� ó���� �ȵȴ�.
 */
package ch11;

import java.util.*;

public class HashSetEx3 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		// �ߺ�ó�� O : 1�������
		set.add("abc");
		set.add("abc");
		// �ߺ�ó�� X: 2�������
		set.add(new Person("David",10));
		set.add(new Person("David",10));

		System.out.println(set);
	}
}

//personŬ���� ����
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