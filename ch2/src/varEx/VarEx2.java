// tmp 임시 변수를 이용한 x,y 값 교환
package varEx;

public class VarEx2 {
	public static void main(String[] args) {
		int x = 10, y = 20;
		int tmp = 0; // x의 값을 임시로 저장할 변수를 선언
		
		System.out.println("x:" + x + " y:" + y);
		
		tmp = x;
		x = y;
		y = tmp; 
		
		System.out.println("x:" + x + " y:" + y);


	}
}
