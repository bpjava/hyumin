/** 멤버변수의 초기화 시기와 순서
 * 클래스변수의 초기화시점 : 클래스가 처음 로딩될 때 단 한번 초기화 된다. 
 * 인스턴스변수의 초기화시점 : 인스턴스가 생성될 때마다 각 인스턴스별로 초기화가 이루어진다.
 * 클래스변수의 초기화순서 : 기본값 - 명시적초기화 - 클래스 초기화 블럭 
 * 인스턴스변수의 초기화순서 : 기본값 - 명시적초기화 - 인스턴스 초기화 블럭 - 생성자
 */
package ch6;

class Document {
	static int count = 0;
	String name;		// 문서명 (Document name)
	
	Document() { // 문서 생성 시 문서명을 지정하지 않았을때 
		this("제목없음"+ ++count);
	}
	
	Document(String name) {
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	}
}

class DocumentTest {
	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
		Document d4 = new Document();
		
	}

}
