/**TreeSet 
 * 대소문자 유의
 * 오름차순 : 공백/숫자/대문자/소문자 순서
 */
package ch11;

import java.util.*;

public class AsciiPrint {
	public static void main(String[] args) {
		char ch = ' ';
		for(int i=0; i<95; i++) //공백(' ')이후의 문자들을 출력
			System.out.print(ch++);
	}
}
