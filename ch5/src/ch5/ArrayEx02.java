/** 배열 
 * Arrays.toString 및 여러 출력법
 * 
 */

package ch5;

import java.util.*; // Arrays.toString()을 사용하기위해 추가

public class ArrayEx02 {
	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] {100, 95, 80, 70, 60};
//		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};
	
		for (int i=0; i < iArr1.length ; i++) {
			iArr1[i] = i  + 1; //1~10의 숫자를 순서대로 배열에 넣는다
		}
		
		for (int i=0; i < iArr2.length ; i++) {
			iArr2[i] = (int)(Math.random()*10) + 1; //1~10의 숫자를 순서대로 배열에 넣는다
		}
		
		//배열에 저장된 값들을 출력한다.
		for (int i=0; i < iArr1.length ; i++) {
			System.out.print(iArr1[i]+","); // 줄 바꿈을 하지 않는 print메서드를 사용
		}
		System.out.println(); // 다음 출력이 바로 이어지지 않도록 줄 바꿈을 한다.
		
		System.out.println(Arrays.toString(iArr2)); // 실행할 때 마다 달라진다.
		System.out.println(Arrays.toString(iArr3)); // 배열 iArr의 모든 요소를 출력한다. [100, 95, 80, 70, 6이이 출력된다
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);// 실행할때마다 달라질 수 있다.// [I@14318bb 와 같은 형식의 문자열이 출력된다.
		System.out.println(chArr);// abed가 줄력된다 .
	}

}
