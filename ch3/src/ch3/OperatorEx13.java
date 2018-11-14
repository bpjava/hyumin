/* 상수 또는 리터럴 간의 연산은 실행 과정동안 변하는 값이 아니기 때문에 
 * 컴파일시에 컴파일러가 계산해서 그결과로 대체함으로 효율적
 */
package ch3;

public class OperatorEx13 {

	public static void main(String[] args) {
		char c1 = 'a';
		
		// char c2 = c1+1; // 컴파일 에러발생
		char c2 = 'a'+1; // 컴파일 에러없음
		
		System.out.println(c2);

	}

}
