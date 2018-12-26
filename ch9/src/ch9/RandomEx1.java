/** java.util.Random클래스
 * Random인스턴스 rand와 rand2가 같은 종자값(seed)을 사용하기 때문에 
 * 같은 값들을 같 은 순서로 얻는 다
 * 같은 종자값을 갖는 Random인스턴스는 
 * 시스템이나 실행시간 등에 관계 없이 항상 같은 값을 같은 순서로 반환
 */ 
package ch9;

import java.util.*;

class RandomEx1 {
	public static void main(String args[]) {
		Random rand  = new Random(1);
		Random rand2 = new Random(1);

		System.out.println("= rand =");
		for(int i=0; i < 5; i++)
			System.out.println(i + ":" + rand.nextInt());

		System.out.println();
		System.out.println("= rand2 =");
		for(int i=0; i < 5; i++)
			System.out.println(i + ":" + rand2.nextInt());
	}
}
