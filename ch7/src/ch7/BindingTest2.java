/** 아무런 멤버도 정의되어 있지 않고 단순히 조상으로부터 멤버 상속
 * 참조변수 타입에 관계없이 조상의 멤버들을 사용할수 있다.
 * 참조변수의 타입에 따라 결과가 달라지는 경우는 
 * 조상클래스의 멤벼변수와 같은 이름의 멤버변수를 자손클래스에서
 * 중복해서 정의한 경우 뿐
 */
package ch7;

class BindingTest2 {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
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

class Child extends Parent{ }