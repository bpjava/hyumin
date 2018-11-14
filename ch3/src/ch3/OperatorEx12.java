/* 문자형의 덧셈*/
package ch3;

public class OperatorEx12 {

	public static void main(String[] args) {
		char c1 = 'a';			//c1에는 문자 'a'의 코드 값인 97이 저장된다.
		char c2 = c1;			//c1에 저장되어 있는 값이 c2에 저장된다.
		char c3 = ' ';			//c3를 공백으로 초기화한다.
		
		int i = c1 + 1;			// 'a'+1 -> 97+1 -> 98
		c3 = (char)(c1 + 1);	// 덧셈연산 결과가 int형 이므로 결과를 char로 형변환
		c2++;
		c2++;
		
		System.out.println("i=" + i);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);

	}

}
