/** MessageFormat - 데이터를 정해진 양식에 맞게 출력
 * 양식을 미리 작성 / 다수의 데이터를 같은 양식으로 출력할때 사용
 * ex) 안내문 / 하나의 데이터를 다양한 양식으로 출력
 * parse()를 이용하면 지정된 양식에서 필요한 데이터만을 손쉽게 추출
 */
package ch10;

import java.text.*;

class MessageFormatEx1 {
	public static void main(String[] args) {
		String msg = "Name: {0} \nTel: {1}\nAge: {2} \nBirthday: {3}";
		
		Object[] arguments = {
				"이자바", "02-123-1234", "27", "07-09"
		};
		
		String result = 
				MessageFormat.format(msg, arguments);
		System.out.println(result);
	}

}
