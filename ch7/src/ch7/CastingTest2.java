/** ���� ��Ӱ��迡 �ִ� Ŭ���� Ÿ���� �������� ���� ����ȯ�� ���������
 * �����Ӱ� ����� �� ������, ���������� �����ϰ� �ִ� �ν��Ͻ��� �ڼ�Ÿ������
 * ����ȯ�� �ϴ� ���� ��� ���� �ʴ´�. ���������� ����Ű�� �ν��Ͻ� Ÿ���� 
 * �������� Ȯ���ϴ� ���� �߿��ϴ�.
 */
package ch7;

public class CastingTest2 {
	public static void main(String[] args) {
	//	Car car = new Car();
		Car car = new FireEngine();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car;	// 8��° �� , �������� ok ����� ����
		fe.drive();
		car2 = fe;
		car2.drive();
	}

}
