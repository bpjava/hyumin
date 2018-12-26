/** 생성자 StringTokenizer(String str, String delim, boolean returnDelims)를 사용
 * 구분자도 토큰으로 간주
 */ 

package ch9;

import java.util.*; 

class StringTokenizerEx2 { 
	public static void main(String[] args) { 
		String expression = "x=100*(200+300)/2";
		StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true);

		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	} // main의 끝
} 
