/** 재귀 호출 (recursive call) - 팩토리얼 구하기
 * 자기 자신을 호출하는 메서드
 * 조건문 필수!
 * f(n) = n* f(n-1), 단 f(1) = 1
 */

package ch6;

class FactorialTest {
	public static void main(String args[]) {
		int result = factorial(4); // int result = FactorialTest.factorial(4);
		
		System.out.println(result);
	}
	
	/*  더간단히!
	 * static int factorial(int n) {
	 * 			if(n==1) return 1;
	 * 			
	 * 			return n * factorial(n-1);
	 * }
	 */
	
	static int factorial(int n) {
		int result = 0;
		 
		if ( n == 1 ) {
			result = 1;
		} else {
			result = n * factorial(n-1); // 다시 메서드 자신을 호출한다.
		}
		
		return result;
	}

}
