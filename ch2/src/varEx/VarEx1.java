/** 변수에 저장된 값을 읽어오기 */
package varEx;

public class VarEx1 {
	public static void main(String[] args) {
		int year = 0; // 변수 초기화
		int age = 14; // 나이 입력
		
		System.out.println(year);  // 출력
		System.out.println(age);  // 출력
		
		year = age + 2000;  // 년도 출력
		age = age + 1; // 저장된 값에 1을 더한다	
		
		System.out.println(year);
		System.out.println(age);

	}

}
