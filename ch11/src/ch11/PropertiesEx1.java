/** Properties -����, �б�, ���
 * hashtable�� ��ӹ޾� �����߱� ������ 
 * ��¼����� ��������� ������
 */
package ch11;

import java.util.*;

public class PropertiesEx1 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		// setProperty() - prop�� Ű�� ��(key, value)�� ����
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		//prop�� ����� ��ҵ��� Enumeration�� �̿��ؼ� ���(�������̱⶧��)
		Enumeration e = prop.propertyNames();
		
		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			// getProperty - ����� �� �о����
			System.out.println(element + "=" + prop.getProperty(element));
		}
		
		System.out.println();
		prop.setProperty("size", "20"); // size�� ���� 20���� ����(put)
		System.out.println("size=" + prop.getProperty("size"));
		System.out.println("capacity=" + prop.getProperty("capacity", "20"));
		System.out.println("loadfactor=" + prop.getProperty("loadfactor", "0.75"));
		System.out.println(prop); // prop�� ����� ��ҵ��� ���
		prop.list(System.out);// list �޼��� - prop�� ����� ��ҵ��� ȭ��(System.out)�� ���
		// System.out�� ȭ�������� ǥ�� ���
	}

}
