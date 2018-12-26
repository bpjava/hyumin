/** clone() - 자신을 복제하여 새로운 인스턴스 생성
 * 작업실패시 원래상태로 되돌리거나 변경되기 전의 값을 참고
 * 
 * 배열의 경우 오버라이딩하여 새배열 생성 후 내용을 복사하게끔 함
 */

package ch9;

// Cloneable 인터페이스를 구현한 클래스에서만 clone()을 호출가능
// 그렇지 않은경우 예외발생
class Point implements Cloneable {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x="+x +", y="+y;
	}

	public Object clone() {
		Object obj = null;
		// 조상클래스의 clone()호출
		try {
			obj = super.clone();  // clone()은 반드시 예외처리를 해주어야 한다.
		} catch(CloneNotSupportedException e) {}
		return obj;
	}
}

class CloneEx1 {
	public static void main(String[] args){
		Point original = new Point(3, 5);
		Point copy = (Point)original.clone(); // 복제(clone)해서 새로운 객체를 생성
		System.out.println(original);
		System.out.println(copy);
	}
}
