package ch8;

public class FinallyTest {
	public static void main(String[] args) {
		try {
			startInstall(); 	// ���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
			copyFiles();		// ���Ϻ���
			deleteTempFiles();	// ���α׷� ��ġ�� ���� �ӽ����� ����
		} catch (Exception e) {
			e.printStackTrace();
			deleteTempFiles();  // ���α׷� ��ġ�� ���� �ӽ����� ����			
		}	// try-catch���� ��
	} //main�� ��

	static void startInstall() {
		/** ���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ带 ���´�.*/
	}
	static void copyFiles() { /* ���� ���縦 �ϴ� �ڵ带 ���´�.*/ }
	static void deleteTempFiles() { /* �ӽ����ϵ��� �����ϴ� �ڵ带 ���´�. */}
}
