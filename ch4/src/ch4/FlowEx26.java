/** 반복문 - while문
 * 누적합계가 100을 넘지 않는 제일 큰 수가 되는 지 알아내는 예제
 * sum += ++i  // i의 값을 1 증가시켜서 sum에 누적
 * sum <= 100 //sum의 값이 100보다 작거나 같은지 확인
 * */

package ch4;

class FlowEx26 {
	public static void main(String[] args) { 
		int sum = 0;
		int i   = 0;

		while((sum += ++i) <= 100) { // i를 1씩 증가시켜서 sum에 계속 더해나간다.
			System.out.printf("%d - %d%n", i, sum);
		}
	} // main의 끝
}
