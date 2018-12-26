/** 문자열 리터럴
 * 클래스파일에 저장
 * 같은내용은 한번만
 * "AAA"라는 문자열을 담고 있는 String인스턴스가 하나 생성 된 후，참조변수
 *  s1, s2, s3는 모두 이 String인스턴스를 참조하게 된다.
 */
package ch9;

class StringEx2 {
	public static void main(String args[]) {
		String s1 = "AAA";
		String s2 = "AAA";
		String s3 = "AAA";
		String s4 = "BBB";
	}
}
