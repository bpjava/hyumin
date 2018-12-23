/** add(int field, int amount) - 필드값 증가/감소
 * roll(int field, int amount) - 필드값 증가/감소(다른필드영향 X)
 *> 예외 : 일필드가 말일일때, 월필드 변경시 일필드 자동변경
 */

package ch10;

import java.util.*;

public class CalendarEx4 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
		date.set(2015, 7, 31); // 2015년 8월 31일
		
		System.out.println(toString(date));
		// add() 증가 - 9월 1일
		System.out.println("= 1일 후 =");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		// add() 감소 - 3월 1일
		System.out.println("= 6달 전 =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		// add() 메서드와 roll() 메서드의 비교
		
		// roll() - 3월 1일
		System.out.println("= 31일 후(roll) =");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		// add() - 4월 1일
		System.out.println("= 31일 후(add) =");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1)
									+"월 "+ date.get(Calendar.DATE) + "일 ";
	}
}
