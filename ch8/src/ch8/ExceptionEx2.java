/* number에 저장되어있는 값 100을
 *  0-9 사이의 임의의 정수로 나눈 결과값 출력 10번 반목문
 *  정수를 0으로 나누면 오류가 발생
 */
package ch8;

public class ExceptionEx2 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i=0; i < 10; i++) {
			result = number / (int)(Math.random() * 10); //7번째 라인, 정수 나눗셈에서 오류 발생
			System.out.println(result);
		} 
	} //main의 끝

}
