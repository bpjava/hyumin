package Ex10;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Exercise10_6 {

	public static void main(String[] args) {
		LocalDate myBirthday = LocalDate.of(1995, 4, 11);
		LocalDate now = LocalDate.now();
		
		Period pe = Period.between(myBirthday, now);
		
		System.out.println("My birth day="+ myBirthday);
		System.out.println("today    ="+ now);
		
		System.out.println("현민이 태어난지 "+ 
							pe.get(ChronoUnit.YEARS) + "년 "+
							pe.get(ChronoUnit.MONTHS) + "개월 "+
							pe.get(ChronoUnit.DAYS) + "일");
		long dday = myBirthday.until(now, ChronoUnit.DAYS);
		System.out.println("현민이 태어난지" + dday + "일");
		
		
		
		/**Calendar cal = Calendar.getInstance();
		
		cal.set(1995,3,11);
		
		Period pe = set.until(cal);
		
		System.out.println(pe);
*/
	}

}
