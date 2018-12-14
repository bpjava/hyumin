/** TreeSet을 이용한 로또
 * 저장시 정렬되므로 
 * 정렬 필요가 없다!
 */
package ch11;

import java.util.*;

public class TreeSetLotto {
	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for(int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num); // set.add(new Integer(num));
		}
		
		System.out.println(set);

	}

}
