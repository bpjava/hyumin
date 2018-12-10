/** Vector�� �뷮(capacity)�� ũ��(size)�� ���Ѱ� */

package ch11;

import java.util.*;

class VectorEx1 {
	public static void main(String[] args) {
		Vector v = new Vector(5); // �뷮(capacity)�� 5�� Vector����
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);
		
		v.trimToSize();//������� ���ش�. �뷮�� ũ�Ⱑ ��������.
		System.out.println("=== After trimToSize() ===");
		print(v);
		
		v.ensureCapacity(6); // !�� �ν��Ͻ��� �����ϰԵȴ�.
		System.out.println("=== After ensureCapacity(6) ===");
		print(v);
	
		// !Vector�� capacity �� ������ ��� �ڵ������� ������ ũ�⺸�� 2���� ũ��� ����
		v.setSize(7); 
		System.out.println("=== After setSize(7) ===");
		print(v);
		
		// ��� ��Ҹ� ����
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
