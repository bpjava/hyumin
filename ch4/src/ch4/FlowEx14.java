/** 반복문 - for
 * 두 개 변수 사용하기
 * (변수 갯수는 적을수록 효율적)
 * */

package ch4;




class FlowEx14 {
	public static void main(String[] args) { 
		for(int i=1,j=10;i<=10;i++,j--)
			System.out.printf("%d \t %d%n", i, j);
	}
}
