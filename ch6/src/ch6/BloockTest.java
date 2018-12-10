/** 초기화 블럭
 *  Bloock -> Block 오타가 났음!
 */   
package ch6;

class BloockTest {
	static {
		System.out.println("static { }");
	}
	
	{
		System.out.println("{ }");
	}
	
	public BloockTest() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest();");
		BloockTest bt = new BloockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		BloockTest bt2 = new BloockTest();
	}

}
