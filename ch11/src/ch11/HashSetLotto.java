/** HashSet - �ߺ� X �� ������ �ζ� ��ȣ �����
 * 
 */
package ch11;

import java.util.*;

public class HashSetLotto {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		for (int i=0; set.size() < 6;i++) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(new Integer(num));
		}
		
		// ���Ľ� list�������̽� Ÿ������ �����
		List list = new LinkedList(set);	// LinkedList(Collection c)
		// ũ������� ����
		Collections.sort(list);
		System.out.println(list);
	}
}
