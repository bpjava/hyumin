package ch8;

public class FilnallyTest2 {
	public static void main(String[] args) {
		try {
			startInstall(); 	// ���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
			copyFiles();		// ���Ϻ���
		} catch (Exception e) {
			e.printStackTrace();		
	}	// try-catch���� ��
} //main�� ��

static void startInstall() {
	/** ���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ带 ���´�.*/
}
static void copyFiles() { /* ���� ���縦 �ϴ� �ڵ带 ���´�.*/ }
static void deleteTempFiles() { /* �ӽ����ϵ��� �����ϴ� �ڵ带 ���´�. */}
}
