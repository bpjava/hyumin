/** parse()�� ����Ͽ� ��¥ �������� ��� ���� ��ȯ
 * ���ڿ� -> ��¥
 * SimpleDateFormat�� parse(String source)
 */

package ch10;

import java.util.*;
import java.text.*;

class DateFormatEx3 {
	public static void main(String[] args) {
		DateFormat df  = new SimpleDateFormat("yyyy�� MM�� dd��");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			// parse�� ���� ��ȯ 
			Date d = df.parse("2015�� 11�� 23��");
			System.out.println(df2.format(d));
		} catch (Exception e) {}
	}

}
