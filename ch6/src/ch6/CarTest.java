/** 매개변수각 있는 생성자
 * 
 */

package ch6;
/*
class Car {
	String color;  // 색상
	String gearType;// 변속기 종류 - auto(자동), manual(수동)
	int door;		//문의 개수
	
	Car() {}
	
	Car(String c, String g, int d) {
		color = c;  // 색상
		gearType = g;// 변속기 종류 - auto(자동), manual(수동)
		door = d;		//문의 개수
	}
}
*/
class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		// 생성자를 사용하여 좀더 간결하게 표현 가능하다.
		Car c2 = new Car("White", "auto", 4);
		
		System.out.println("c1의 color=" + c1.color + ", gearType="
						+ c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType="
				+ c2.gearType + ", door=" + c2.door);

	}

}
