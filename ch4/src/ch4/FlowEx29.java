/** 반복문 - do-while 
 * do{
 * 		// 조건식의 연산결과가 참일 때 수행될 문장들을 적는다. 
 * } while（조건식); <-끝에 ; 을 잊지 않도록 주의
 * 
 * 3의 배수(3, 6, 9)가 포함되어 있으면, 
 * 포함된 개수만큼 박수를 치는 369게임 을 1부터 100까지 출력하는 예제
 * for문의 제어에 사용되는 i변수는 연산에 사용하면 안됨!
*/
package ch4;

class FlowEx29 {
	public static void main(String[] args) { 
		for(int i=1;i<=100;i++) {
			System.out.printf("i=%d ", i);

			int tmp = i;  //i의 값을 다른 변수에 저장한다.

			do {
				if(tmp%10%3==0 && tmp%10!=0) // tmp%10이 3의 배수인지 확인(0 제외)
					System.out.print("짝");
			} while((tmp/=10)!=0);  // tmp /= 10은 tmp = tmp / 10과 동일

			System.out.println();
		}
	} // main
}
