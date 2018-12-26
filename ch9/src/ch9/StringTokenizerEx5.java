/** 구분자를 ','로 하는 문자열 데이터를 
 *   String클래스의 split()과 StringTokenizer로 잘라 낸 결과를 비교
 * split() - 빈 문자열도 토큰으로 인식(5)
 * StringTokenizer - 빈 문자열을 토큰으로 인식하지 않음 (3)
 */
package ch9;

import java.util.*;

class StringTokenizerEx5 {
	public static void main(String[] args) {
		String data = "100,,,200,300";

		String[] result = data.split(",");
		StringTokenizer st = new StringTokenizer(data, ",");

		for(int i=0; i < result.length;i++)
			System.out.print(result[i]+"|");

		System.out.println("개수:"+result.length);

		int i=0;
		for(;st.hasMoreTokens();i++)
			System.out.print(st.nextToken()+"|");

		System.out.println("개수:"+i);
	} // main
}
