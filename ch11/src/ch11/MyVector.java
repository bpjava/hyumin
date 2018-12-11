// Vector 클래스의 실제코드

package ch11;

import java.util.*;

public class MyVector implements List {
	Object[] data = null; //객체를 담기 위한 객체 배열을 선언한다.
	int capacity = 0;	  //용량
	int size = 0;         //크기
	
	//1) 생성자1
	public MyVector(int capacity) {
		if (capacity < 0)
			throw new IllegalArgumentException("유효하지 않은 값입니다. :"+ capacity);
		
		this.capacity = capacity;
		data = new Object[capacity];
	}
	
	//2) 생성자2
	public MyVector() {
		this(10);	//크기를 지정하지 않으면 크기를 10으로 한다.
	}
	
	//3) 최소한의 저장공간(capacity)를 확보하는 메서드
	public void ensureCapacity(int minCapacity) {
		if(minCapacity - data.length > 0)
			setCapacity(minCapacity);
	}
	
	// 4) 새로운 객체를 저장하는 add 메서드
	public boolean add(Object obj) {
		// 새로운 객체를 저장하기 전에 저장할 공간을 확보한다.
		ensureCapacity(size+1);
		data[size++] = obj;
		return true;
	}
	
	// 5) 원하는 데이터를 얻는 get 메서드
	public Object get(int index) {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		return data[index];
	}
	
	// 6) 해당 인덱스의 데이터를 제거하는 remove 메서드
	public Object remove(int index) {
		Object oldObj = null;
		
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		oldObj = data[index];
		
		// 삭제하고자 하는 객체가 마지막 객체가 아니라면, 배열 복사를 통해 빈자리를 채워줘야한다.
		if(index != size -1) {
			System.arraycopy(data, index+1, data, index, size-index-1);
		}
		//마지막 데이터를 null로 한다. 배열은 0부터 시작하므로 마지막 요소는 index가 size-1이다.
		data[size-1] = null;
		size--;
		return oldObj;
	
		// 7) 해당 Object를 삭제하는데 성공했는지 알려주는 메서드
		public boolean remove(Object obj) {
			for(int i=0; i < size ; i++) {
				 if(obj.equals(data[i])) {
					 remove(i);
					 return true;
				 }
			}
			return false;
		}
		
		// 8) 여분 공백을 제거한느 메서드
		public void trimToSize() {
			setCapacity(size);
		}
		
		// 9) 해당 사이즈로 공백을 설정하는 메서드
		private void setCapacity(int capacity) {
			if(this.capacity==capacity) return;//크기가 같으면 변경하지 않는다.
			
			Object[] tmp = new Object[capacity];
			System.arraycopy(data, 0, tmp, 0, size);
			data = tmp;
			this.capacity = capacity;
		}
		
		public void clear() {
			for (int i = 0; i < size; i++)
				data[i] = null;
			size = 0;
		}
		
		public Object[] toArray() {
			Object[] result = new Object[size];
			System.arraycopy(data, 0, result, 0, size);
			
			return result;
		}
		
		public boolean isEmpty() { return size==0; }
		public int capacity() { return capacity; }
		public int size() { return size; }
	
		/********************************************/
		/*		 List인터페이스로부터 상속받은 메서드들		*/
		/********************************************/
	
		// public int size();
		// public boolean isEmpty();
		   public boolean contains(Object o) { return false; }
		   public Iterator iterator() { return null; }
		// public Object[] toArray();
		   public Object[] toArray(Object a[]) { return null;}
		// public boolean add (Object o); 
	    // public boolean remove (Object o); 
		   public boolean containsAll(Collection c) { return false; } 
		   public boolean addAll(Collection c) { return false; }
		   public boolean addAll(int index, Collection c) { return false; } 
		   public boolean removeAll (Collection c) { return false; } 
		   public boolean retainAll(Collection c) { return false; }
		// public void clear(); 
		   public boolean equals (Object o) { return false; }
		// public int hashCode(); 
		// public Object get(int index); 
		   public Object set(int index, Object element){ return null;} 
		   public void add(int index, Object element) {}
		// public Object remove(int index); 
		   public int indexOf(Object o) { return -1; } 
		   public int lastlndexOf(Object o) { return -1; } 
		   public Listlterator listlterator(){ return null; } 
		   public Listlterator listlterator(int index){ return null; } 
		   public List subList(int fromlndex, int tolndex){ return null; }
	

		   default void sort (Comparator c) { /* 내용생략 */ } // JDK1.8부터
		   default Spliterator spliterator () { /* 내용생략 */ } // JDK1.8부터
    	   default void replaceAll(UnaryOperator operator) { /* 내용생략 */ }  
 	}
 }
