/* switch 문
 *  1. 조건식을 계산한다.
 *  2. 조건식의 결과와 일치하는 case문으로 이동한다.
 *  3. 이후의 문장들을 수행한다.
 *  4. break문이나 switch문의 끝을 만나면 switch문 전체를 빠져나간다.
 */
package ch4;

import java.util.*;

public class FlowEx6 {
	public static void main(String[] args) {
		int month = 0;
		
		System.out.print("현재 월을 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		month = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환
		
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("현재의 계절은 봄입니다.");
				break;
			case 6: case 7: case 8: 
				System.out.println("현재의 계절은 여름입니다.");
				break;
			case 9: case 10: case 11: 
				System.out.println("현재의 계절은 가을입니다.");
				break;
			default:
			//case 12: case 13: case 14: 
				System.out.println("현재의 계절은 겨울입니다.");
		}	
	} // main의 끝
}
