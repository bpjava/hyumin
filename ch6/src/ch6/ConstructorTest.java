/** 생성자
 * 컴파일러는 클래스내에 생성자가 하나도 없을때 자동적으로 기본 생성자를 추가해준다.
 */
package ch6;

class Data1 {
	int value;
}

class Data2 {
	int value;
	
	Data2(int x) { // 매개변수가 있는 생성자.
		value = x;
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
	//	Data d1 = new Data1();
	//	Data d2 = new Data2();	// compile error 발생
	}

}
