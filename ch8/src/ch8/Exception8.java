/* ���ܹ߻� �� 	printStackTraceO �Ǵ� getMessageO ���
 * 
 * 	printStackTraceO - ���ܹ߻� ����� ȣ�⽺��(Call Stack)�� �־��� �޼����� ������ ���� �޽����� ȭ�鿡 ����Ѵ�.
 *	getMessageO - �߻��� ����Ŭ������ �ν��Ͻ��� ����� �޽����� ���� �� �ִ�.
*/
package ch8;

public class Exception8 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // !!!���ܹ߻�!!!
			System.out.println(4);	// ������� �ʴ´�
		} catch (ArithmeticException ae) {
			ae.printStackTrace(); // �������� ae�� ���� ������ ArithmeticException�� ���� ����
				System.out.println("���ܸ޽��� : " + ae.getMessage()); 
		} // try-catch�� ��
		System.out.println(6);
	}

}
