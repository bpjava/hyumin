/** HashSet의 저장
 * 중복 X - 서로 다른 객체는 중복으로 간주하지 않음
 * 1과 Integer(1)
 * 결과 // {1, 1, 2, 3, 4}
 */

package ch11;

import java.util.*;

public class HashSetEx1 {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
		Set set = new HashSet();
		
		for(int i=0; i < objArr.length; i++) {
			set.add(objArr[i]);	//HashSet에 objArr요소들을 저장
		}
		// HashSet에 저장된 요소들을 출력
		System.out.println(set);
	}
}
