/** Tv클래스의 인스턴스 t1과 t2를 생성한 후에,
 * 인스턴스 t1의 멤버변수인 channel의 값을 변경
 * 같은 클래스로부터 생성되었을지라도 각 인스턴스의 속성(멤버변수)은 
 * 서로 다른 값을 유 지할 수 있으며，메서드의 내용은 모든 인스턴스에 대해 동일하다.
 */
package ch6;
/*
class Tv {
	// tv의 속성(멤버변수)
	String color;	// 색상
	boolean power;	// 전원상태(on/off)
	int channel;	// 채널
	
	// tv의 기능(메서드)
	void power()	{ power = !power;}	// Tv를 켜거나 끄는 기능을 하는 메서드
	void channelUp() { ++channel; } // Tv의 채널을 높이는 기능을 하는 메서드
	void channelDown() { --channel; } // Tv의 채널을 낮추는 기능을 하는 메서드
	
}
*/
class TvTest2 {
	public static void main(String args[]) {
		Tv t1 = new Tv(); // Tv t1; t1 = new Tv(); 를 한문장으로 가능
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t1.channel = 7; // channel의 값을 7으로 한다.
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
	}
}
