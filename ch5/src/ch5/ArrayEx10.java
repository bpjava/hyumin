/** �����ϱ�(sort) - ��������
 * ��������, ������������ �迭�� ����
 * numArr[i] = (int) (Math.random() * 10); 
 * System.out.print(numArr[i]);
 * -> System.out.print(numArr[i] = (int)(Math.random() * 10));
 */
package ch5;

public class ArrayEx10 {
	public static void main(String[] args) {
		int[] numArr = new int [10];
		
		for (int i=0; i < numArr.length ; i++) {
			System.out.print(numArr[i] = (int)(Math.random() * 10));
		}
		System.out.println();
		
		for (int i=0; i < numArr.length-1 ; i++) {
			boolean changed = false; //�ڸ��ٲ��� �߻��ߴ����� üũ�Ѵ�.
			
			for (int j=0; j < numArr.length-1-i ; j++ ) {
				// numArr[j]�� �ٷο��� ��� numArr[j+1]�� ���Ѵ�.
				if(numArr[j] > numArr[j+1]) {// ���� ���� ������ ���� �ٲ۴�.
					int temp = numArr[j];
					numArr[j]  = numArr[j+1];
					numArr[j+1] = temp;
					
					changed = true; 	// �ڸ��ٲ��� �߻������� changed�� true��.
				}
			} // end for j
			
			if (!changed) break; //�ڸ��ٲ��� ������ �ݺ����� �����.
			
			for(int k=0; k<numArr.length; k++)
				System.out.print(numArr[k]); //���ĵ� ����� ����Ѵ�.
			System.out.println();
			} // end for i
		}// main�� ��
	}
