/** 반복문 - for 중첩
 *  {} 괄호 생략 하여 간략히
 *  ""를 더해주면 문자로 받아들임!
 * */
package ch4;


class FlowEx19 {
	public static void main(String[] args) { 
		for(int i=1;i<=3;i++)  
			for(int j=1;j<=3;j++) 
				for(int k=1;k<=3;k++) 
					System.out.println(""+i+j+k);	// ""를 더해주면 문자로 받아들임!
	} // main의 끝
}
