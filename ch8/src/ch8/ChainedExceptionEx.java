package ch8;

public class ChainedExceptionEx {
	public static void main(String[] args) {
		try {
			install();
		} catch (InstallException ie) {
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // main�� ��

	static void install() throws InstallException {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			InstallException ie = new InstallException("��ġ�� ���ܹ߻�");
			ie.initCause(e);
			throw ie;
		} catch (MemoryException me) {
			InstallException ie = new InstallException("��ġ�� ���ܹ߻�");
			ie.initCause(ie);
			throw ie;
		} finally {
			deleteTempFiles();
		}// try�� ��
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) {
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		}
		
		if(!enoughMemory()) {
			throw new MemoryException("�޸𸮰� �����մϴ�.");
			//throw new RuntimeException(new MemoryException("�޸𸮰� �����մϴ�."));
		}
	}
	 
	  static void copyFiles() {/*���ϵ��� �����ϴ� �ڵ带 ���´�.		*/}
	  static void deleteTempFiles() {/*�ӽ� ���ϵ��� �����ϴ� �ڵ带 ���´�.*/}
	  
	  static boolean enoughSpace() {
		  // ��ġ�ϴµ� �ʿ��� ������ �ִ��� Ȯ���ϴ� �ڵ带 ���´�.
		  return false;
	}
	  static boolean enoughMemory() {
		  // ��ġ�ϴµ� �ʿ��� �޸� ������ �ִ��� Ȯ���ϴ� �ڵ带 ���´�.
		  return true;
	  }
	  }// ExceptionTest Ŭ������ ��

class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}
