/** 반복문 - break문
 * 자신이 포함된 가장 가까운 반복문을 벗어나게됨
 * if문과 함께 사용되어 특정 조건을 만족하면 반복문을 벗어나게됨
 * */
package ch4;

class FlowEx30 {
	public static void main(String[] args) { 
		int sum = 0;
		int i   = 0;

		while(true) {
			if(sum > 100)
				break;
			++i;
			sum += i;
		} // end of while

		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}   
}
