/* float ���� �Ҽ������� 6�ڸ�, ���е��� 7�̴�
 * 10->2���� ��ȯ�� �ݿø��� �Ͼ�� �ٸ����� ����
 */
package varEx;

public class FloatToBinEx {

	public static void main(String[] args) {
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f);
		
		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i); // 16������ ���

	}// main�� ��

}
