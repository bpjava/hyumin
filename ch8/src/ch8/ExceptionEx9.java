/* Ű���� throw�� ���Ƿ� ���� �߻���Ű��
 * 
 */
package ch8;

public class ExceptionEx9 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("���Ƿ� �߻���Ŵ");
			throw e; // ���ܸ� �߻���Ŵ
		// throw new Exception("���Ƿ� �߻���Ŵ"); // �ٿ����Ⱑ��
		} catch (Exception e) {
			System.out.println("�����޽��� : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� �����~");
	}

}
