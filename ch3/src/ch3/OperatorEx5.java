/* 사칙 연산자 +-/*
 * 나눗셈 할땐 실수형으로 해야 값을 얻을 수 있다.
 * 
 */
package ch3;

public class OperatorEx5 {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
		
	}

}
