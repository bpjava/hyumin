/** Ŭ���� ����� �ν��Ͻ� ������� ������ ȣ��
 * Ŭ��������� �ν��Ͻ� ����� ���� �Ǵ� ȣ�� �ϰ��� �ϴ� ��쿡��
 * �ν��Ͻ��� �����ؾ��Ѵ�.
 */
package ch6;

class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv ;	// ���� Ŭ���������� �ν��Ͻ� ������ ����� �� ����.
	static int cv2 = new MemberCall().iv;	// ��ü �����ϸ� ��밡��.
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); // ����, Ŭ���� �޼��忡�� �ν��Ͻ� ���� ��� �Ұ�
		MemberCall c = new MemberCall();
		System.out.println(c.iv);	// ��ü �����ϸ� �ν��Ͻ� ���� ���� ����
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);// �ν��Ͻ� �޼��忡���� �ν��Ͻ� ������ �ٷ� ��� ����
	}
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1(); // ����, Ŭ���� �޼��忡���� �ν��Ͻ� �޼��带 ȣ���� �� ����
		MemberCall c = new MemberCall();
		c.instanceMethod1();// �ν��Ͻ��� ������ �Ŀ��� ȣ�� �� �� ����
	}
	
	void instanceMethod2() { // �ν��Ͻ� �޼��忡���� �ν��Ͻ� �޼���� Ŭ�����޼���
		staticMethod1();       // ��� �ν��Ͻ� �������� �ٷ� ȣ���� �����ϴ�.
		instanceMethod1();
	}
}
