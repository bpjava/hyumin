/** 클래스 메서드와 인스턴스 메서드
 * - 클래스의 멤버변수 중 모든 인스턴스에 공통된 값을 유지해야하는 
 * 것이 있는지 살펴보고 있으면, static을 붙여준다.
 * - 작성한 메서드 중에서 인스턴스 변수나 인스턴스 메서드를 사용하지 않는 메서드에 
 * static을 붙일 것을 고려한다.
 */
package ch6;

class MyMath2 {
	long a, b;
	
	// 인스턴스 변수 a, b 만을 이용해서 작업하므로 매개변수가 필요없다.
	long add()		{ return a + b; } // a,b 는 인스턴스 변수
	long subtract() { return a - b; } 
	long multiply() { return a * b; } 
	double divide() { return a / b; } 

	// 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
	static long add(long a, long b)		     { return a + b; } // a,b 는 지역 변수
	static long subtract(long a, long b) 	 { return a - b; } 
	static long multiply(long a, long b)     { return a * b; } 
	static double divide(double a, double b) { return a / b; } 
} 

class MyMathTest2 {
	public static void main(String[] args) {
		// 클래스에서도 호출, 인스턴스 생성없이 호출 가능.
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));
		
		MyMath2 mm = new MyMath2(); // 인스턴스 생성
		mm.a = 200L;
		mm.b = 100L;
		// 인스턴스 메서드는 객체생성 후에만 호출이 가능함.
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}

}
