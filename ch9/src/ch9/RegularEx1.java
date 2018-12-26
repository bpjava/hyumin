/** ���Խ� - java.util.regex ��Ű��
 * ���Խ� - �ؽ�Ʈ �������߿��� ���ϴ� ���� �� ��ġ�ϴ� ���ڿ��� ã�Ƴ��� ���� ���
 * �̸� ���ǵ� ��ȣ�� ���ڸ� �̿��ؼ� �ۼ��� ���ڿ��� ����
 */

package ch9;

import java.util.regex.*;	// Pattern�� Matcher�� ���� ��Ű��

class RegularEx1 {
	public static void main(String[] args) 
	{
		String[] data = {"bat", "baby", "bonus",
				    "cA","ca", "co", "c.", "c0", "car","combat","count",
				    "date", "disc"};		
		Pattern p = Pattern.compile("c[a-z]*");	// c�� �����ϴ� �ҹ��ڿ��ܾ�

		for(int i=0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.print(data[i] + ",");
		}
	}
}
