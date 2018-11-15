/** 반복문 - 이름 붙은 반복문
 *  break문은 근접한 단 하나의 반복문만 벗어날 수 있음
 *  >> 중첩 반복문에서 반복문에 이름을 붙여
 *  하나이상의 반복문을 벗어나거나 건너뛸 수 있다.
 * */
// 구구단을 출력하는 예제
package ch4;

class FlowEx33 {
	public static void main(String[] args)
	{
        // for문에 Loop1이라는 이름을 붙였다.
		Loop1 : for(int i=2;i <=9;i++) {	
				for(int j=1;j <=9;j++) {
					if(j==5)
//						break Loop1;  // 2단(1~4)만 출력
//						break; // 9단(1~4) 출력
//					continue Loop1; // 9단(1~4)까지 전부 연속 출력
					continue;       // 9단까지 전부 출력
					System.out.println(i+"*"+ j +"="+ i*j);
				} // end of for i
				System.out.println();
		} // end of Loop1

	}
}
