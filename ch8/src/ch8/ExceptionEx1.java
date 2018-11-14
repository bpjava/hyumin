/* try-catch문의 사용 방법
 * 하나의 메서드 내에 여러개의 try-catch문이 사용될 수 있다.
 */
package ch8;

public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			try {	} catch (Exception e) { }
		} catch (Exception e) {
		//	try {	} catch (Exception e) { } // 에러 발생 , 변수 e가 한블럭 내에서 중복 선언됨	
		} // try-catch의 끝
		
	try {
		
	}catch (Exception e) {
		
	} // try-catch의 끝
  }	 // main 메서드의 끝	
}
