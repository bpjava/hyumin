/** 반복문 - while문
 * while (조건식) ｛ 
 * 		// 조건식의 연산결과가 참 (true) 인 동안, 반복될 문장들을 적는다.
 * }
 * */
package ch4;

class FlowEx23 {
	public static void main(String[] args) { 
		int i= 5;

		while(i--!=0) { // 후위연산자 ; 0이되면 종료(0에서도 출력)
			System.out.println(i + " - I can do it.");
		}
	} // main의 끝
}
