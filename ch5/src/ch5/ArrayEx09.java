/**������ ������ �迭 ä��� 
 * ���� �Ǵ� �ҿ������� ����� �迭�� �ʱ�ȭ �Ѵ�.
 * 1. �ҿ������� �� ��� 
 * 2. ���Ǽ��� index�� �迭 ��� ä���
 */
package ch5;

import java.util.*;	//Arrays.toString()�� ����ϱ� ���� �߰�

public class ArrayEx09 {
	public static void main(String[] args) {
		int[] code = { -4, -1, 3, 6, 11 };		//�ҿ������� ����� ������ �迭
		int[] arr = new int[10];
		
		for (int i=0; i < arr.length ; i++ ) {
			int tmp = (int)(Math.random() * code.length);  // -> int tmp = (int)(Math.random() * 5); 
			arr[i] = code[tmp];
		}
		
		System.out.println(Arrays.toString(arr));
	} // main���� ��
}
