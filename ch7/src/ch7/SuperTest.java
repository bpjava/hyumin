/** super - �ڼ� Ŭ�������� ����Ŭ�����κ��� ��ӹ��� ����� �����ϴ� ��������
 * �ߺ� ���ǵǾ� ���� ������ ��� ���
 * static �޼��忡�� ��� �Ұ� �ν��Ͻ� �޼��忡���� ��밡��
 */
package ch7;

class SuperTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

class Parent {
	int x = 10;
}

class Child extends Parent {
	void method() {
		System.out.println("x=" + x);
		//this.x, super.x ��� ���� ������ �ǹ� - ���� �� ���
		System.out.println("this.x=" + this.x);
		System.out.println("super.x="+ super.x);
	}
}
