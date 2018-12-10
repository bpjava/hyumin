/** ��������� �ʱ�ȭ �ñ�� ����
 * Ŭ���������� �ʱ�ȭ���� : Ŭ������ ó�� �ε��� �� �� �ѹ� �ʱ�ȭ �ȴ�. 
 * �ν��Ͻ������� �ʱ�ȭ���� : �ν��Ͻ��� ������ ������ �� �ν��Ͻ����� �ʱ�ȭ�� �̷������.
 * Ŭ���������� �ʱ�ȭ���� : �⺻�� - ������ʱ�ȭ - Ŭ���� �ʱ�ȭ �� 
 * �ν��Ͻ������� �ʱ�ȭ���� : �⺻�� - ������ʱ�ȭ - �ν��Ͻ� �ʱ�ȭ �� - ������
 */
package ch6;

class Product {
	static int count = 0; // ������ �ν��Ͻ��� ���� �����ϱ� ���� ����
	int serialNo;			// �ν��Ͻ� ������ ��ȣ
	
	{// Product�ν��Ͻ��� ������ �� ���� count�� ���� 1�� �������Ѽ� serialNo�� ����
		++count;
		serialNo = count;
	}
	
	public Product() {} // �⺻������, ��������
}

class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1�� ��ǰ��ȣ(serial no)�� " + p1.serialNo);
		System.out.println("p2�� ��ǰ��ȣ(serial no)�� " + p2.serialNo);
		System.out.println("p3�� ��ǰ��ȣ(serial no)�� " + p3.serialNo);
		System.out.println("����� ��ǰ�� ���� ��� " + Product.count+ "�� �Դϴ�.");
}

}
