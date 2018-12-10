/** �����ڿ��� �ٸ� ������ ȣ���ϱ� - this(), this
 * �������� �̸����� Ŭ�����̸� ��� this�� ����Ѵ�.
 * �� �����ڿ��� �ٸ� �����ڸ� ȣ���Ҷ��� �ݵ�� ù�ٿ����� �����ϴ�.
 * this - �ν��Ͻ� �ڽ��� ����Ű�� ��������, �ν��Ͻ��� �ּҰ� ����Ǿ� �ִ�. 
 * 		��� �ν��Ͻ��޼��忡 ���������� ������ ä�� �����Ѵ�.
 * this() , this(�Ű�����) - ������, ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� 
 * 		����Ѵ�.
 */
package ch6;
/*

class Car {
	String color;  // ����
	String gearType;// ���ӱ� ���� - auto(�ڵ�), manual(����)
	int door;		//���� ����
	
	// this ���! 
	Car() { // Car(String color, String gearType, int door)�� ȣ��
		this("white", "auto", 4);
	}

	Car(String color) {
		this(color, "auto", 4);
	}
		
	Car(String color, String gearType, int door) {
		this.color = color;  // ����
		this.gearType = gearType;// ���ӱ� ���� - auto(�ڵ�), manual(����)
		this.door = door;		//���� ����
	}
}
*/
class CarTest2 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("Blue");
		
		System.out.println("c1�� color=" + c1.color + ", gearType="
						+ c1.gearType + ", door=" + c1.door);
		System.out.println("c2�� color=" + c2.color + ", gearType="
				+ c2.gearType + ", door=" + c2.door);

	}

}
