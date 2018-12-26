/** String / Date 클래스의 toString()호출
 * 갖고있는 문자열 반환 / 갖고있는 날짜오 시간을 문자열로 변환후 반환
 */
package ch9;

class ToStringTest {
	public static void main(String args[]) {
		String str = new String("KOREA");
		java.util.Date today = new java.util.Date();

		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(today);
		System.out.println(today.toString());
	}
}
