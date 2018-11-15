/** 반복문 - while문
 * 반복해서 숫자를 입력받다가 0을 입력하면 입력을 마치고 총 합을 출력하는 예제
 * while문은 변수가 고정된 값을 유지하므로 무한반복문과 다름이 없다.
 * 따라서 if문이 반복문 안에 꼭 필요하다.
 * */

package ch4;

import java.util.*;

class FlowEx27 {
	public static void main(String[] args) { 
		int num;
		int sum = 0;
		boolean flag = true;   // while문의 조건식으로 사용될 변수

		System.out.println("합계를 구할 숫자를 입력하세요.(끌내려면 0을 입력)");

		while(flag) {    // flag의 값이 true이므로 조건식은 참이 된다.
			System.out.print(">>");

			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);  

			if(num!=0) {  
				sum += num; // num이 0이 아니면, sum에 더한다.
			} else {
				flag = false;   // num이 0이면, flag의 값을 false로 변경.
			}
		} // while문의 끝

		System.out.println("합계:"+ sum);
	}
}
