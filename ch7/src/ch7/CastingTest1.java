/** ���������� ����ȯ
 * 
 */
package ch7;

class CastingTest1 {
	public static void main(String[] args) {
		//carŸ���� �������� car�� �����ϰ� null�� �ʱ�ȭ
		Car car = null;
		//FireEngine �ν��Ͻ��� ����, FireEngineŸ���� ���������� �����ϵ��� ��
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;	// car= (car)fe;���� ����ȯ ����
//		car.water();// ������ ���� CarŸ���� ���������δ� water()�� ȣ�� �Ұ���
		fe2 = (FireEngine)car;	// �ڼ�Ÿ�� <- ����Ÿ��
		fe2.water();
	}
}

class Car {
	String color;
	int door;
	
	void drive() {// �����ϴ� ���
		System.out.println("drive, Brrrr----");
	}
	
	void stop() {// ���ߴ� ���
		System.out.println("stop!!!!!");
	}
}	
	
class FireEngine extends Car { // �ҹ���
	void water() { // ���Ѹ��� ���
			System.out.println("water!!!!");
	}
}
