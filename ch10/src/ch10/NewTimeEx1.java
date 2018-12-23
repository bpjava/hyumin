/** LocalDate와 LocalTime
 *  now() - 현재 날짜 시간
 *  of() - 지정 날짜 시간
 *  
 *  get() - 특정 필드 값 가져오기
 *  with(), plus(), minus() - 필드의 값 변경
 *  isAfter(), isBefore(), isEqual() - 날짜의 시간비교
 *  
 */
package ch10;

import java.time.*;
import java.time.temporal.*;

class NewTimeEx1 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();// 오늘의 날짜
		LocalTime now = LocalTime.now();// 현재 시간
		
		LocalDate birthDate = LocalDate.of(1999, 12, 31);// 1999년 12월 31일
		LocalTime birthTime = LocalTime.of(23, 59, 59);// 23시 59분 59초
		
		System.out.println("today="+today);
		System.out.println("now="+now);
		System.out.println("birthDate="+birthDate); // 1999-12-31
		System.out.println("birthTime="+birthTime); // 23:59:59
		
		System.out.println(birthDate.withYear(2000)); // 2000-12-31
		System.out.println(birthDate.plusDays(1));		   // 2000-01-01
		System.out.println(birthDate.plus(1,ChronoUnit.DAYS)); //2000-01-01
		
		// 23:59:59 -> 23:00
		System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS));
		
		// 특정 ChronoField의 범위를 알아내는 방법
		System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range()); // 1-24
		System.out.println(ChronoField.HOUR_OF_DAY.range());	   // 0-23
	}

}
