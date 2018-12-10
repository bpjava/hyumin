//Calendar클래스와 SimpleDateFormat클래스를 이용해서 2010년의 매월 두 번째  일요일의 날짜를 출력하시오.
package Ex10;

import java.util.*;
import java.text.*;

public class Exercise10_ {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(2010,0,1);	// cal 의 날짜를 2010년 1월 1일로 설정한다.
		
		for(int i=0 ; i < 12; i++) {
			int weekday = cal.get(Calendar.DAY_OF_WEEK); //1일의 요일을 구한다.
			
			//두번째 일요일은 1일의 요일에 따라 달라진다.
			// 1일이 일요일인 경우에는 두번째 일요일은 8일이고,
			// 1일이 다른 요일인 경우네는 16에서 요일(weekday)을 빼면 알수 있다.
			int secondSunday = (weekday==1) ? 8 : 16 - weekday;
			
			// 두번째 일요일(secondSunday)로 cal의 날짜(DAY_OF_MONTH)를 바꾼다.
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			
			Date d = cal.getTime(); //Calendar를 Date로 변경
			
			System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.").format(d));

			// 날짜를 다음달 1일로 변경한다.
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH,1);
		}
		/*Date today = new Date();
		
		SimpleDateFormat sdf1;
		F=2, E=1
		sdf1 = new SimpleDateFormat("오늘은 이 달의 F번째 일요일입니다.")
		System.out.println("이달의 몇 째 요일: " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	*/
	}

}
