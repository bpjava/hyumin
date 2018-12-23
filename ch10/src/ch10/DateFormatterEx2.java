/** 문자열을 날짜와 시간으로 파싱하기 - static메서드 parse()
 * static LocalDateTime parse(CharSquence text)
 * static LocalDateTime parse(CharSquence text, DateTimeFormatter formatter)
 */

package ch10;

import java.time.*;
import java.time.format.*;

public class DateFormatterEx2 {
	public static void main(String[] args) {

		//DateTimeFormatter에 상수로 정의된 형식을 사용 시
		LocalDate newYear = 
				LocalDate.parse("2016-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
		
		// 기본 형식은 형식화 상수를 사용하지 않고도 파싱 가능
		LocalDate	  date	  = LocalDate.parse("2001-01-01");
		LocalTime	  time	  = LocalTime.parse("23:59:59");
		LocalDateTime dateTime = 
							LocalDateTime.parse("2001-01-01T23:59:59");
		
		// ofPattern()이용해서 파싱
		DateTimeFormatter pattern = 
							DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime endOfYear = 
				LocalDateTime.parse("2015-12-31 23:59:59", pattern);
		
		System.out.println(newYear);
		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);
		System.out.println(endOfYear);
	}//main의 끝

}
