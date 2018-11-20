/**배열의 복사 - for문 이용 배열 복사를 통한 크기 변경
 * int[] arr = new int [5]; 
 * int[] tmp = new int [arr. length*2] ; // 기존 배열보다 길이가 2배인 배열 생성
 *	for(int i=0; i < arr.length;i++) 
 *		tmp[i] = arr [i] ; // arr[i] 의 값을 tmp[i] 에 저장
 * 	arr = tmp; // 참조변수 arr이 새로운 배열을 가리키게 한다.
 * */
package ch5;

public class ArrayEx03 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		//배열 arr에 1~5를 저장한다.
		for(int i=0; i < arr.length; i++)
			arr[i] = i + 1; // i는 0부터 시작하기 때문
		
		System.out.println("변경전 - arr.length:"+arr.length);
		for(int i=0; i < arr.length; i++)
			System.out.println("arr["+i+"]:"+arr[i]);
		
		int[] tmp = new int[arr.length*2];	// 크기를 늘린다.
		
		// 배열 arr에 저장된 값들을 배열 tmp에 복사한다.
		for(int i=0; i < arr.length; i++)
			tmp[i] = arr[i];
		
		arr = tmp; //tmp에 저장된 값을 arr에 저장한다.
		
		System.out.println("변경후 - arr.length:"+arr.length);
		for(int i=0; i < arr.length; i++)
			System.out.println("arr["+i+"]:"+arr[i]);
		
	}

}
