/* try-catch���� �帧
 * > try�������� ���ܰ� �߻��� ���
 * 1. ���ܿ� ��ġ�ϴ� catch�� Ȯ��
 * 2. O - catch���� ����� ����
 * 	  X - ���� ó������ ����
 * 
 * > try�� ������ ���ܰ� �߻����� ���� ���
 * 1. catch ���� ��ġ�� �ʰ� ��ü try - catch���� ���������� ������
 */
package ch8;

public class ExceptionEx4 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5); //���ܰ� �߻����� �ʾƼ� ������� ����
 		} // try-catch�� ��
		System.out.println(6);
	} // main�޼����� ��

}
