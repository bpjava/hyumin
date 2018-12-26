/** 인스턴스
 * getInstance()라는 메서드를 통해 
 * 직접생성하지 않고 제공받는다.
 * --> 다른 클래스의 인스턴스로 변경되어도 getInstance()만 변경하면됨
 */
package ch7;

class InterfaceTest3 {
	public static void main(String[] args) {
		A a = new A();
		a.methodA();
	}
}

 class A {
    void methodA() {
    	// 제 3의 클래스의 메서드를 통해서  인터페이스의 I를 구현한 클래스의 인터페이스를 얻어온다.
          I i = InstanceManager.getInstance();
		  i.methodB();
		  System.out.println(i.toString()); // i로 Object클래스의 메서드 호출 가능
     }
 }

 interface I {
      public abstract void methodB();
 }

 class B implements I {
     public void methodB() {
          System.out.println("methodB in B class");
     }

	  public String toString() { return "class B";}
 }

 class InstanceManager {
	public static I getInstance() {
		return new B();
	}
 }
