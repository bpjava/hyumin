/** �迭 
 * Arrays.toString �� ���� ��¹�
 * 
 */

package ch5;

import java.util.*; // Arrays.toString()�� ����ϱ����� �߰�

public class ArrayEx02 {
	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] {100, 95, 80, 70, 60};
//		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};
	
		for (int i=0; i < iArr1.length ; i++) {
			iArr1[i] = i  + 1; //1~10�� ���ڸ� ������� �迭�� �ִ´�
		}
		
		for (int i=0; i < iArr2.length ; i++) {
			iArr2[i] = (int)(Math.random()*10) + 1; //1~10�� ���ڸ� ������� �迭�� �ִ´�
		}
		
		//�迭�� ����� ������ ����Ѵ�.
		for (int i=0; i < iArr1.length ; i++) {
			System.out.print(iArr1[i]+","); // �� �ٲ��� ���� �ʴ� print�޼��带 ���
		}
		System.out.println(); // ���� ����� �ٷ� �̾����� �ʵ��� �� �ٲ��� �Ѵ�.
		
		System.out.println(Arrays.toString(iArr2)); // ������ �� ���� �޶�����.
		System.out.println(Arrays.toString(iArr3)); // �迭 iArr�� ��� ��Ҹ� ����Ѵ�. [100, 95, 80, 70, 6���� ��µȴ�
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);// �����Ҷ����� �޶��� �� �ִ�.// [I@14318bb �� ���� ������ ���ڿ��� ��µȴ�.
		System.out.println(chArr);// abed�� �ٷµȴ� .
	}

}
