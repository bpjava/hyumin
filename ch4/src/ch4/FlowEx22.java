/** �ݺ��� - ���� for��
 * for( Ÿ�� ������ : �迭 �Ǵ� �÷���) { // �ݺ��� ����
}
 * */
package ch4;



class FlowEx22 {
	public static void main(String[] args) { 
		int[] arr = {10,20,30,40,50};
		int sum = 0;
	
		for(int i=0;i<arr.length;i++) {  // �Ϲ����� for��
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();		

		for(int tmp : arr) {  // ���� for��
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		System.out.println();		
		System.out.println("sum="+sum);
	} // main�� ��
}
