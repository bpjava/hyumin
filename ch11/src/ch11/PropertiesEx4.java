/** 시스템 속성 가져오기
 * System클래스의 getProperties()를 호출
 */
package ch11;

import java.util.*;

public class PropertiesEx4 {
	public static void main(String[] args) {
		Properties sysProp = System.getProperties();
		System.out.println("java.version :"
						+ sysProp.getProperty("java.version"));
		System.out.println("user.language :"
				+ sysProp.getProperty("user.language"));
		sysProp.list(System.out);
	}

}
