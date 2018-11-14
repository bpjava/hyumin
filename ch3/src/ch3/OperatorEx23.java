/* 문자열의 비교
 * 
 */
package ch3;

public class OperatorEx23 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc");
		System.out.printf(" str1.equals(\"abc\") ? %b%n", str1.equals("abc"));// 문자열 비교시 equals()
		System.out.printf(" str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf(" str2.equals(\"ABC\") ? %b%n", str2.equals("ABC")); // 대소문자구분
		System.out.printf(" str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equals("ABC")); // 대소문자 무시
		
	}

}
