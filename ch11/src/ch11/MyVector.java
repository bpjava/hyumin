// Vector Ŭ������ �����ڵ�

package ch11;

import java.util.*;

public class MyVector implements List {
	Object[] data = null; //��ü�� ��� ���� ��ü �迭�� �����Ѵ�.
	int capacity = 0;	  //�뷮
	int size = 0;         //ũ��
		
		//1) ������1
		public MyVector(int capacity) {
			if (capacity < 0)
				throw new IllegalArgumentException("��ȿ���� ���� ���Դϴ�. :"+ capacity);
			
			this.capacity = capacity;
			data = new Object[capacity];
		}
			
		//2) ������2
		public MyVector() {
			this(10);	//ũ�⸦ �������� ������ ũ�⸦ 10���� �Ѵ�.
		}
		
		//3) �ּ����� �������(capacity)�� Ȯ���ϴ� �޼���
		public void ensureCapacity(int minCapacity) {
			if(minCapacity - data.length > 0)
				setCapacity(minCapacity);
		}
		
		// 4) ���ο� ��ü�� �����ϴ� add �޼���
		public boolean add(Object obj) {
			// ���ο� ��ü�� �����ϱ� ���� ������ ������ Ȯ���Ѵ�.
			ensureCapacity(size+1);
			data[size++] = obj;
			return true;
		}
		
		// 5) ���ϴ� �����͸� ��� get �޼���
		public Object get(int index) {
			if(index < 0 || index >= size)
				throw new IndexOutOfBoundsException("������ ������ϴ�.");
			return data[index];
		}
	
		// 6) �ش� �ε����� �����͸� �����ϴ� remove �޼���
		public Object remove(int index) {
			Object oldObj = null;
			
			if(index < 0 || index >= size)
				throw new IndexOutOfBoundsException("������ ������ϴ�.");
			oldObj = data[index];
			
			// �����ϰ��� �ϴ� ��ü�� ������ ��ü�� �ƴ϶��, �迭 ���縦 ���� ���ڸ��� ä������Ѵ�.
			if(index != size -1) {
				System.arraycopy(data, index+1, data, index, size-index-1);
			}
			//������ �����͸� null�� �Ѵ�. �迭�� 0���� �����ϹǷ� ������ ��Ҵ� index�� size-1�̴�.
			data[size-1] = null;
			size--;
			return oldObj;
		 }
	
		// 7) �ش� Object�� �����ϴµ� �����ߴ��� �˷��ִ� �޼���
		public boolean remove(Object obj) {
			for(int i=0; i < size ; i++) {
				 if(obj.equals(data[i])) {
					 remove(i);
					 return true;
				 }
			}
			return false;
		}
		
		// 8) ���� ������ �����ϴ� �޼���
		public void trimToSize() {
			setCapacity(size);
		}
		
		// 9) �ش� ������� ������ �����ϴ� �޼���
		private void setCapacity(int capacity) {
			if(this.capacity==capacity) return;//ũ�Ⱑ ������ �������� �ʴ´�.
			
			Object[] tmp = new Object[capacity];
			System.arraycopy(data, 0, tmp, 0, size);
			data = tmp;
			this.capacity = capacity;
		}
		
		// 10) ��� ����
		public void clear() {
			for (int i = 0; i < size; i++)
				data[i] = null;
			size = 0;
		}
		
		// 11) ��ü �迭�ϱ�
		public Object[] toArray() {
			Object[] result = new Object[size];
			System.arraycopy(data, 0, result, 0, size);
			
			return result;
		}
		
		public boolean isEmpty() { return size==0; }
		public int capacity() { return capacity; }
		public int size() { return size; }
		
		
		@Override
		public int lastIndexOf(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}
	
		/********************************************/
		/*											*/
		/*       List�������̽��κ��� ��ӹ��� �޼����		*/
		/* 											*/	
		/********************************************/
	
		// public int size();
		// public boolean isEmpty();
		// 11) ��Ҹ� �����ϰ� �ִ��� 
		   public boolean contains(Object o) { return indexOf(o) != -1; }
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
		// 12) 
		   public boolean equals (Object o) { return false; }
		// public int hashCode(); 
		// public Object get(int index); 
		   public Object set(int index, Object element){ return null;} 
		   public void add(int index, Object element) {}
		// public Object remove(int index); 
		   public int indexOf(Object o) {  
			   for (int j = 0; j < size; j++) {
	            if (o.equals(data[j])) {
	                return j;
	            }
	        }
	        return -1; 
	       } 
		   public int lastlndexOf(Object o) { return -1; } 
		   public ListIterator listIterator(){ return null; } 
		   public ListIterator listIterator(int index){ return null; } 
		   public List subList(int formIndex, int toIndex){ return null; }

		
	

//		   default void sort (Comparator c) { /* ������� */ } // JDK1.8����
//		   default Spliterator spliterator () { /* ������� */ } // JDK1.8����
//   	   default void replaceAll(UnaryOperator operator) { /* ������� */ }  
 	}
 