package ch6;
/*
class Tv {
	// tv�� �Ӽ�(�������)
	String color;	// ����
	boolean power;	// ��������(on/off)
	int channel;	// ä��
	
	// tv�� ���(�޼���)
	void power()	{ power = !power;}	// Tv�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() { ++channel; } // Tv�� ä���� ���̴� ����� �ϴ� �޼���
	void channelDown() { --channel; } // Tv�� ä���� ���ߴ� ����� �ϴ� �޼���
	
}
*/
class TvTest3 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
		// t1�� �����ϰ� �ִ� ��(�ּ�)�� t2�� �����Ѵ�.
		t2=t1;
		t1.channel = 7; //channel���� 7�� �����Ѵ�.
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
	}

}