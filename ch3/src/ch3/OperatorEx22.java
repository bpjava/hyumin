/* float 타입의 값과 double타입의 값을 비교하려면
 * double -> float타입으로 형변환 뒤 비교 
 * 혹은 오차 무시후 두타입의 값을 잘라서 비교
 */
package ch3;

public class OperatorEx22 {

	public static void main(String[] args) {
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		
		System.out.printf("10.0==10.0f %b%n", 10.0==10.0f);
		System.out.printf("0.1==0.1f %b%n", 0.1==0.1f);
		System.out.printf("f=%19.17f%n", f);
		System.out.printf("d=%19.17f%n", d);
		System.out.printf("d2=%19.17f%n", d2);
		System.out.printf("d==f %b%n", d==f);
		System.out.printf("d==d2 %b%n", d==d2);
		System.out.printf("d2==f %b%n", d2==f);
		System.out.printf("(float)d==f %b%n", (float)d==f);
	}

}
