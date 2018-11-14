/* 키워드 throw로 고의로 예외 발생시키기
 * 
 */
package ch8;

public class ExceptionEx9 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시킴");
			throw e; // 예외를 발생시킴
		// throw new Exception("고의로 발생시킴"); // 줄여쓰기가능
		} catch (Exception e) {
			System.out.println("에러메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료됨~");
	}

}
