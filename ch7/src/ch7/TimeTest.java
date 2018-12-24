/** 접근제어자를 이용한 캡슐화
 * - 외부로부터 데이터 보호
 * - 외부에는 불필요한, 내부적으로만 사용되는, 부분을 감추기위해서
 * get - 멤버변수의 값을 반환함
 * set - 매개변수에 지정된 값 검사, 조건에 맞는 값일 때만 멤버변수의 값을 변경
 */

package ch7;

public class TimeTest {
	public static void main(String[] args) 
	{
		Time t = new Time(12, 35, 30);
		System.out.println(t);
		// 에러! 변수 hour의 접근 제어자가 private이므로 접근 불가
//		t.hour = 13;
		t.setHour(t.getHour()+1);
		System.out.println(t);
	}
}

class Time {
	// private 이 붙은 멤버는 자손 클래스에서도 접근이 불가능
	private int hour;
	private int minute;
	private int second;
	
	Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() { 		return hour; }
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		this.hour = hour;
	}
	public int getMinute() {	return minute; }
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) return;
		this.minute = minute;
	}
	public int getSecond() {	return second; }
	public void setSecond(int second) {
		if(second < 0 || second > 59) return;
		this.second = second;
	}
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}