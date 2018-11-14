/* try-catch문의 흐름
 * > try블럭내에서 예외가 발생한 경우
 * 1. 예외와 일치하는 catch블럭 확인
 * 2. O - catch블럭내 문장들 수행
 * 	  X - 예외 처리되지 않음
 * 
 * > try블럭 내에서 예외가 발생하지 않은 경우
 * 1. catch 블럭을 거치지 않고 전체 try - catch문을 빠져나가서 수행함
 */
package ch8;

public class ExceptionEx4 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5); //예외가 발생하지 않아서 실행되지 않음
 		} // try-catch의 끝
		System.out.println(6);
	} // main메서드의 끝

}
