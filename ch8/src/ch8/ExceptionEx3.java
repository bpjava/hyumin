/* number�� ����Ǿ��ִ� �� 100��
 *  0-9 ������ ������ ������ ���� ����� ��� 10�� �ݸ�
 *  �Ǽ��� 0���� ������ ������ �߻����� ����
 *  -- 0�� ��쿡�� ������������ ������� �ʵ��� �� (try-catch ����)
 */
package ch8;

public class ExceptionEx3 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i=0; i < 10; i++) {
			try {
			result = number / (int)(Math.random() * 10); // ���� 0 ���������� ���� �߻�
			System.out.println(result);
			} catch (ArithmeticException e) {  // ArithmeticException�� �߻��ϸ� ����Ǵ� �ڵ�
				System.out.println("0");
			}// try-catch�� ��
		} // for�� ��

	}

}
