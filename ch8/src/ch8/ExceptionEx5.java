/* try-catch문의 흐름
 * > try블럭내에서 예외가 발생한 경우
 * 1. 예외와 일치하는 catch블럭 확인
 * 2. O - catch블럭내 문장들 수행
 * 	  X - 예외 처리되지 않음
 * >>위치 이후에 있는 try블력의 문장들은 수행 되지 않음
 */
package ch8;

public class ExceptionEx5 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 고의로 AritchmeticException을 발생시킴
			System.out.println(4);	// 실행되지 않는다
		} catch (ArithmeticException e) {
			System.out.println(5); //예외가 발생하여 실행됨
		} // try-catch의 끝
		System.out.println(6);
	} //main메서드의 끝

}
