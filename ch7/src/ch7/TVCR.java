/** ���ϻ��
 * : Ŭ�������� ���谡 ��Ȯ, �ڵ� �ŷڼ� ���
 * -> VCR�� Ŭ������ �޼����� ������ ���� TVCRŬ������ �޼��� �鵵 ����
 */
package ch7;

class Tv{
	boolean power;	// ��������(on/off)
	int channel;	// ä��
	
	void power()	   { 	power = !power;	}
	void channelUp()   {	++channel;		}
	void channeDown()  {	--channel;		}
}

class VCR {
	boolean power;	//���� ���� (on/off)
	int counter = 0;
	void power() { 	power = !power;	 }
	void play() {/*�������*/}
	void stop() {/*�������*/}
	void rew() {/*�������*/}
	void ff() {/*�������*/}
}

class TVCR extends Tv { // Tv ���
	VCR vcr = new VCR(); // VCR ����
	int counter = vcr.counter;
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}
}
