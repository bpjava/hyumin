/** join()과 StringJoiner
 * join() - 여러 문자열 사이에 구분자를 넣어 결합 , split()과반대
 * StringJoiner 클래스를 사용
 * 
 */

package ch9;

import java.util.StringJoiner;

class StringEx4 {
	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String[] arr   = animals.split(",");

		System.out.println(String.join("-", arr));

		// StringJoiner 사용법
	 	StringJoiner sj = new StringJoiner("/","[","]");
		for(String s : arr)
			sj.add(s);

		System.out.println(sj.toString());
	}
}
