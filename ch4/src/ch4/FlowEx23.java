/** �ݺ��� - while��
 * while (���ǽ�) �� 
 * 		// ���ǽ��� �������� �� (true) �� ����, �ݺ��� ������� ���´�.
 * }
 * */
package ch4;

class FlowEx23 {
	public static void main(String[] args) { 
		int i= 5;

		while(i--!=0) { // ���������� ; 0�̵Ǹ� ����(0������ ���)
			System.out.println(i + " - I can do it.");
		}
	} // main�� ��
}
