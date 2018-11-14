/* round 함수로 반올림
 * 
 */
package ch3;

public class OperatorEx18 {

	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;
		
		System.out.println(shortPi);

	}

}
