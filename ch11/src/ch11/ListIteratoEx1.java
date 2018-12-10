/** Listlterator = 양방향으로 이동하기 때문에 각 요소간의 이동이 자유롭다. 
 * 이동전에 반드시 has Next()나 hasPreviousO를 호출해서 확인 필요
 * 
 */
package ch11;

import java.util.*;

class ListIteratoEx1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()); // 순방향으로 진행하면서 읽어온다.
		}
		System.out.println();
		
		while(it.hasPrevious()) {
			System.out.print(it.previous()); // 역방향으로 진행하면서 읽어온다.
		}
		System.out.println();
	}

}
