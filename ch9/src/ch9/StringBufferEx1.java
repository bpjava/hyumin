/** toString()은 오버라이딩 되어 있어서 
 * StringBuffer인스턴스에 toString()을 호줄 시 
 * 담고있는 문자열을 String으로 반환 
 *  StringBuffer인스턴스에 담긴 문자열을 비교 - 
 *  toString()을 호출해서 String인스턴스를 얻은 다음, 
 *  equals메서드를 사용해서 비교해야한다.
 */

package ch9;

class StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sb  = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");

		System.out.println("sb == sb2 ? " + (sb == sb2));
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));
		
		// StringBuffer의 내용을 String으로 변환한다.
		String s  = sb.toString();	// String s = new String(sb);와 같다.
		String s2 = sb2.toString();

		System.out.println("s.equals(s2) ? " + s.equals(s2));
	}
}
