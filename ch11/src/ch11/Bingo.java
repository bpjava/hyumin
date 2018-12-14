/** 5*5 빙고판 만들기 (랜덤) : HashSet
 * 같은숫자가 비슷한 위치에 나오는 문제점
 * --> linkedHashSet으로 구현하는게 나음
 */
package ch11;

import java.util.*;

public class Bingo {
	public static void main(String[] args) {
		Set set = new HashSet();
//나은선택Set set = new LinkedHashSet();
		int[][] board = new int[5][5];
		
		for(int i=0; set.size() < 25; i++) {
			set.add((int)(Math.random()*50)+1+"");
		}
		
		Iterator it = set.iterator();
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board.length; j++) {
			board[i][j] = Integer.parseInt((String)it.next());
			System.out.print((board[i][j]<10 ? " " : " ")+board[i][j]);
		}
		System.out.println();
	  }
	}//main
}
