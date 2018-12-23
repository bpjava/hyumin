/**MessageFormat - 데이터를 정해진 양식에 맞게 출력
 * 반복문으로 하나이상의 데이터 집합 출력하기
 */
package ch10;

import java.text.*;

class MessageFormatEx2 {
	public static void main(String[] args) {
		String tableName = "CUST_INFO";
		String msg = "INSERT INTO " + tableName
								   + " VALUES (''{0},''{1},''{2},''{3}'');"; // 홀따옴표(') 출력시 한번더 입력 ('')
		Object[][] arguments = {
				{"이자바", "02-123-1234", "27", "07-09"},
				{"김프로", "032-333-1234", "33", "10-07"},
		};
		
		for(int i=0; i < arguments.length; i++) {
			String result = MessageFormat.format(msg, arguments[i]);
			System.out.println(result);
		}
	}// main

}
