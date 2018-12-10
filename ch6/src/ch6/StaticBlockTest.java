/** 명시적 초기화를 통해 배열 arr 을 생성
 * 클래스 초기화 블럭을 이용해서 배열의 각 요소들을 random()을 사용해서
 * 임의의 값으로 채우도록 했다.
 * 배열이나 예외 처리가 필요한 초기화에서는 명시적 초기화만으로는 복잡한 초기화 작업을 할수 없어서
 * 클래스 초기화 블록을 사용해야함
 */
package ch6;

class StaticBlockTest 
{
	static int[] arr = new int[10];
	
	static {
		for(int i=0; i<arr.length; i++) {
			// 1과 10의 임의의 값을 배열 arr에 저장한다.
			arr[i] = (int)(Math.random()*10) + 1;
		}
	}
	
	public static void main(String args[]) {
		for(int i=0; i<arr.length; i++)
			System.out.println("arr ["+ i + "] :" + arr[i]);
	}
}

