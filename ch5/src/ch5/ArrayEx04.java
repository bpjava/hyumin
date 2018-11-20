/** 배열의 복사 - System.arraycopy()이용 배열 복사를 통한 크기 변경
 * 배열의 연속성을 이용하여 한번에 복사!
 * 배열의 복사는 for문보다 System.arraycopyO를 사용하는 것이 효율적이다.
 * for (int i=0; i < num.length;i++) { newNum[i] = num[i]; }
 *	>> System.arraycopy(num, 0, newNum, 0, num.length);
 * */

package ch5;

public class ArrayEx04 {
	public static void main(String[] args) {
		char[] abc = {'A', 'B','C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);
		
		//배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
		char[] result = new char[abc.length+num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		// 배열 abc을 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		// number의 인덱스 6위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
		
	}

}
