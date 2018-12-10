/** �������ڿ� �����ε�
 * Ÿ��... ������
 * �Ű������� �Էµ� ���ڿ��� �����ڸ� ���Խ��� �����Ͽ� ��ȯ�Ѵ�. 
 */

package ch6;

class VarArgsEx {
	public static void main(String[] args) {
		String[] strArr = {"100", "200", "300"};
		
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-",strArr));
		System.out.println(concatenate(",", new String[] {"1","2","3"}));
		System.out.println("["+concatenate(",", new String[0]+"]"));
		System.out.println("["+concatenate(",")+"]");
	}

	static String concatenate(String delim, String... args) {
		String result = "";
		
		for(String str : args) {
			result += str + delim;
		}
		
		return result;
	}
	
	/*// �����ε��� �޼��尡 ���е��� ������ �������߻��Ѵ�.
	 *  // ���� �������ڸ� ����� �޼���� �����ε� ���� �ʾƾ� �Ѵ�.
	 * static String concatenate(String... args) {
	 * 			return concatenate("",args);
	 * }
	 * */
}	// class
