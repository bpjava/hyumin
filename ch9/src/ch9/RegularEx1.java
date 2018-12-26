/** 정규식 - java.util.regex 패키지
 * 정규식 - 텍스트 데이터중에서 원하는 조건 과 일치하는 문자열을 찾아내기 위해 사용
 * 미리 정의된 기호와 문자를 이용해서 작성한 문자열을 말함
 */

package ch9;

import java.util.regex.*;	// Pattern과 Matcher가 속한 패키지

class RegularEx1 {
	public static void main(String[] args) 
	{
		String[] data = {"bat", "baby", "bonus",
				    "cA","ca", "co", "c.", "c0", "car","combat","count",
				    "date", "disc"};		
		Pattern p = Pattern.compile("c[a-z]*");	// c로 시작하는 소문자영단어

		for(int i=0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.print(data[i] + ",");
		}
	}
}
