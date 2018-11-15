/** 반복문 - while문
 * 숫자를 입력받아 각 자리의 합을 구하는 예제
 * num/=10 에 의해 줄어들다 0이되면 while문을 빠져나온다.
 * */
package ch4;


import java.util.*;

class FlowEx25 {
	public static void main(String[] args) { 
		int num = 0; 
		int sum = 0;

		System.out.print("숫자를 입력하세요.(예:12345)>");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		num = Integer.parseInt(tmp);      // 입력받은 문자열(tmp)을 숫자로 변환

		while(num!=0) {    
			// num을 10으로 나눈 나머지를 sum에 더함
			sum += num%10; 	// sum = sum + num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);

			num /= 10;  // num = num / 10;  num을 10으로 나눈 값을 다시 num에 저장
		}
		
		System.out.println("각 자리수의 합:"+ sum);
	}
}
