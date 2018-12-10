/** 멤버변수의 초기화 시기와 순서
 * 클래스변수의 초기화시점 : 클래스가 처음 로딩될 때 단 한번 초기화 된다. 
 * 인스턴스변수의 초기화시점 : 인스턴스가 생성될 때마다 각 인스턴스별로 초기화가 이루어진다.
 * 클래스변수의 초기화순서 : 기본값 - 명시적초기화 - 클래스 초기화 블럭 
 * 인스턴스변수의 초기화순서 : 기본값 - 명시적초기화 - 인스턴스 초기화 블럭 - 생성자
 */
package ch6;

class Product {
	static int count = 0; // 생성된 인스턴스의 수를 저장하기 위한 변수
	int serialNo;			// 인스턴스 고유의 번호
	
	{// Product인스턴스가 생성될 때 마다 count의 값을 1씩 증가시켜서 serialNo에 저장
		++count;
		serialNo = count;
	}
	
	public Product() {} // 기본생성자, 생략가능
}

class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);
		System.out.println("p2의 제품번호(serial no)는 " + p2.serialNo);
		System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 " + Product.count+ "개 입니다.");
}

}
