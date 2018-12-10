/** 재귀 호출 (recursive call) - 팩토리얼 구하기 + 매개변수 유효성검사!
 * 자기 자신을 호출하는 메서드
 * 조건문 필수!
 * f(n) = n* f(n-1), 단 f(1) = 1
 */

package ch6;

class FactorialTest2 {
	static long factorial(int n) {
		if(n<=0 || n>20) return - 1; // 매개변수의 유효성 검사.
		if(n<=1) return 1;
		return n * factorial(n-1);
	}
	
	public static void main(String args[]) {
		int n = 21;
		long result = 0;
		
		for(int i = 1 ; i <= n; i++) {
			result = factorial(i);
			
			if(result == -1 ) {
				System.out.printf("유효하지 않은 값입니다. (0<n<20): %d%n", n);
				break;
			}
			
			System.out.printf("%2d!=%20d%n", i, result);
		}
	} // main의 끝

}
