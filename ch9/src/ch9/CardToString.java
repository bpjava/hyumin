/* toString() - 인스턴스에 대한 정보를 문자열로 제공
 * 서로다른 인스턴스에 대해서는 클래스 이름이 같아도 
 * 해시코드값이 다르다
 */

package ch9;

class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}

class CardToString {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();

		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
