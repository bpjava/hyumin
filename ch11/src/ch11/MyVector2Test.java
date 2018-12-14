/** MyVector2객체를 생성하고 데이터를 저장한 다음 Iterator를 통해서 
 * 첫 번째와 두 번째에 저장된 데이터를 삭제한다
 * 
 */

package ch11;
import java.util.*;

class MyVector2Test {
	public static void main(String args [] ) {
		MyVector2 v = new MyVector2();
		v.add("0");
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		
		System.out.println("삭제 전 : " +v);
		Iterator it = v.iterator();
		it.next();
		it.remove();
		it.next();
		it.remove();
		
		System.out.println("삭제 후 : "+v);
	}

}
