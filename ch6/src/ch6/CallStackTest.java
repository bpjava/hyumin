/** 반환타입이 있는 메서드 
 *  종료되면서 결과값을 자신을 호출한 메서드에 반환함
 */

package ch6;

class CallStackTest {
	public static void main(String[] args) {
		firstMethod();// static 메서드는 객체 생성 없이 호출 가능
	}
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}
