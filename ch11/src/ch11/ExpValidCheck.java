/** 입력한 수식의 괄호가 올바른지 체크하는 예제
 * EmptyStackException이발생하면 괄호가 일치하지 않는 단느 메시지를 출력
 * */

package ch11;

import java.util.*;

public class ExpValidCheck {
	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
			System.out.println("Example : java ExpValidCheck \"((2+3)*1)+3\"");
			System.exit(0);
		}
		
		Stack st = new Stack();
		String expression = args[0];
		
		System.out.println("expression:"+expression);
		
		try {
			for(int i=0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				System.out.println(expression);
				if(ch=='(') {
					st.push(ch+"");
					System.out.println(expression);
				} else if(ch==')') {
					st.pop();
					System.out.println(expression);
				}
			}
			
			if(st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
		} catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.");
		}// try
	}

}
