/** 긴 문자열 데이터를 원하는 길이로 잘라서 ArrayList에 담은 다음 출력
 * - charAt(int i)와 for문을 이용해도 되지만
 * ArrayList에 담아 기능을 사용할 수 있다
 * - 저장할 요소의 갯수를 고려해서 실제 저장할 개수보다 약간 여유있는 크기로 생성
 */
package ch11;

import java.util.*;

class ArrayListEx2 {
	public static void main(String[] args) {
		final int LIMIT = 10;	// 자르고자 하는 글자의 개수를 지정
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();
		
		List list = new ArrayList(length/LIMIT + 10); //크기를 여유있게
		
		for(int i=0; i < length; i +=LIMIT) {
			if(i+LIMIT <length)
				list.add(source.substring(i, i+LIMIT));
			else
				list.add(source.substring(i));
		}
		
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
