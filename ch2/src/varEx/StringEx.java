/** 결합 순서에 따른 덧셈 결과
 * 문자열 / 숫자
 * 기본형 타입 값 -> 문자열 : ""(빈문자열)을 더해준다.
 * */
package varEx;

public class StringEx {

	public static void main(String[] args) {
	String name = "Ja" + "va";
	String str = name + 8.0;
	
	System.out.println(name);
	System.out.println(str);
	System.out.println(7 + " ");
	System.out.println(" " + 7);
	System.out.println(7 + "");
	System.out.println("" + 7);
	System.out.println("" + "");
	// "" 빈문자열을 더해주면 문자열로 변환이된다.( 숫자 14, 문자 77 )
	System.out.println(7 + 7 + "");
	System.out.println("" + 7 + 7);
	
	
		
	}

}
