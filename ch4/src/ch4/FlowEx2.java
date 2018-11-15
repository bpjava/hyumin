/* if 문 괄호 닫기의 중요성
 * 괄호로 묶지 않을 경우 한문장만 출력됨
 */
package ch4;

import java.util.*; // Scanner클래스를 사용하기 위해 추가

public class FlowEx2 {
	public static void main(String[] args) {
		int input;
		
		System.out.print("숫자를 하나 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); //화면을 통해 입력받은 내용을 tmp에 저장
		input = Integer.parseInt(tmp);   // 입력받은 문자열(tmp)을 숫자로 변환
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		if(input!=0)
			System.out.println("입력하신 숫자는 0이아닙니다."); //if문에 한줄만 속함
			System.out.printf("입력하신 숫자는 %d입니다.", input); // if문이 괄호로 닫혀있지 않기 때문에 모든 경우에서 출력된다
			
	}//main의 끝

}
