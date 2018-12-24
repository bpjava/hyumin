/** 인스턴스 변수에 직접 접근시, 참조변수의 타입에 따라
 * 사용되는 인스턴스 변수가 달라질 수 있으므로 주의
 */
package ch7;

class BindingTest3 {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println();
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

class Child extends Parent{
	int x = 200;
	
	void method() {
		System.out.println("x=" + x);//this.x와 같다
		System.out.println("super.x=" + super.x);
		System.out.println("this.x="+this.x);
	}
}