/** ChoiceFormat - 특정 범위에 속하는 값을 문자열로 변환
 * if문과 switch문을 대신해서 다양한 용도로 사용 가능
 */
package ch10;

import java.text.*;

class ChoiceFormatEx1 {
	public static void main(String[] args) {
		// 범위의 경계값(오름차순)
		double[] limits = {60, 70, 80, 90};	//낮은값부터 큰값의 순서로 적어야한다.
		//limits, grades간의 순서와 개수를 맞춰야 한다.
		// 치환할 문자열
		String[] grades = {"D", "C", "B", "A"};
		
		int[] scores = {100, 95, 88, 70, 52, 60, 70};
		
		ChoiceFormat form = new ChoiceFormat(limits, grades);
		
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]+":"
									+form.format(scores[i]));
		}
	}// main
}
