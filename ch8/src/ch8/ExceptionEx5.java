/* try-catch���� �帧
 * > try�������� ���ܰ� �߻��� ���
 * 1. ���ܿ� ��ġ�ϴ� catch�� Ȯ��
 * 2. O - catch���� ����� ����
 * 	  X - ���� ó������ ����
 * >>��ġ ���Ŀ� �ִ� try����� ������� ���� ���� ����
 */
package ch8;

public class ExceptionEx5 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // ���Ƿ� AritchmeticException�� �߻���Ŵ
			System.out.println(4);	// ������� �ʴ´�
		} catch (ArithmeticException e) {
			System.out.println(5); //���ܰ� �߻��Ͽ� �����
		} // try-catch�� ��
		System.out.println(6);
	} //main�޼����� ��

}
