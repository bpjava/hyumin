/** 단일상속
 * : 클래스간의 관계가 명확, 코드 신뢰성 향상
 * -> VCR의 클래스의 메서드의 내용이 변경 TVCR클래스의 메서드 들도 적용
 */
package ch7;

class Tv{
	boolean power;	// 전원상태(on/off)
	int channel;	// 채널
	
	void power()	   { 	power = !power;	}
	void channelUp()   {	++channel;		}
	void channeDown()  {	--channel;		}
}

class VCR {
	boolean power;	//전원 상태 (on/off)
	int counter = 0;
	void power() { 	power = !power;	 }
	void play() {/*내용생략*/}
	void stop() {/*내용생략*/}
	void rew() {/*내용생략*/}
	void ff() {/*내용생략*/}
}

class TVCR extends Tv { // Tv 상속
	VCR vcr = new VCR(); // VCR 포함
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
