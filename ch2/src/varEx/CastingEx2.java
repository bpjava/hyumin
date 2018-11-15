/**‘Integer.toBinaryString(int i)’라는 메서드를 이용하면，
 * 10진 정수를 2진 정수로 변환한 문자열을 얻을 수 있다.*/

package varEx;

public class CastingEx2 {
	public static void main(String[] args) {
		int i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b =%d%n", i, b);
		
		i = 300;
		b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b =%d%n", i, b);
		
		b = 10;
		i = (int)b;
		System.out.printf("[byte -> int] b =%d -> i=%d%n", b, i);
		
		b = -2;
		i = (int)b;
		System.out.printf("[byte -> int] b =%d -> i=%d%n", b, i);
		
		System.out.println("i="+Integer.toBinaryString(i)); // 2진수로 출력
		
	}
}
