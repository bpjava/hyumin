/** super - �ڼ� Ŭ�������� ����Ŭ�����κ��� ��ӹ��� ����� �����ϴ� ��������
 * �ߺ� ���ǵǾ� ���� ������ ��� ���
 * static �޼��忡�� ��� �Ұ� �ν��Ͻ� �޼��忡���� ��밡��
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
	// int x �� ����
	int x = 20;
	
	void method() {
		System.out.println("x=" + x);
		//this.x - Child ����, super.x - Parent ���
		System.out.println("this.x=" + this.x);
		System.out.println("super.x="+ super.x);
	}
}
