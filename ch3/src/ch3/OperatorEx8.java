// int 타입의 연산결과는 int타입으로 나오기때문에 이전에 적절한 형변환이 이루어져야한다.
// long형으로 자동 형변환되어도 값은 변하지 않는다.
// long c = (long)a*b; 
package ch3;

public class OperatorEx8 {

	public static void main(String[] args) {
		int a = 1_000_000; // 1,000,000 백만
		int b = 2_000_000; // 2,000,000 이백만
		
		long c = a + b; 	// a * b  2,000,000,000,000 ?
		
		System.out.println(c);
	}

}
