/** �������̽��� ����
 * - Ŭ������ ����ϴ��ʰ� Ŭ������ �����ϴ� ���� �ִ�.
 * - �޼��带 ����ϴ��ʿ����� ����Ϸ��� �޼����� ����θ�
 * �˸� �ȴ�.
 */

package ch7;

// A(User) - class B(Provider)�� �ν��Ͻ� ���� , �޼��� ȣ��
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

/* ������? Ŭ���� B�� ��������� ����� A���� ������ */
