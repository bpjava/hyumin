/** 생성자의 접근 제어자
 * 인스턴스 생성 제한 가능
 * 
 */

package ch7;

final class Singleton {
	private static Singleton s = new Singleton();
	
	private Singleton() {
			// ...
	}
	
	public static Singleton getInstance() {
		if(s==null) {
			s = new Singleton();
		}
		return s;
		// ...
	}
}

class SingletonTest {
	public static void main(String[] args) {
// 에러 private access in Singleton
//		Singleton s = new Singleton();
		Singleton s = new Singleton.getInstance();
	}

}
