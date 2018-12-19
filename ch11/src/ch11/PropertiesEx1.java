/** Properties -저장, 읽기, 출력
 * hashtable을 상속받아 구현했기 때문에 
 * 출력순서와 저장순서는 무관함
 */
package ch11;

import java.util.*;

public class PropertiesEx1 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		// setProperty() - prop에 키와 값(key, value)을 저장
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		//prop에 저장된 요소들을 Enumeration을 이용해서 출력(구버전이기때문)
		Enumeration e = prop.propertyNames();
		
		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			// getProperty - 저장된 값 읽어오기
			System.out.println(element + "=" + prop.getProperty(element));
		}
		
		System.out.println();
		prop.setProperty("size", "20"); // size의 값을 20으로 변경(put)
		System.out.println("size=" + prop.getProperty("size"));
		System.out.println("capacity=" + prop.getProperty("capacity", "20"));
		System.out.println("loadfactor=" + prop.getProperty("loadfactor", "0.75"));
		System.out.println(prop); // prop에 저장된 요소들을 출력
		prop.list(System.out);// list 메서드 - prop에 저장된 요소들을 화면(System.out)에 출력
		// System.out은 화면과연결된 표준 출력
	}

}
