/** ���ٿ� ��Ʈ��
 * 1.3 �Լ��� �������̽�(Functional Interface)
 * ���ٽ��� Ÿ�԰� ����ȯ
 */

package ch14;

@FunctionalInterface
interface MyFunction {
	void myMethod(); //public abstract void myMethod();
}

class LambdaEx2 {
	public static void main(String[] args) {
		MyFunction f = () -> {}; // MyFunction f = (MyFunction) {()->{});
		Object obj = (MyFunction) (()-> {}); //objectŸ������ ����ȯ�� ������
		String str = ( (Object) (MyFunction) (()-> {})).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
	//	System.out.println(()->{}); // ���� ���ٽ��� ObjectŸ������ ����ȯ �ȵ�
		System.out.println((MyFunction)(()->{}));
//		System.out.println((MyFunction)(()->{}).toString()); // ����
		System.out.println(((Object)(MyFunction) (()->{})).toString());
	}

}
