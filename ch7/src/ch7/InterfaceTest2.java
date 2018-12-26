/** 인터페이스 사용시 주의점
 * 매개변수 동적으로 제공받기 
 */
package ch7;

// 클래스 A가 매개변수를 통해서 인터페이스 I를 구현한 클래스의 인스턴스를 동적으로 받는다.
class A {
    void autoPlay(I i) {
          i.play();
     }
 }

 interface I {
      public abstract void play();
 }

 class B implements I {
     public void play() {
          System.out.println("play in B class");
     }
 }

 class C implements I {
     public void play() {
          System.out.println("play in C class");
     }
 }

class InterfaceTest2 {
	public static void main(String[] args) {
		A a = new A();
		a.autoPlay(new B()); // void autoPlay(I i)호출
		a.autoPlay(new C()); // void autoPlay(I i)호출
	}
}
