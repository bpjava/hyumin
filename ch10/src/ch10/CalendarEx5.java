/** roll(int field, int amount) - �ʵ尪 ����/����(�ٸ��ʵ念�� X)
 *	> ���� : ���ʵ尡 �����϶�, ���ʵ� ����� ���ʵ� �ڵ�����
 */

package ch10;

import java.util.*;

public class CalendarEx5 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
		date.set(2015, 0, 31); // 2015�� 1�� 31��
		System.out.println(toString(date));
		date.roll(Calendar.MONTH, 1);
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"�� "+ (date.get(Calendar.MONTH)+1)
									+"�� "+ date.get(Calendar.DATE) + "�� ";
	}

}