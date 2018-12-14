/** TreeMap을 이용하여 키를 오름차순/내림차순 으로 정렬하기
 * 
 */
package ch11;

import java.util.*;

class TreeMapEx1 {
	public static void main(String[] args) {
		String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};
		
		// TreeMap
		TreeMap map = new TreeMap();
		
		for(int i=0; i < data.length; i++) {
			if(map.containsKey(data[i])) {
				Integer value = (Integer)map.get(data[i]);
				map.put(data[i], new Integer(value.intValue()+1 ));
			} else {
				map.put(data[i], new Integer(1));
		    }
		}
		
		Iterator it = map.entrySet().iterator();

		System.out.println("= 기본정렬 =");
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
		System.out.println();
		
		// map을 ArrayList로 변환한 다음에 Collections.sort()로 정렬
		Set set = map.entrySet();
		List list = new ArrayList(set); //ArrayList(Collection c)
		
		//static void sort(List , list, Collector c)
		Collections.sort(list, new ValueComparator());
		
		it = list.iterator();
	
		System.out.println("= 값의 크기가 큰 순서로 정렬 =");
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
	
	} // public static void main(String[] args)
	
	static class ValueComparator implements Comparator {
		public int compare(Object o1, Object o2) {
			if(o1 instanceof Map.Entry && o2 instanceof Map.Entry ) {
				Map.Entry e1 = (Map.Entry)o1;
				Map.Entry e2 = (Map.Entry)o2;
				
				int v1 = ((Integer)e1.getValue()).intValue();
				int v2 = ((Integer)e2.getValue()).intValue();
				return v2 - v1;
			}
			return -1;
		}
	} // static class ValueComparator implements Comparator 
	
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

