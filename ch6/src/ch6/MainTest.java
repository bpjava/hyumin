/** 재귀 호출 - main문 재귀호출 !
 * StackOverflowError 발생! 
 */
package ch6;

class MainTest {
	public static void main(String[] args) {
		main(null);		//재귀호출, 자기자신을 다시 호출한다.
	}

}
