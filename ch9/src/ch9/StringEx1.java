/** String클래스 - 문자열의 비교
 * 문자열을 만들때는 
 * 1. 문자열 리터럴을 지정하는 방법
 * 2. 스트링클래스의 생성자이용 - 생성된것 재사용
 * 
 * == : 주소비교
 * equals() : 내용비교
 */
package ch9;

class StringEx1 {
	public static void main(String[] args) {
		//문자열 리터럴을 지정하는 방법
		String str1 = "abc";
		String str2 = "abc";

		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");

		System.out.println("str1 == str2 ?  " + (str1 == str2));
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		System.out.println();

		// 스트링클래스의 생성자이용
		String str3 = new String("\"abc\"");
		String str4 = new String("\"abc\"");

		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");

		System.out.println("str3 == str4 ? " + (str3 == str4));
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
	}
}
