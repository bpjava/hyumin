/** 생성자에서 다른 생성자 호출하기 - this(), this
 * 생성자의 이름으로 클래스이름 대신 this를 사용한다.
 * 한 생성자에서 다른 생성자를 호출할때는 반드시 첫줄에서만 가능하다.
 * this - 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있다. 
 * 		모든 인스턴스메서드에 지역변수로 숨겨진 채로 존재한다.
 * this() , this(매개변수) - 생성자, 같은 클래스의 다른 생성자를 호출할 때 
 * 		사용한다.
 */
package ch6;
/*

class Car {
	String color;  // 색상
	String gearType;// 변속기 종류 - auto(자동), manual(수동)
	int door;		//문의 개수
	
	// this 사용! 
	Car() { // Car(String color, String gearType, int door)를 호출
		this("white", "auto", 4);
	}

	Car(String color) {
		this(color, "auto", 4);
	}
		
	Car(String color, String gearType, int door) {
		this.color = color;  // 색상
		this.gearType = gearType;// 변속기 종류 - auto(자동), manual(수동)
		this.door = door;		//문의 개수
	}
}
*/
class CarTest2 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("Blue");
		
		System.out.println("c1의 color=" + c1.color + ", gearType="
						+ c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType="
				+ c2.gearType + ", door=" + c2.door);

	}

}
