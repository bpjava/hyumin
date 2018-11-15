/** 반복문 - for 중첩
 * 5*10
 * */

package ch4;

class FlowEx16 {
	public static void main(String[] args) { 
		for(int i=1;i<=5;i++) { 
			for(int j=1;j<=10;j++) {
				System.out.print("*");			
			}
			System.out.println();
		}
	} // main의 끝
}
