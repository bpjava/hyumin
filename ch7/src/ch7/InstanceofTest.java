/** instanceof 연산자 - 주로 조건문
 * 왼쪽에는 참조변수, 오른쪽에는 타입이 피연산자로 위치
 * 연산의 결과로 boolean(true/false)중 하나 반환
 * true- 형변환 가능 O
 */

package ch7;

class InstanceofTest {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}
		
		if(fe instanceof Car) {
			System.out.println("This is a Car instance.");
		}
		
		if(fe instanceof Object) {
			System.out.println("This is a Object instance.");
		}
		
		System.out.println(fe.getClass().getName()); //클래스의 이름을 출력
	}
} // class

class Car {}
class FireEngine extends Car {}
