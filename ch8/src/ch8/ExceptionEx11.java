/** 예외처리가 되어있지 않으면 오류발생
 *  컴파일 조차 되지 않음
 *  >> RuntimException클래스들과 그 자손클래스에 해당하는 예외는
 *  성공적으로 컴파일이 됨( 프로그래머 실수 )
 */
package ch8;

public class ExceptionEx11 {
	public static void main(String[] args) {
		throw new RuntimeException () ; // RuntimeException을 고의로 발생시킨다.
	}

}
