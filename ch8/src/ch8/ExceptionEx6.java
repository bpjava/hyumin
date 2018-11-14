/* try-catch문의 흐름
 * catch 블럭의
 *  () : 처리하고자 하는 예외와 같은 타입의 참조변수 선언
 *  > try 블럭에서 예외가 발생했다면
 *  처리가능한 catch 블럭을 찾는다.(instanceof) 
 *  >> 모든 예외클래스는 Exception클래스의 자손
 */
package ch8;

public class ExceptionEx6 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 고의로 AritchmeticException을 발생시킴
			System.out.println(4);	// 실행되지 않는다
		} catch (Exception e) {// AritchmeticException 대신 Exception을 사용
			System.out.println(5); //예외가 발생하여 실행됨
		} // try-catch의 끝
		System.out.println(6);
	}
}