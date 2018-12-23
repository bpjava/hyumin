/** add(int field, int amount) - �ʵ尪 ����/����
 * roll(int field, int amount) - �ʵ尪 ����/����(�ٸ��ʵ念�� X)
 *> ���� : ���ʵ尡 �����϶�, ���ʵ� ����� ���ʵ� �ڵ�����
 */

package ch10;

import java.util.*;

public class CalendarEx4 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
		date.set(2015, 7, 31); // 2015�� 8�� 31��
		
		System.out.println(toString(date));
		// add() ���� - 9�� 1��
		System.out.println("= 1�� �� =");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		// add() ���� - 3�� 1��
		System.out.println("= 6�� �� =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		// add() �޼���� roll() �޼����� ��
		
		// roll() - 3�� 1��
		System.out.println("= 31�� ��(roll) =");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		// add() - 4�� 1��
		System.out.println("= 31�� ��(add) =");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"�� "+ (date.get(Calendar.MONTH)+1)
									+"�� "+ date.get(Calendar.DATE) + "�� ";
	}
}
