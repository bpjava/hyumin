/** LocalDateTime �� ZonedDateTime
 */
package ch10;

import java.time.*;

class NewTimeEx2 {
	public static void main(String[] args) {
		// LocalDate�� LocalTime ���� LocalDateTime ����� 
		LocalDate date = LocalDate.of(2015, 12, 31); // 2015�� 12�� 31��
		LocalTime time = LocalTime.of(12, 34, 56);	// 12�� 34�� 56��
		
		// 2015�� 12�� 31�� 12�� 34�� 56��
		LocalDateTime dt = LocalDateTime.of(date, time);
		
		// ZoneIdŬ���� - �ð��� (�ϱ�����ð� �ڵ�ó��)
		ZoneId zid = ZoneId.of("Asia/Seoul"); 
		ZonedDateTime zdt = dt.atZone(zid);
//		String strzid = zdt.getZone().getId();
		
		// ���� Ư�� �ð����� �ð� (����)
		ZonedDateTime seoulTime = ZonedDateTime.now();
		ZoneId nyId = ZoneId.of("America/New_York");
	  ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);
	  
	  	// ZoneDatetime -> OffsetDateTime - ���� ���
	  OffsetDateTime odt = zdt.toOffsetDateTime();
	  
	  System.out.println(dt);
	  System.out.println(zid);
	  System.out.println(zdt);
	  System.out.println(seoulTime);
	  System.out.println(nyTime);
	  System.out.println(odt);
	}

}
