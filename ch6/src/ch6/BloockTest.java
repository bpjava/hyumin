/** �ʱ�ȭ ��
 *  Bloock -> Block ��Ÿ�� ����!
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
		System.out.println("������");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest();");
		BloockTest bt = new BloockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		BloockTest bt2 = new BloockTest();
	}

}
