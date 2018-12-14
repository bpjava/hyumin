/** �Է��� ������ ��ȣ�� �ùٸ��� üũ�ϴ� ����
 * EmptyStackException�̹߻��ϸ� ��ȣ�� ��ġ���� �ʴ� �ܴ� �޽����� ���
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
				System.out.println("��ȣ�� ��ġ�մϴ�.");
			} else {
				System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		} catch (EmptyStackException e) {
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
		}// try
	}

}
