/** �ݺ��� - continue
 *  �ݺ��� �������� ��� ����
 *    for�� - ������
 *    while, do-while - ���ǽ�
 *  ���� �̵�
 * */
package ch4;

class FlowEx31 {
	public static void main(String[] args) {
		for(int i=0;i <= 10;i++) {
			if (i%3==0)
				continue;
			System.out.println(i); //i%3==0 �ϰ�� �����������
		}// continue ���� ����Ǹ� �������� �̵�
	}
}
