/** ��ȯŸ���� �ִ� �޼��� 
 *  ����Ǹ鼭 ������� �ڽ��� ȣ���� �޼��忡 ��ȯ��
 */

package ch6;

class CallStackTest {
	public static void main(String[] args) {
		firstMethod();// static �޼���� ��ü ���� ���� ȣ�� ����
	}
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}
