// int Ÿ���� �������� intŸ������ �����⶧���� ������ ������ ����ȯ�� �̷�������Ѵ�.
// long������ �ڵ� ����ȯ�Ǿ ���� ������ �ʴ´�.
// long c = (long)a*b; 
package ch3;

public class OperatorEx8 {

	public static void main(String[] args) {
		int a = 1_000_000; // 1,000,000 �鸸
		int b = 2_000_000; // 2,000,000 �̹鸸
		
		long c = a + b; 	// a * b  2,000,000,000,000 ?
		
		System.out.println(c);
	}

}
