/** clone()을 이용해서 배열을 복사
 * 배열의 경우 오버라이딩하여 새배열 생성 후 내용을 복사하게끔 함

 */
package ch9;

import java.util.*;

class CloneEx2 {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};

        // 배열 arr을 복제해서 같은 내용의 새로운 배열을 만든다.
		int[] arrClone = arr.clone(); 
		arrClone[0]= 6;

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
	}
}
