/** Comparator와 Comparable의 실제 사용법
 *  static void sort (Object [] a) // 객체 배열에 저장된 객체가 구현한 Comparable에 의한 정렬 
 *  static void sort (Object [] a, Comparator c) // 지정한 Comparator에 의한 정렬
 *  - 오름차순 시 공백, 숫자, 대문자, 소문자 순
 */
package ch11;

import java.util.*;

public class ComparatorEx {
	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr);	//String의 Comparable구현에 의한 정렬
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);	// 대소문자 구분 안함
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());	// 역순정렬
		System.out.println("strArr=" + Arrays.toString(strArr));
	}
}
// 문자열 내림차순 구현
class Descending implements Comparator {
	public int compare (Object o1, Object o2) {
		// Object 타입이기 때문에 형변환이 필요
		if( o1 instanceof Comparable && o2 instanceof Comparable) {
				Comparable c1 = (Comparable) o1;
				Comparable c2 = (Comparable) o2;
				return c1.compareTo(c2) * -1 ; // -1을 곱해서 기본 정렬방식의 역으로 변경
												// 또는 c2.compareTo(c1)와 같이 순서를 바꿔도 된다.
		}
		return -1;
	}
}
