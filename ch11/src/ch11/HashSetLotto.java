/** HashSet - 중복 X 의 성질로 로또 번호 만들기
 * 
 */
package ch11;

import java.util.*;

public class HashSetLotto {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		for (int i=0; set.size() < 6;i++) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(new Integer(num));
		}
		
		// 정렬시 list인터페이스 타입으로 담아줌
		List list = new LinkedList(set);	// LinkedList(Collection c)
		// 크기순으로 정렬
		Collections.sort(list);
		System.out.println(list);
	}
}
