/** 참조변수와 인스턴스의 연결
 * 멥버변수의 경우 참조변수의 타입에 따라 달라진다 
 */

package ch7;

class BindingTest {
	public static void main(String[] args) {
		Parent p = new Child2();
		Child2 c = new Child2();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class Parent {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}