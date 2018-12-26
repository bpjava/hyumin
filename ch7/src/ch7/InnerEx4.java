/**외부 클래스가 아닌 다른 클래스에서 내부 클래스를 생성
 * 내부 클래스의 멤버에 접근하는 예제
 * 외부 클래스명$내부 클래스명.class
 */
package ch7;

class Outer {
	class InstanceInner {
		int iv=100;
	}
	static class StaticInner {
		int iv=200;
		static int cv=300;
	}

	void myMethod() {
		class LocalInner {
			int iv=400;
		}
	}
}

class InnerEx4 {
	public static void main(String[] args) {
		// 인스턴스 클래스의 인스턴스를 생성하려면
		// 외부클래스의 인스턴스를 먼저 생성해야한다.
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();

		System.out.println("ii.iv : "+ ii.iv);
		System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);

	     // 스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도된다.
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv : "+ si.iv);
	}
}
