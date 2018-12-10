//CalendarŬ������ SimpleDateFormatŬ������ �̿��ؼ� 2010���� �ſ� �� ��°  �Ͽ����� ��¥�� ����Ͻÿ�.
package Ex10;

import java.util.*;
import java.text.*;

public class Exercise10_ {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(2010,0,1);	// cal �� ��¥�� 2010�� 1�� 1�Ϸ� �����Ѵ�.
		
		for(int i=0 ; i < 12; i++) {
			int weekday = cal.get(Calendar.DAY_OF_WEEK); //1���� ������ ���Ѵ�.
			
			//�ι�° �Ͽ����� 1���� ���Ͽ� ���� �޶�����.
			// 1���� �Ͽ����� ��쿡�� �ι�° �Ͽ����� 8���̰�,
			// 1���� �ٸ� ������ ���״� 16���� ����(weekday)�� ���� �˼� �ִ�.
			int secondSunday = (weekday==1) ? 8 : 16 - weekday;
			
			// �ι�° �Ͽ���(secondSunday)�� cal�� ��¥(DAY_OF_MONTH)�� �ٲ۴�.
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			
			Date d = cal.getTime(); //Calendar�� Date�� ����
			
			System.out.println(new SimpleDateFormat("yyyy-MM-dd�� F��° E�����Դϴ�.").format(d));

			// ��¥�� ������ 1�Ϸ� �����Ѵ�.
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH,1);
		}
		/*Date today = new Date();
		
		SimpleDateFormat sdf1;
		F=2, E=1
		sdf1 = new SimpleDateFormat("������ �� ���� F��° �Ͽ����Դϴ�.")
		System.out.println("�̴��� �� ° ����: " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	*/
	}

}
