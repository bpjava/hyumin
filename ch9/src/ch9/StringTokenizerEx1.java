/** ','를 구분자로 하는 StringTokenizer를 생성
 * 문자열을 나눠 출력
 */

package ch9;

import java.util.*; 

class StringTokenizerEx1 { 
	public static void main(String[] args){ 
		String source = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(source, ",");

		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	} // main의 끝
} 
