/* 부호연산자 + -
 * boolean형과 char형을 제외한 기본형에만 사용가능	
 */

package ch3;

public class OperatorEx4 {

	public static void main(String[] args) {
		int i = -10;
		i = +i;
		System.out.println(i);
		
		i = -10;
		i = -i;
		System.out.println(i);

	}

}
