/** HashSet- equals()�� hashCode()�� �������̵��� �ʿ�
 * �� ���� String Ŭ�������� ���� ������ ���ڿ��� ���� �ߺ�ó���ϱ�
 
 */
package ch11;

import java.util.*;

public class HashSetEx4 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		// �ߺ�ó�� O : 1�������
		set.add("abc");
		set.add("abc");
		// �ߺ�ó�� O : 1�������
		set.add(new Person2("David",10));
		set.add(new Person2("David",10));

		System.out.println(set);
	}
}

//person2Ŭ���� ����
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
	