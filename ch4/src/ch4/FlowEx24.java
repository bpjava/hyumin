/** �ݺ��� - while��
 * ���������� - 0���� ����
 * ���������� - 0���Ŀ� ����
 * */
package ch4;

class FlowEx24 {
	public static void main(String[] args) { 
		int i=11;

		System.out.println("��, ���� ī��Ʈ�ٿ��� �����մϴ�.");

		while(i--!=0) { // ���������� - 0���� ī��Ʈ�ٿ�
		//while(--i!=0) {  // ���������� - 0�� ��¾ȵ�
			System.out.println(i);

			for(int j=0;j<2_000_000_000;j++) {
					;
			}
		 //for(int j=0;j<2_000_000_000;j++); ���� ���ϼ�����
		//for(int j=0;j<2_000_000_000;j++) {} ���� ���ϼ�����
		}

		System.out.println("GAME OVER");
	}
}
