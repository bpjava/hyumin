/** 람다와 스트림
 * 1.3 함수형 인터페이스(Functional Interface)
 * 람다식을 참조변수로 다룰수 있다 = 메서드를 통해 람다식을 주고받을 수 있다
 */

package ch14;

@FunctionalInterface
interface MyFunction {
	void run(); //public abstract void run();
}
public class LambdaEx1 {
	static void excute(MyFunction f) { // 매개변수의 타입이 MyFunction인 메서드
		f.run();
	}
	
	static MyFunction getMyFunction() { // 반환 타입이 MyFunction인 메서드
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}
	
	public static void main(String[] args) {
		//람다식으로 MyFunction의 run()을 구현
		MyFunction f1 = () -> System.out.println("f1.run()");
		
		MyFunction f2 = new MyFunction() { //익명클래스로 run()을 구현
			public void run() { //public을 반드시 붙여야 함
				System.out.println("f2.run()");
			}
		};
		
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		excute(f1);
		excute( () -> System.out.println("run()") );
		
	}
}
