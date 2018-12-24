/** 참조변수의 형변환
 * 
 */
package ch7;

class CastingTest1 {
	public static void main(String[] args) {
		//car타입의 참조변수 car를 선언하고 null로 초기화
		Car car = null;
		//FireEngine 인스턴스를 생성, FireEngine타입의 참조변수가 참조하도록 함
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;	// car= (car)fe;에서 형변환 생략
//		car.water();// 컴파일 에러 Car타입의 참조변수로는 water()를 호출 불가능
		fe2 = (FireEngine)car;	// 자손타입 <- 조상타입
		fe2.water();
	}
}

class Car {
	String color;
	int door;
	
	void drive() {// 운전하는 기능
		System.out.println("drive, Brrrr----");
	}
	
	void stop() {// 멈추는 기능
		System.out.println("stop!!!!!");
	}
}	
	
class FireEngine extends Car { // 소방차
	void water() { // 물뿌리는 기능
			System.out.println("water!!!!");
	}
}
