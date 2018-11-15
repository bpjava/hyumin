/** �ݺ��� - do-while 
 * do{
 * 		// ���ǽ��� �������� ���� �� ����� ������� ���´�. 
 * } while�����ǽ�); <-���� ; �� ���� �ʵ��� ����
 * 
 * 3�� ���(3, 6, 9)�� ���ԵǾ� ������, 
 * ���Ե� ������ŭ �ڼ��� ġ�� 369���� �� 1���� 100���� ����ϴ� ����
 * for���� ��� ���Ǵ� i������ ���꿡 ����ϸ� �ȵ�!
*/
package ch4;

class FlowEx29 {
	public static void main(String[] args) { 
		for(int i=1;i<=100;i++) {
			System.out.printf("i=%d ", i);

			int tmp = i;  //i�� ���� �ٸ� ������ �����Ѵ�.

			do {
				if(tmp%10%3==0 && tmp%10!=0) // tmp%10�� 3�� ������� Ȯ��(0 ����)
					System.out.print("¦");
			} while((tmp/=10)!=0);  // tmp /= 10�� tmp = tmp / 10�� ����

			System.out.println();
		}
	} // main
}
