/** Comparator�� Comparable�� ���� ����
 *  static void sort (Object [] a) // ��ü �迭�� ����� ��ü�� ������ Comparable�� ���� ���� 
 *  static void sort (Object [] a, Comparator c) // ������ Comparator�� ���� ����
 *  - �������� �� ����, ����, �빮��, �ҹ��� ��
 */
package ch11;

import java.util.*;

public class ComparatorEx {
	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr);	//String�� Comparable������ ���� ����
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);	// ��ҹ��� ���� ����
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());	// ��������
		System.out.println("strArr=" + Arrays.toString(strArr));
	}
}
// ���ڿ� �������� ����
class Descending implements Comparator {
	public int compare (Object o1, Object o2) {
		// Object Ÿ���̱� ������ ����ȯ�� �ʿ�
		if( o1 instanceof Comparable && o2 instanceof Comparable) {
				Comparable c1 = (Comparable) o1;
				Comparable c2 = (Comparable) o2;
				return c1.compareTo(c2) * -1 ; // -1�� ���ؼ� �⺻ ���Ĺ���� ������ ����
												// �Ǵ� c2.compareTo(c1)�� ���� ������ �ٲ㵵 �ȴ�.
		}
		return -1;
	}
}
