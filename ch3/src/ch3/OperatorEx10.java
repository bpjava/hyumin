/* 연산 순서에 따른 결과값 도출
 * 
 */
package ch3;

public class OperatorEx10 {

	public static void main(String[] args) {
		int a = 10000000;
		
		int result1 = a * a / a; // 10000000*10000000 /10000000
		int result2 = a / a * a; // 10000000/10000000*10000000
		
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1); //-727
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result2); // 10000000
		

	}

}
