/** 반복문 - continue
 *  반복문 내에서만 사용 가능
 *    for문 - 증감식
 *    while, do-while - 조건식
 *  으로 이동
 * */

package ch4;

import java.util.*;

class FlowEx32 {
	public static void main(String[] args) { 
		int menu = 0;
		int num  = 0;

		Scanner scanner = new Scanner(System.in);

		while(true) {// continue 여기로 이동
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");

			String tmp = scanner.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp);    // 입력받은 문자열(tmp)을 숫자로 변환

			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue;	// 잘못선택한 경우 다시 메뉴를 보여줌	
			}
			
			System.out.println("선택하신 메뉴는 "+ menu +"번입니다.");
		}
	} // main의 끝
}
