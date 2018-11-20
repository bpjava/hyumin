/** String클래스의 charAt(int idx)을 사용
 * 문자열 중에서 idx번째 위치에 있는 문자를 반환 / 0부터 시작
 */
package ch5;

public class ArrayEx14 {
	public static void main(String[] args) {
		String src = "ABCDE";
		
		for(int i=0; i < src.length(); i++) {
			char ch = src.charAt(i); //src의 i번째 문자를 ch에 저장
			System.out.println("src.charAt("+i+"):"+ch);
		}
		
		char[] chArr = src.toCharArray();  //String을 char[]로 변환
		
		System.out.println(chArr);  //char배열 (char[])을 출력
	}

}
