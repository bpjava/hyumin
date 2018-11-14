// 적절한 형변환에는 자료손실에 유의하여 자료형의 크기를 고려해야한다.

package ch3;

public class OperatorEx7 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b); // 300이 나와야하지만 데이터 손실 발생하여 44 출력
		System.out.println(c);

	}

}
