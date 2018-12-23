/** parse()를 사용하여 날짜 데이터의 출력 형식 변환
 * 문자열 -> 날짜
 * SimpleDateFormat의 parse(String source)
 */

package ch10;

import java.util.*;
import java.text.*;

class DateFormatEx3 {
	public static void main(String[] args) {
		DateFormat df  = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			// parse로 형식 변환 
			Date d = df.parse("2015년 11월 23일");
			System.out.println(df2.format(d));
		} catch (Exception e) {}
	}

}
