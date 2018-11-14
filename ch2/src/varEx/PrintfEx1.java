package varEx;

public class PrintfEx1 {

	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L; // long big = 10000000000L
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010; // 8진수 10 , 10진수로는 8
		int hexNum = 0x10; // 16진수 10, 10진수로는 16
		int binNum = 0b10; // 2진수 10, 10진수로는 2
		
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int)c);// (int)로 형변환이 꼭 필요 
		// 간격 맞춰서 출력
		System.out.printf("finger=[%5d]%n", finger); // 공백 finger=[   10]
		System.out.printf("finger=[%-5d]%n", finger); // 왼쪽정렬 finger=[10   ]
		System.out.printf("finger=[%05d]%n", finger); // 0 finger=[00010]
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex); // '#'은 접두사( 16진수 0x, 8진수 0 )
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum); // Integer.toBinaryString() : 2진 문자열 출력
	}

}
