/** LocalDateTime 과 ZonedDateTime
 */
package ch10;

import java.time.*;

class NewTimeEx2 {
	public static void main(String[] args) {
		// LocalDate와 LocalTime 으로 LocalDateTime 만들기 
		LocalDate date = LocalDate.of(2015, 12, 31); // 2015년 12월 31일
		LocalTime time = LocalTime.of(12, 34, 56);	// 12시 34분 56초
		
		// 2015년 12월 31일 12시 34분 56초
		LocalDateTime dt = LocalDateTime.of(date, time);
		
		// ZoneId클래스 - 시간대 (일광절약시간 자동처리)
		ZoneId zid = ZoneId.of("Asia/Seoul"); 
		ZonedDateTime zdt = dt.atZone(zid);
//		String strzid = zdt.getZone().getId();
		
		// 현재 특정 시간대의 시간 (뉴욕)
		ZonedDateTime seoulTime = ZonedDateTime.now();
		ZoneId nyId = ZoneId.of("America/New_York");
	  ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);
	  
	  	// ZoneDatetime -> OffsetDateTime - 시차 계산
	  OffsetDateTime odt = zdt.toOffsetDateTime();
	  
	  System.out.println(dt);
	  System.out.println(zid);
	  System.out.println(zdt);
	  System.out.println(seoulTime);
	  System.out.println(nyTime);
	  System.out.println(odt);
	}

}
