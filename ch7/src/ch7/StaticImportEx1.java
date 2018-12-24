/** static import문
 * static 멤버를 호출할때 클래스 이름을 생략할 수 있다.
 */
package ch7;

import static java.lang.System.out;
import static java.lang.Math.*;

class StaticImportEx1 {
	public static void main(String[] args) {
		//System.out.println(Math.random());
		out.pirntln(random());
		
		//System.out.println("Math.PI : " + Math.PI);
		out.pirntln("Math.PI : " + PI);
	}

}
