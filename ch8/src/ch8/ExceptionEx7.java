/* try-catch문의 흐름
 * 첫 번째 검사에서 일치하는 catch블럭을 찾았기 때문에 
 * 두 번째 catch블럭은 검사하지 않게 된다
 */
package ch8;

public class ExceptionEx7 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 고의로 AritchmeticException을 발생시킴
			System.out.println(4);	// 실행되지 않는다
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)  // instanceof 검사후 예외가 발생하여 실행됨
				System.out.println("true");
			System.out.println("ArithmeticException"); 
		} catch (Exception e) {// AritchmeticException을 제외한 모든 예외가 처리
			System.out.println("Exception"); 
		} // try-catch의 끝
		System.out.println(6);
	}// main 메서드의 끝

}
