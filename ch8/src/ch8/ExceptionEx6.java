/* try-catch���� �帧
 * catch ����
 *  () : ó���ϰ��� �ϴ� ���ܿ� ���� Ÿ���� �������� ����
 *  > try ������ ���ܰ� �߻��ߴٸ�
 *  ó�������� catch ���� ã�´�.(instanceof) 
 *  >> ��� ����Ŭ������ ExceptionŬ������ �ڼ�
 */
package ch8;

public class ExceptionEx6 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // ���Ƿ� AritchmeticException�� �߻���Ŵ
			System.out.println(4);	// ������� �ʴ´�
		} catch (Exception e) {// AritchmeticException ��� Exception�� ���
			System.out.println(5); //���ܰ� �߻��Ͽ� �����
		} // try-catch�� ��
		System.out.println(6);
	}
}