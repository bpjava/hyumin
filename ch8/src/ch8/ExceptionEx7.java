/* try-catch���� �帧
 * ù ��° �˻翡�� ��ġ�ϴ� catch���� ã�ұ� ������ 
 * �� ��° catch���� �˻����� �ʰ� �ȴ�
 */
package ch8;

public class ExceptionEx7 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // ���Ƿ� AritchmeticException�� �߻���Ŵ
			System.out.println(4);	// ������� �ʴ´�
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)  // instanceof �˻��� ���ܰ� �߻��Ͽ� �����
				System.out.println("true");
			System.out.println("ArithmeticException"); 
		} catch (Exception e) {// AritchmeticException�� ������ ��� ���ܰ� ó��
			System.out.println("Exception"); 
		} // try-catch�� ��
		System.out.println(6);
	}// main �޼����� ��

}
