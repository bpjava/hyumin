// 형변환 이후에도 피연산자에는 아무런 변화가 없다 (값을 반환할뿐)
package varEx;

public class CastingEx1 {

	public static void main(String[] args) {
		double d = 85.4;
		int score = (int)d;
		
		System.out.println("score="+score);
		System.out.println("d="+d);

	}

}
