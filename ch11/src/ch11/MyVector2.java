/** MyVector클래스를 상속 받는 새로운 클래스가 
 * Iterator를구현하도록 한것
 * remove(lastRet)를 호출하여 lastRet의 위치에 있는 객체를 삭제한 다음에 
 * cursor의 값을 감소시킨다. 그리고 lastRet의 값을 초기화(-1)한다.
 */
package ch11;

import java.util.*;

public class MyVector2 extends MyVector implements Iterator {
	int cursor = 0;
	int lastRet = -1;

	public MyVector2(int capacity) {
		super(capacity);
	}
	
	public MyVector2() {
		this(10);
	}
	
	public String toString() {
		String tmp="";
		Iterator it = iterator();
		
		for(int i=0;it.hasNext(); i++) {
			if(i!=0) tmp+=", ";
			tmp += it.next(); // tmp += next().toString();
		}
		
		return "[" + tmp + "]";
	}
	
	public Iterator iterator() {
		cursor=0; 		// cursor와 lastRet를 초기화한다.
		lastRet = -1;
		return this;
	}
	
	public boolean hasNext() {
		return cursor != size();
	}
	
	public Object next() {
		Object next = get(cursor);
		lastRet = cursor++;
		return next;
	}
	
	public void remove() {
		//더이상 삭제할 것이 없으면 IllegalStateException를 발생시킨다.
		if(lastRet==-1) {
			throw new IllegalStateException();
		} else {
			remove(lastRet);
			cursor--;		// 삭제후에 cursor의 위치를 감소시킨다.
			lastRet = -1; // lastRet의 값을 초기화 한다.
		}
	}

}
