/** 가변인자와 오버로딩
 * 타입... 변수명
 * 매개변수로 입력된 문자열에 구분자를 포함시켜 결합하여 반환한다. 
 */

package ch6;

class VarArgsEx {
	public static void main(String[] args) {
		String[] strArr = {"100", "200", "300"};
		
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-",strArr));
		System.out.println(concatenate(",", new String[] {"1","2","3"}));
		System.out.println("["+concatenate(",", new String[0]+"]"));
		System.out.println("["+concatenate(",")+"]");
	}

	static String concatenate(String delim, String... args) {
		String result = "";
		
		for(String str : args) {
			result += str + delim;
		}
		
		return result;
	}
	
	/*// 오버로딩된 메서드가 구분되지 않으면 에러가발생한다.
	 *  // 따라서 가변인자를 사용한 메서드는 오버로딩 하지 않아야 한다.
	 * static String concatenate(String... args) {
	 * 			return concatenate("",args);
	 * }
	 * */
}	// class
