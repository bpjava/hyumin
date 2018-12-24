/** super - 자손 클래스에서 조상클래스로부터 상속받은 멤버를 참조하는 참조변수
 * 중복 정의되어 서로 구별할 경우 사용
 * static 메서드에서 사용 불가 인스턴스 메서드에서만 사용가능
 */
package ch7;

class SuperTest2 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

class Parent {
	int x = 10;
}

class Child extends Parent {
	// int x 값 변경
	int x = 20;
	
	void method() {
		System.out.println("x=" + x);
		//this.x - Child 선언, super.x - Parent 상속
		System.out.println("this.x=" + this.x);
		System.out.println("super.x="+ super.x);
	}
}
