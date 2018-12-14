/** Properties에 저장된 데이터를 store()와 
 * storeToXML()를 이용해 서 파일로 저장하는 방법
 * : XML은 Editplus나 Eclipse에서 한글편집이 가능하므로 
 * 데이터에 한글이 포함된 경우 storeToXML()을 이용
 */
package ch11;

import java.util.*;
import java.io.*;

public class PropertiesEx3 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "한글");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		try {
			prop.store(new FileOutputStream("output.txt"), "Properties Example");
			prop.storeToXML(new FileOutputStream("output.xml"), "Properties Example");
		} catch(IOException e) {
			e.printStackTrace();
		}
	} // main의 끝

}
