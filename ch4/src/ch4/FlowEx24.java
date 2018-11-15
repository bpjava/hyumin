/** 반복문 - while문
 * 전위연산자 - 0에서 종료
 * 후위연산자 - 0이후에 종료
 * */
package ch4;

class FlowEx24 {
	public static void main(String[] args) { 
		int i=11;

		System.out.println("자, 이제 카운트다운을 시작합니다.");

		while(i--!=0) { // 후위연산자 - 0까지 카운트다운
		//while(--i!=0) {  // 전위연산자 - 0이 출력안됨
			System.out.println(i);

			for(int j=0;j<2_000_000_000;j++) {
					;
			}
		 //for(int j=0;j<2_000_000_000;j++); 으로 줄일수있음
		//for(int j=0;j<2_000_000_000;j++) {} 으로 줄일수있음
		}

		System.out.println("GAME OVER");
	}
}
