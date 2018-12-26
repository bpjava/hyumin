/** join()�� StringJoiner
 * join() - ���� ���ڿ� ���̿� �����ڸ� �־� ���� , split()���ݴ�
 * StringJoiner Ŭ������ ���
 * 
 */

package ch9;

import java.util.StringJoiner;

class StringEx4 {
	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String[] arr   = animals.split(",");

		System.out.println(String.join("-", arr));

		// StringJoiner ����
	 	StringJoiner sj = new StringJoiner("/","[","]");
		for(String s : arr)
			sj.add(s);

		System.out.println(sj.toString());
	}
}
