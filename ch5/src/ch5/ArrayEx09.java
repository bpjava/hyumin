/**임의의 값으로 배열 채우기 
 * 연속 또는 불연속적인 값들로 배열을 초기화 한다.
 * 1. 불연속적인 값 담기 
 * 2. 임의선택 index에 배열 요소 채우기
 */
package ch5;

import java.util.*;	//Arrays.toString()을 사용하기 위해 추가

public class ArrayEx09 {
	public static void main(String[] args) {
		int[] code = { -4, -1, 3, 6, 11 };		//불연속적인 값들로 구성된 배열
		int[] arr = new int[10];
		
		for (int i=0; i < arr.length ; i++ ) {
			int tmp = (int)(Math.random() * code.length);  // -> int tmp = (int)(Math.random() * 5); 
			arr[i] = code[tmp];
		}
		
		System.out.println(Arrays.toString(arr));
	} // main문의 끝
}
