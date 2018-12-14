/** HashMap - 비순차적인 값들의 빈도수 구하기
 * 문자열을 읽어 HashMap에 키로저장하고 값으로 1을 저장
 * containsKey()로 이미 저장된 값이면 값을 1증가시킨다.
 */
package ch11;

import java.util.*;

public class HashMapEx4 {
	public static void main(String[] args) {
		String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};
		
		HashMap map = new HashMap();
		
		for(int i=0; i < data.length; i++) {
			if(map.containsKey(data[i])) {
				Integer value = (Integer)map.get(data[i]);
				map.put(data[i], new Integer(value.intValue()+1 ));
			} else {
				map.put(data[i], new Integer(1));
		    }
		}
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
	}// main
	
	// 결과를 그래프로 표현
	// 문자열 배열에 담긴 문자열들의 빈도수를 구할 수 있다.
	public static String printBar(char ch, int value) {
		char[] bar = new char[value];
		
		for(int i=0; i < bar.length; i++) {
			bar[i] = ch;
		}
		
		return new String(bar); // String(char[] chArr)
	}

}
