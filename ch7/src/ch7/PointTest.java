/** 조상 클래스의 멤버변수는 조상의 생성자에 의해 초기화되도록해야함
 *  Point3D 클래스의 생성자의 첫 줄이 생성자를
 * 호출하는 문장이 아니면 오류발생
 */

package ch7;

class PointTest {
	public static void main(String[] args) {
		Point3D p3 = new Point3D(1,2,3);
	}
}

class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

class Point3D extends Point{
	int z;
	Point3D(int x, int y, int z){
		// 조상 클래스의 생성자 Point(int x , int y)를 호출
		super(x,y);
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() { //오버라이딩
		return "x : " + x + ", y : " + y + ", z : " + z;
	}
}
