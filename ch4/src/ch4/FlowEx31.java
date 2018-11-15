/** 반복문 - continue
 *  반복문 내에서만 사용 가능
 *    for문 - 증감식
 *    while, do-while - 조건식
 *  으로 이동
 * */
package ch4;

class FlowEx31 {
	public static void main(String[] args) {
		for(int i=0;i <= 10;i++) {
			if (i%3==0)
				continue;
			System.out.println(i); //i%3==0 일경우 실행되지않음
		}// continue 문이 수행되면 블럭끝으로 이동
	}
}
