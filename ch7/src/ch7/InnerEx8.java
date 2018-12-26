/** 두개의 독립된 클래스를 작성한 다음에
 * 다시 익명클래스를 이용하여 변경
 */
package ch7;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;

public class InnerEx8 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
			} 
			
		} // 익명클래스의 끝
	);
  }// main의 끝
}// InnerEx8의 끝
