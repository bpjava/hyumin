/** 인터페이스의 이해
 * - 클래스를 사용하는쪽과 클래스를 제공하는 쪽이 있다.
 * - 메서드를 사용하는쪽에서는 사용하려는 메서드의 선언부만
 * 알면 된다.
 */

package ch7;

// A(User) - class B(Provider)의 인스턴스 생성 , 메서드 호출
class A {
    public void methodA(B b) { 
          b.methodB(); 
    } 
} 

class B { 
    public void methodB() { 
          System.out.println("methodB()"); 
    } 
} 

class InterfaceTest { 
    public static void main(String args[]) { 
          A a = new A(); 
          a.methodA(new B()); 
    } 
}

/* 문제점? 클래스 B의 변경사항이 생기면 A에도 영향줌 */
