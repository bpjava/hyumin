/* if �� ��ȣ �ݱ��� �߿伺
 * ��ȣ�� ���� ���� ��� �ѹ��常 ��µ�
 */
package ch4;

import java.util.*; // ScannerŬ������ ����ϱ� ���� �߰�

public class FlowEx2 {
	public static void main(String[] args) {
		int input;
		
		System.out.print("���ڸ� �ϳ� �Է��ϼ���.>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); //ȭ���� ���� �Է¹��� ������ tmp�� ����
		input = Integer.parseInt(tmp);   // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
		
		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		}
		
		if(input!=0)
			System.out.println("�Է��Ͻ� ���ڴ� 0�̾ƴմϴ�."); //if���� ���ٸ� ����
			System.out.printf("�Է��Ͻ� ���ڴ� %d�Դϴ�.", input); // if���� ��ȣ�� �������� �ʱ� ������ ��� ��쿡�� ��µȴ�
			
	}//main�� ��

}
