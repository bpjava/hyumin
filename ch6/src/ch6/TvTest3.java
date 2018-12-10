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
class TvTest3 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		// t1이 저장하고 있는 값(주소)를 t2에 저장한다.
		t2=t1;
		t1.channel = 7; //channel값을 7로 변경한다.
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
	}

}
