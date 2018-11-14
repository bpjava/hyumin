package ch8;

import java.io.*;

public class ExceptionEx15 {
	public static void main(String[] args) {
		// command line ���� �Է¹��� ���� �̸����� ���� ������ ����
		File f = createFile(args[0]);
		System.out.println( f.getName() + " ������ ���������� �����Ǿ����ϴ�.");
	} // main�޼����� ��
		
	
	static File createFile(String fileName) {
		try {
			if (fileName==null || fileName.equals(""))
				throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
		} catch (Exception e) {
			//fileName�� �������� ���, �����̸��� '�������.txt'�� �Ѵ�.
			fileName = "�������.txt";
		} finally {
			File f = new File(fileName); // FileŬ������ ��ü�� �����.
			createNewFile(f); 		// ������ ��ü�� �̿��ؼ� ������ ����
			return f;
		} 
	}// createFile�޼����� ��
	
	static void createNewFile(File f) {
		try {
			f.createNewFile();	//���� ����
		} catch (Exception e) { }
	} //createNewFile�޼����� ��
}
