# CHAPTER 11 컬렉션 프레임워크

## 1. 컬렉션 프레임웍(Collection Framework)
    - 데이터군을 저장하는 클래스들을 표준화한 설계
    - 컬렉션(Collection) : 다수의 데이터, 데이터 그룹
    - 프레임웍 : 표준화된 프로그래밍 방식

    > 장점
    1. 많은 클래스 제공
    2. 표준화된 객체지향적 설계로 사용법 편리
    3. 재사용성이 높은 코드를 작성할 수 있다

### 1.1 컬렉션 프레임웍의 핵심 인터페이스
    - 컬렉션 데이터 그룹 (3) + Collection(List+Set)
    - 모든 컬렉션 클래스들은 하나의 인터페이스를 필수로 가짐
    ( 단 Vector, Stack, Hashtable, Properties는 제외)

|List|Set|Map|
|:--:|:--:|:--:|
|순서 O 중복 O|순서 X 중복 X| 순서 X 중복( 키 X  값 O)|
|대기자명단|양의정수집합, 소수의집합 | 우편번호,지역번호|
|ArrayList,LinkedList,,|HashSet,TreeSet,,|HashMap,TreeMap,,,

#### collectoin 인터페이스
컬렉션 클래스에 저장된 데이터를 읽고, 추가하고 삭제하는 등 컬 렉션을 다루는데 가장 기본적인 메서드

|메서드| 설 명 |
|:--:|:--|
|boolean add(Object o)/boolean addAll(Collection c)|지정된 객체(o),Collection(c)의 객체들을 추가|
|void clear()|Collection의 모든 객체 삭제|
|boolean contains(Object o)/boolean containsAll(Collection c)|포함되어있는지 확인|
|boolean equals(Object o)|동일한 Collection인지 비교|
|int hashCode()|Collection의 hash code 반환|
|boolean isEmpty()|Collection이 비어있는지 확인|
|Iterator iterator()|Collection iterator를 반환|
|boolean remove(Object o)|지정된 객체 삭제|
|boolean removeAll(Collection c)|지정된 Collection에 포함된 객체 삭제|
|boolean retainAll(Collection c)|지정된 Collection에 포함된 객체만을 남기고 다른 객체들은 Collection에서 삭제한다. 이 작업으로 인해 Collection에 변화가 있으면 true, 그렇지 않으면 false를 반환|
|int size()|Collection에 저장된 객체의 개수 반환|
|Object[] toArray()|Collection에 저장된 객체를 객체배열(Object[])로 반환|
|Object[] toArray(Object[] a)|지정된 배열에 Collection의 객체를 저장해서 반환|

#### List 인터페이스
List인터페이스는 중복을 허용하면서 저장순서가 유지되는 컬렉션을 구현하는데 사용된다

|메서드| 설 명 |
|:--:|:--|
|void add(int index, Object element)/boolean addAll(int index, Collection c)|지정된 위치(index) 또는 컬렉션에 포함된 객체들을 추가|
|Object get(int index)|지정된 위치(index)에 있는 객체 반환|
|int indexOf(Object o)|지정된 객체의 위치(index) 반환(순방향)|
|int lastIndexOf(Object o)|지정된 객체의 위치(index) 반환(역방향)|
|ListIterator ListIterator()/ListIterator ListIterator(int index)|List의 객체에 접근할 수 있는 ListIterator를 반환|
|Object remove(int index)|지정된 위치에 있는 객체를 삭제하고 삭제된 객체를 반환|
|Object set(int index, Object element)| 지정된 위치에 객체를 저장|
|void sort(Comparator c)|지정된 비교자(comparator)로 List를 정렬|
|List subList(int formindex, int tolndex)|지정된 범위(fromIndex부터 toIndex)에있는 객체반환|

#### Set 인터페이스

Set인터페이스는 중복을 허용하지 않고 저장순서가 유지되지 않는 컬렉션 클래스를 구현 하는데 사용된다. ex> HashSet, TreeSet

#### Map 인터페이스

key)와 값(value)을 하나의 쌍으로 묶어서 저장하는 컬렉션 클래스 를 구현하는 데 사용된다. 키는 중복될 수 없지만 값은 중복을 허용.
 - 중복 키와 값을 저장하면 마지막 저장 값이 남게됨
 ex> Hashtable, HashMap, LinkedHashMap, SortedMap, TreeMap

|메서드| 설 명 |
|:--:|--|
|void clear()|Map의 모든 객체 삭제|
|boolean containsKey(Object key)|지정된 key 객체와 일치하는 Map의 key 객체가 있는지 확인|
|boolean containsValue(Object value)|지정된 value 객체와 일치하는 Map의 value 객체가 있는지 확인|
|Set entrySet()|Map에 저장되어 있는 key-value쌍을 Map.entry타입의 객체로 저장한 Set으로 반환|
|boolean equals(Object o)|동일한 Map인지 배교|
|Object get(Object key)|지정한 key 객체에 대응하는 value객체를 찾아서 반환|
|int hashCode()|해시 코드 반환|
|boolean isEmpty()|Map이 비어있는지 확인|
|*Set keySet()|Map에 저장된 모든 객체 반환|
|Object put(Object key, Object value)|Map에 value객체를 key에 연결(mapping)하여 저장|
|void putAll(Map t)|지정된 Map의 모든 key-value쌍을 추가|
|Object remove(Object key)|지정한 key객체와 일치하는 key-value객체를 삭제|
|int size()|Map에 저장된 key-value쌍의 개수를 반환|
|*Collection valus()|Map에 저장된 모든 value객체를 반환|

* 값(value)은 중복을 허용하기 때문에 Collection타입으로 반환 
* 키(key)는 중복을 허용하지 않기 때문에 Set타입으로 반환한다

#### Map.Entry 인터페이스

Map에 저장되는 key-value쌍을 다루기 위해 정의해 놓은 Map인터페이스의 내부 인터페이스. Map인터페이스를 구현하는 클래스에서는 Map.Entry인터페이스도 함께 구현해야한다.

ex>

```
public interface Map {
    ...
    interface Entry {
        Object getKey();
        Object getValue();
        Object setValue(Object value);
        boolean equals(Object o);
        int hashCode();
        ...                             // JDK8.0 부터 추가된 메서드는 생략
    }
}
```

|메서드| 설 명 |
|:--:|:--:|
|boolean equals(Object o)|동일한 Entry인지 비교|
|Object getKey()|Entry의 key객체를 반환|
|Object getValue()|Entry의 value객체를 반환|
|int hashCode()|Entry의 해시코드 반환|
|Object setValue(Object value)|Entry의 value객체를 지정된 객체로 바꿈|

### 1.2 ArrayList

[ArrayList 메서드 목록](https://docs.microsoft.com/ko-kr/dotnet/api/system.collections.arraylist?view=netframework-4.7.2)

- !컬렉션 프레임웍에서 가장 많이 사용!
- 데이터의 저장순서 O, 중복 O
- 기존의 Vector를 개선, 구현원리와 기능 동일
- 배열이 꽉차있는 상태로새로운 데이터를 추가하게 되면, 기존 배열보다 2배 긴 새 배열을 만들어, 기존 데이터를 새로운 배열로 복제
    - **처리시간이 많이 소요되기 때문에 생성시에 여유있는 크기로 생성하는것이 좋다.**

```
public class ArrayList extends AbstractList
    implements List, RandomAccess, Cloneable, java.io.Serializable
{
        ...
    transient Object[] elementData; //Object 배열
        ...

}
```

* ArrayList는 elementData라는 이름의 Object 배열을 멤버변수로 선언한다.
* 모든 객체의 최고조상인 Object이기 때문에 모든 종류의 객체를 담을 수 있음

[ArrayList로객체다루는방법](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/ArrayListEx1.java)

> 공통되는 요소를 찾아 삭제하는 코드

```
for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
					list2.remove(i);
}
```

 - for문 사용시 'list2.size()-1'부터 감소시키면서 거꾸로반복
 : 자리이동 발생시에도 작업에 영향받지 않게 하기 위함

[긴문자열_데이터를_ArrayList에_나눠담아_출력](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/ArrayListEx2.java)

> List list = new ArrayList(length/LIMIT + 10); //크기를 여유있게

>> 처리시간 고려

[Vector의_용량(capacity)과_크기(size)](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/VectorEx1.java)

[Vector클래스_실제코드](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/MyVector.java)

>> 채워보아야함,,,

https://github.com/danweller18/java-projects/blob/master/COSC241001_dweller0/src/collection/MyVector.java

> 해당 인덱스의 데이터를 제거하는 remove 메서드
```
public Object remove(int index) {
		Object oldObj = null;
		
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		oldObj = data[index];
		
		// 삭제하고자 하는 객체가 마지막 객체가 아니라면, 배열 복사를 통해 빈자리를 채워줘야한다.
		if(index != size -1) {
			System.arraycopy(data, index+1, data, index, size-index-1);
		}
		//마지막 데이터를 null로 변경. 배열은 0부터 시작하므로 마지막 요소는 index가 size-1이다.
		data[size-1] = null;
        // 데이터가 삭제되어 개수가 줄었으므로 size는 감소
		size--;
		return oldObj;
	
```

### 1.3 LinkedList

>배열의 장점 
 - 구조가 간단
 - 사용 편리
 - 접근시간(access time)이 가장 빠름

>배열의 단점
 - 크기변경 불가 : 데이터 복사 작업 필요, 메모리낭비
 - 비순차적인 데이터의 추가,삭제 오래걸림 : 중간 데이터 추가,삭제가 어려움

**링크드 리스트(LinkedList)의 등장!**
: 불연속적으로 존재하는 데이터를 서로 연결(link)한 형태로 구성되어 있다!

요소(node)의 구성>
```
class Node {
    Node next;      //다음 요소의 주소를 저장
    Object obj;     //데이터를 저장
}
```

> 링크드 리스트의 장점
 - 하나의 참조만 변경하여 삭제 가능 : 처리속도 빠름
 - 두개의 참조만을 변경하여 추가 가능 : 처리속도 빠름

> 링크드 리스트의 단점
 - 단방향 : 이전요소에 대한 접근이 어려움

**더블 링크드 리스트(doubly LinkedList)의 등장!**
: 이전요소에 대한 참조가 가능하게 한 링크드 리스트, 접근과 이동이 쉽다
- 링크드리스트보다 더 많이 사용된다

```
class Node {
    Node next;      // 다음 요소의 주소를 저장
    Node previous;  // 이전 요소의 주소를 저장
    Object obj;     // 데이터를 저장
}
```

**더블 써큘러 링크드 리스트(doubly circular LinkedList)의 등장!**
: 더블 링크드 리스트의 첫 번째 요소와 마지막 요소를 서로 연결시킨 것. 
- 링크드 리스트의 단점인 낮은 접근성을 해소

[LinkedList 메서드 목록](https://docs.microsoft.com/ko-kr/dotnet/api/system.collections.generic.linkedlist-1?view=netframework-4.7.2)

[ArrayList와 LinkedList의 비교 - 추가/삭제](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/ArrayListLinkedListTest.java)

> 결론 1. 순차적으로 추가/삭제 하는 경우에는 ArrayList가 빠름

> 결론 2. 중간 데이터를 추가/삭제 하는경우에는 LinkedList가 빠름

[ArrayList와 LinkedList의 비교 - 접근시간](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/ArrayListLinkedListTest2.java)

> 배열의 경우 : n번째 데이터의 주소 = 배열의 주소 + n * 데이터 타입의 크기

> LinkedList의 경우 : 처음부터 n번째 주소까지 차례대로 찾아가야하는 문제가 발생

|컬렉션|읽기(접근시간)|추가/삭제|비고|
|:--:|:--:|:--:|:--:|
|ArrayList|빠름|느림|순차적인 추가삭제 빠름, 비효율적 메모리|
|LinkedList|느림|빠름|데이터가 많을수록 접근성이 떨어짐|

**개수가 변하지않는경우 : ArrayList**

**개수 변경이 잦은경우 : LinkedList**

```
ArraryList al = new ArrayList(10000000);
for(int i=0; i<0000000; i++) al.add(i+"");

LinkedList ll = new LinkedList(al);
for(int i=0; i<1000; i++) ll.add(500, "X");
```
* 생성자를 이용하여 다른 컬렉션 클래스로 변경 가능

### 1.4 Stack과 Queue

    > Stack : LIFO(Last In First Out) - ArrayList로 구현
    ex)(In) 0-1-2 ==> 2-1-0 (Out)

    >Queue : FIFO(First In First Out) - LinkedList로 구현
    ex)(In) 0-1-2 ==> 0-1-2 (Out)

[Stack&QueueExercise](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/StackQueueEx.java)

* Stack의 메서드

    |메서드|설명|
    |:--:|:--:|
    |boolean empty()|Stack이 비어있는지 알려준다.|
    |Object peek()|Stack의 맨 위에 저장된 객체를 반환. pop()과 달리 Stack에서 객체를 꺼내지는 않음 (비었을때는 EmptyStackException 발생)|
    |Object pop()|Stack의 맨 위에 저장된 객체를 꺼낸다.(비었을때는 EmptyStackException 발생)|
    |int search(Object o)|Stack에서 주어진 객체(o)를 찾아서 그 위치를 반환. 못찾으면 -1을 반환 (배열과 달리 위치는 1부터 시작)|

* Queue의 메서드

    |메서드|설명|
    |:--:|:--:|
    |boolean add(Object o)|지정된 객체를 Queue에 추가. 성공시 true,저장공간 부족시 IllegalStateException발생|
    |Object remove()|Queue에서 객체를 꺼내 반환. 비어있으면 NoSuchElementException발생|
    |Object element()|삭제없이 요소를 읽어온다 peek와 달리 Queue가 비었을때 NoSuchElementException발생|
    |boolean offer(Object o)|Queue에 객체를 저장. 성공시 true, 실패시 false를 반환|
    |Object poll()|Queue에서 객체를 꺼내서 반환. 비어있으면 null을 반환|
    |Object peek()|삭제없이 요소를 읽어온다. Queue가 비어있으면 null을 반환|


#### [스택 직접 구현하기 - Vector](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/MyStack.java)

#### 스택과 큐의 활용

 > 스택의 활용 예 : 수식계산, [수식괄호검사](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/ExpValidCheck.java), 워드프로세서의 undo/redo, [웹브라우저의 뒤로/앞으로](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/StackEx1.java)
    

> 큐의 활용 예 : [최근사용문서](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/QueueEx1.java), 인쇄작업 대기목록, 버퍼


#### PriorityQueue
   
    : Queue인터페이스의 구현체 중의 하나로, 저장한 순서에 관계없이 우선순위(priority)가 높을것부터 꺼내게됨, null은 저장 불가(NullPointerException 발생)
    
   - 저장공간으로 배열 사용
   - 'heap(힙)'이라는 자료구조의 형태로 저장(이진트리의 한종류)
     [예제](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/PriorityQueueEx.java)

     - 숫자는 작을수록 우선순위 높음 (1-2-3-4-5)
     - 객체는 따로 비교방법을 제시해야함

#### Deque(Double-Ended Queue)
   
    : Queue의 변형으로, 양쪽 끝에 추가/삭제가 가능

 - 구현체 : ArrayDeque, LinkedList
 - 덱은 스택과 큐를 하나로 합쳐놓은것과 같음(둘다사용가능)

 * 덱의 메서드에 대응하는 큐와 스택의 메서드
 
 |Deque|Queue|Stack|
 |:--:|:--:|:--:|
 |offerLast()|offer()|push()|
 |pollLast()|-|pop()|
 |pollFirst()|poll()|-|
 |peekFirst()|peek()||
 |peekLast()|-|peek()|

### 1.5 Iterator, ListIterator, Enumeration
 
 : 컬렉션에 저장된 요소를 접근하는데 사용하는 인터페이스
 
 - ListIterator : Iterator의 기능을 향상
 - Enumeration : Iterator의 구버젼

#### Iterator
 
 * 정의
    
    ```
    public interface Iterator {
        boolean hasNext(); // 읽어올 요소가 남았는지확인(true/false)
        Object next(); // 다음요소를 읽어옴 (hasNext()이후)
        void remove(); // next()로 읽어온 요소를 삭제 (next()이후, 선택적)
    }

    public interface Collection {
        ...
        public Iterator iterator();
        ...
    }
    ```
 * 리스트에서 코드작성

    ```
    // 참조변수 List는 List에 정의된 메서드를 사용하기 때문 
    List list = new ArrayList();    // 다른 컬렉션으로 변경시 이부분 수정

    Iterator it = list.iterator();

    while(it.hasNext()) {
        System.out.println(it.next());
    }
    ```

* Map인터페이스를 구현한 컬랙션 클래스의 경우
    
    ```
    // 키(key)와 값(value)을 쌍(pair)으로 저장하고 있기때문에 keySet(),entrySet()메서드를 사용한후 iterator()호출가능
    Map map = new HashMap();
    ...
    Set eSet = map.entrySet();
    Iterator list = eSet.iterator();    
        // Iterator it = map.keySet().iterator();
    ```

#### ListIterator와 Enumeration


### 1.6 Arrays

#### 배열의 복사 - copyOf(), copyOfRange()
#### 배열 채우기 - fill(), setAll()
#### 배열의 정렬과 검색 - sort(), binarySearch()
#### 문자열의 비교와 출력 - equals(), toString()
#### 배열의 List로 변환 - asList(Object... a)
#### ParallelXXX(), spliterator(), stream()


========= =======================

### 1.7 Comparator와 Comparable

### 1.8 HashSet

### 1.9 TreeSet

### 1.10 HashMap과 HashTable

### 1.11 TreeMap

### 1.12 Properties

### 1.13 Collections

### 1.14 컬렉션 클래스 정리 & 요약
