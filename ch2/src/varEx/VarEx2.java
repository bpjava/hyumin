// tmp �ӽ� ������ �̿��� x,y �� ��ȯ
package varEx;

public class VarEx2 {
	public static void main(String[] args) {
		int x = 10, y = 20;
		int tmp = 0; // x�� ���� �ӽ÷� ������ ������ ����
		
		System.out.println("x:" + x + " y:" + y);
		
		tmp = x;
		x = y;
		y = tmp; 
		
		System.out.println("x:" + x + " y:" + y);


	}
}
