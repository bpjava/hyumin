/** 디폴트 메서드와 static메서드
 * 디폴트메서드  - 추상 메서드의 기본적인 구현 제공
 * 충돌 해결시
 * 1. 여러 인터페이스의 디폴트 메서드 간의 충돌
 * 인터페이스를 구현한 클래스에서 디폴트 메서드를 오버라이딩
 * 2. 디폴트 메서드와 조상클래스의 메서드간의 충돌
 * 조상 클래스의 메서드가 상속되고 디폴트메서드는 무시됨
 */

package ch7;

class DefaultMethodTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.method1();
		c.method2();
		MyInterface.staticMethod(); 
		MyInterface2.staticMethod();
	}
}

class Child extends Parent implements MyInterface, MyInterface2 {
	public void method1() {	
		System.out.println("method1() in Child"); // 오버라이딩
	}			
}

class Parent {
	public void method2() {	
		System.out.println("method2() in Parent");
	}
}

interface MyInterface {
	default void method1() { 
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() { 
		System.out.println("method2() in MyInterface");
	}

	static  void staticMethod() { 
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	default void method1() { 
		System.out.println("method1() in MyInterface2");
	}

	static  void staticMethod() { 
		System.out.println("staticMethod() in MyInterface2");
	}
}
