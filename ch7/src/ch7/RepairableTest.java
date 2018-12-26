/** 인터페이스의 장점
 * 1.개발 시간 단축
 * 2. 표준화 가능
 * 3. 서로관계없는 클래스들 관계 맺어주기
 * 4. 독립적인 프로그래밍 가능
 */

package ch7;

class RepairableTest{
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();

		Marine marine = new Marine();
		SCV	scv = new SCV();

		scv.repair(tank);	// SCV가 tank를 수리하도록 한다.
		scv.repair(dropship);
//		scv.repair(marine);	// 에러 ! repair(Repairable) in SCV cannot be applied to (Marine)
	}
}

interface Repairable {}
class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}

class Unit {
	int hitPoint;
	final int MAX_HP;
	Unit(int hp) {
		MAX_HP = hp;
	}
	//...
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);		// Tank의 HP는 150이다. 
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Tank";
	}
	//...
}

class Dropship extends AirUnit implements Repairable {
	Dropship() {
		super(125);		// Dropship의 HP는 125
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Dropship";
	}
	//...
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
	//...
}

class SCV extends GroundUnit implements Repairable{
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}

	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint!=u.MAX_HP) {
				/* Unit의 HP를 증가시킨다. */
				u.hitPoint++;
			}
			System.out.println( u.toString() + ".");
		}
	}	
	//...
}
