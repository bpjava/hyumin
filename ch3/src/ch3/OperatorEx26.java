/* 논리 연산자가 효율적인 연산을 하는지 확인!
 * 좌측피연산자가 거짓이면 우측 피연산자를 평가하지 않음
 */
package ch3;

public class OperatorEx26 {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);
		System.out.printf("a=%d, b=%d%n", a, b);
		
	}// main의 끝

}
