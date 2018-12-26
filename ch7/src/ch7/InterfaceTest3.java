/** �ν��Ͻ�
 * getInstance()��� �޼��带 ���� 
 * ������������ �ʰ� �����޴´�.
 * --> �ٸ� Ŭ������ �ν��Ͻ��� ����Ǿ getInstance()�� �����ϸ��
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
    	// �� 3�� Ŭ������ �޼��带 ���ؼ�  �������̽��� I�� ������ Ŭ������ �������̽��� ���´�.
          I i = InstanceManager.getInstance();
		  i.methodB();
		  System.out.println(i.toString()); // i�� ObjectŬ������ �޼��� ȣ�� ����
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
