/** ChoiceFormat - Ư�� ������ ���ϴ� ���� ���ڿ��� ��ȯ
 * if���� switch���� ����ؼ� �پ��� �뵵�� ��� ����
 */
package ch10;

import java.text.*;

class ChoiceFormatEx1 {
	public static void main(String[] args) {
		// ������ ��谪(��������)
		double[] limits = {60, 70, 80, 90};	//���������� ū���� ������ ������Ѵ�.
		//limits, grades���� ������ ������ ����� �Ѵ�.
		// ġȯ�� ���ڿ�
		String[] grades = {"D", "C", "B", "A"};
		
		int[] scores = {100, 95, 88, 70, 52, 60, 70};
		
		ChoiceFormat form = new ChoiceFormat(limits, grades);
		
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]+":"
									+form.format(scores[i]));
		}
	}// main
}
