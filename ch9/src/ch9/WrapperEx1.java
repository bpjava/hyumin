/** 래퍼 클래스 - 기본형 값을 객체로 다룬다
 * 생성자는 매개변수로 문자열이나 각 자료형의 값들을 인자로 받는다
 * equals() - 객체가 가지고있는 값 비교
 * 비교연산자 대신 compareTo()제공
 * toString() -  객체값 문자열로 반환
 */

package ch9;

class WrapperEx1 {
	public static void main(String[] args) {
		Integer i  = new Integer(100);
		Integer i2 = new Integer(100);

		System.out.println("i==i2 ? "+(i==i2));
		System.out.println("i.equals(i2) ? "+i.equals(i2));
		System.out.println("i.compareTo(i2)="+i.compareTo(i2));
		System.out.println("i.toString()="+i.toString());

		System.out.println("MAX_VALUE="+Integer.MAX_VALUE);
		System.out.println("MIN_VALUE="+Integer.MIN_VALUE);
		System.out.println("SIZE=" +Integer.SIZE+" bits");
		System.out.println("BYTES="+Integer.BYTES+" bytes");
		System.out.println("TYPE=" +Integer.TYPE);
	}
}
