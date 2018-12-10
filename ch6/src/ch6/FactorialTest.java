/** ��� ȣ�� (recursive call) - ���丮�� ���ϱ�
 * �ڱ� �ڽ��� ȣ���ϴ� �޼���
 * ���ǹ� �ʼ�!
 * f(n) = n* f(n-1), �� f(1) = 1
 */

package ch6;

class FactorialTest {
	public static void main(String args[]) {
		int result = factorial(4); // int result = FactorialTest.factorial(4);
		
		System.out.println(result);
	}
	
	/*  ��������!
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
			result = n * factorial(n-1); // �ٽ� �޼��� �ڽ��� ȣ���Ѵ�.
		}
		
		return result;
	}

}
