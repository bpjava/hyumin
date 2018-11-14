/* float 과 double의 형변환
 * 정밀도 차이때문에 실제 저장되는 값이 달라져서 
 * 형변환을 해도 값이 같아지지 않는다.
 * 
 */

package varEx;

public class CastingEx3 {

	public static void main(String[] args) {
		float f = 9.1234567f;
		double d = 9.1234567;
		double d2 = (double)f;
		
		System.out.printf("f = %20.18f\n", f);
		System.out.printf("d = %20.18f\n", d);
		System.out.printf("d2 = %20.18f\n", d2);

	}

}
