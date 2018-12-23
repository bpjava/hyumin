/** 패턴을 사용하여 ChoiceFormatEx 변경
 * 구분자로 #(경계값범위포함), <(경계값범위포함X)를 사용
 * 'limit#value'의 형태
 */

package ch10;

import java.text.*;

class ChoiceFormatEx2 {
	public static void main(String[] args) {
		// 80은 B에 포함 X('<'), 90은 A에 포함('#')
		String pattern = "60#D|70#C|80<B|90#A";
		int[] scores = { 91, 90, 80, 88, 70, 52, 60};

		ChoiceFormat form = new ChoiceFormat(pattern);
		
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]+":"+form.format(scores[i]));
		}
	}
}
