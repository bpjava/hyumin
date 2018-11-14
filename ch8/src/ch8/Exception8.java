/* 예외발생 시 	printStackTraceO 또는 getMessageO 사용
 * 
 * 	printStackTraceO - 예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다.
 *	getMessageO - 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
*/
package ch8;

public class Exception8 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // !!!예외발생!!!
			System.out.println(4);	// 실행되지 않는다
		} catch (ArithmeticException ae) {
			ae.printStackTrace(); // 참조변수 ae를 통해 생성된 ArithmeticException에 접근 가능
				System.out.println("예외메시지 : " + ae.getMessage()); 
		} // try-catch의 끝
		System.out.println(6);
	}

}
