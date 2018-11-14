/* 이미 int타입인 연산을 long타입 변수에 넣어도 오버플로우가 발생하여 값을 버림
 * 
 */
package ch3;

public class OperatorEx9 {

	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;
	
		System.out.println("a="+a); // 오버플로우
		System.out.println("b="+b);
	}

}
