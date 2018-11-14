/* 자바에서 조건식의 결과는 반드시 true또는 false여야 한당
 * 
 */
package ch4;

public class FlowEx1 {
	public static void main(String[] args) {
		int x = 0;
		
		System.out.printf("x=%d 일 때, 참인것은 %n", x);
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		System.out.println();
		
		x = 1;
		System.out.printf("x=%d 일 때, 참인것은 %n", x);
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");

		
		
	}

}
