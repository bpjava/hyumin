/** 익명클래스
 * 이름이 없다
 * 선언과 객체의 생성을 동시에
 * 단한번만 사용 하나의 객체만을 생성할수 있는 일회용 클래스
 */
package ch7;

class InnerEx6 {
	Object iv = new Object(){ void method(){} };		// 익명클래스
	static Object cv = new Object(){ void method(){} };	// 익명클래스

	void myMethod() {
		Object lv = new Object(){ void method(){} };	// 익명클래스
	}
}
