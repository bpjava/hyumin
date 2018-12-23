/** Date 인스턴스 -- Calendar인스턴스 간의 변환 방법
 * Date 인스턴스만 format 메서드에 사용가능
 */

package ch10;

import java.util.*;
import java.text.*;

class DateFormatEx2 {
	public static void main(String[] args) {
		// Calendar와 Date간의 변환 하는법
		Calendar cal = Calendar.getInstance();
		cal.set(2015, 9, 3); // 2015년 10월 3일 
		
		// date인스턴스만 format메서드에 사용가능
		Date day = cal.getTime();
		
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		sdf1	= new SimpleDateFormat("yyyy-MM-dd");
		sdf2	= new SimpleDateFormat("yy-MM-dd E요일");
		sdf3	= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf4	= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		
		System.out.println(sdf1.format(day));// format (Date d)
		System.out.println(sdf2.format(day));
		System.out.println(sdf3.format(day));
		System.out.println(sdf4.format(day));
		
	}

}
