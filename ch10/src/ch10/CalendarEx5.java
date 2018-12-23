/** roll(int field, int amount) - 필드값 증가/감소(다른필드영향 X)
 *	> 예외 : 일필드가 말일일때, 월필드 변경시 일필드 자동변경
 */

package ch10;

import java.util.*;

public class CalendarEx5 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
		date.set(2015, 0, 31); // 2015년 1월 31일
		System.out.println(toString(date));
		date.roll(Calendar.MONTH, 1);
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1)
									+"월 "+ date.get(Calendar.DATE) + "일 ";
	}

}
