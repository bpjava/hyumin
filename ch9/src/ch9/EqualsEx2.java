/** equal메서드가 Person인스턴스의 주소값이 아닌
 * 멤버변수 id의 값을 비교하도록 하기위해 equal메서드를
 * 오버라이딩
 */

package ch9;

class Person {
	long id;

	public boolean equals(Object obj) {
		// obj가 Object타입이므로 id을 참조하기 위해서는 Person타입으로 형변환필요
		if(obj!=null && obj instanceof Person) {
			return id ==((Person)obj).id;
		} else {
			// Person타입이 아니면 값 비교 X
			return false;
		}
	}

	Person(long id) {
		this.id = id;
	}
}

class EqualsEx2 {
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);

		if(p1==p2)
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다른 사람입니다.");

		if(p1.equals(p2))
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다른 사람입니다.");
	
	}
}
