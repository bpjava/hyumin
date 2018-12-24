/** 서로 상속관계에 있는 클래스 타입의 잠조변수 간의 형변환은 양방향으로
 * 자유롭게 수행될 수 있으나, 참조변수가 참조하고 있는 인스턴스의 자손타입으로
 * 형변환을 하는 것은 허용 되지 않는다. 참조변수가 가리키는 인스턴스 타입이 
 * 무엇인지 확인하는 것이 중요하다.
 */
package ch7;

public class CastingTest2 {
	public static void main(String[] args) {
	//	Car car = new Car();
		Car car = new FireEngine();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car;	// 8번째 줄 , 컴파일은 ok 실행시 오류
		fe.drive();
		car2 = fe;
		car2.drive();
	}

}
