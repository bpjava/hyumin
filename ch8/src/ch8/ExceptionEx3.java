/* number에 저장되어있는 값 100을
 *  0-9 사이의 임의의 정수로 나눈 결과값 출력 10번 반목문
 *  실수를 0으로 나누면 오류가 발생하지 않음
 *  -- 0일 경우에도 비정상적으로 종료되지 않도록 함 (try-catch 구문)
 */
package ch8;

public class ExceptionEx3 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i=0; i < 10; i++) {
			try {
			result = number / (int)(Math.random() * 10); // 정수 0 나눗셈에서 오류 발생
			System.out.println(result);
			} catch (ArithmeticException e) {  // ArithmeticException이 발생하면 실행되는 코드
				System.out.println("0");
			}// try-catch의 끝
		} // for의 끝

	}

}
