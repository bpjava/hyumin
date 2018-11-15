/** 반복문 - 향상된 for문
 * for( 타입 변수명 : 배열 또는 컬렉션) { // 반복할 문장
}
 * */
package ch4;



class FlowEx22 {
	public static void main(String[] args) { 
		int[] arr = {10,20,30,40,50};
		int sum = 0;
	
		for(int i=0;i<arr.length;i++) {  // 일반적인 for문
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();		

		for(int tmp : arr) {  // 향상된 for문
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		System.out.println();		
		System.out.println("sum="+sum);
	} // main의 끝
}
