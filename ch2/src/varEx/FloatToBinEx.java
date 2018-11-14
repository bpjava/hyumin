/* float 값은 소수점이하 6자리, 정밀도가 7이다
 * 10->2진수 변환시 반올림이 일어나서 다른값이 나옴
 */
package varEx;

public class FloatToBinEx {

	public static void main(String[] args) {
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f);
		
		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i); // 16진수로 출력

	}// main의 끝

}
