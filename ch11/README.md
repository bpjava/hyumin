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
 
 - ListIterator : Iterator의 기능을 향상Iterator에 양방향 조회기능추가(List를 구현한 경우만 사용가능)
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

[ListIterator예제](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/ListIteratoEx1.java)

[MyVector클래스를 상속받는 새로운 클래스가 Iterator을 구현](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/MyVector2.java)


### 1.6 [Arrays](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/ArraysEx.java)


: 배열을 다루는데 유용한 메서드

 - 모두 static메서드

#### 배열의 복사 - copyOf(), copyOfRange()

```
    int[] arr = {0,1,2,3,4};
    int[] arr2 = Arrays.copyOf(arr, arr.length) // arr2=[0,1,2,3,4]
    int[] arr3 = Arrays.copyOf(arr, 3);         // arr3=[0,1,2]
    int[] arr4 = Arrays.copyOf(arr, 7);         // arr3=[0,1,2,3,4,0,0]

    int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // arr4 = [2,3] <- 4는 포함되지않음
    int[] arr6 = Arrays.copyOfRange(arr, 0, 7); // arr3=[0,1,2,3,4,0,0]
```
* copyOf() : 배열 전체
* copyOfRange() : 배열의 일부를 복사해 새로운 배열 생성
    * 범위의 끝은 포함되지않음


#### 배열 채우기 - fill(), setAll()

```
    int[] arr = new int[5];
    Arrays.fill(arr, 9);    // arr=[9, 9, 9, 9, 9]
    Arrays.setAll(arr, () -> (int)(Math.random()*5)+1) // 랜덤
```
* fill() : 배열의 모든 요소를 지정된 값으로 채움
* setAll() : 함수형 인터페이스를 배열을 채우는데 사용할 매개변수로 받음(혹은 람다식)

#### 배열의 정렬과 검색 - sort(), binarySearch()

```
    int[] arr = { 3, 2, 0, 1, 4 };
    int idx = Array.binarySearch(arr, 2); //idx=-5 -잘못된 결과

    Arrays.sort(arr); // 배열을 정렬한다.
    System.out.println(Arrays.toString(arr));
    int idx = Array.binarySearch(arr, 2); //idx=2 -올바른 결과 
```
* sort() : 배열 정렬
* binarySearch() : 배열에서 지정된 값이 저장된 위치를 반환(선 정렬 후 서치)

#### 문자열의 비교와 출력 - equals(), toString()

* toString() : 배열의 모든 요소를 문자열로 출력 (다차원 : deepToString())
```
    int[] arr = { 0, 1, 2, 3, 4};
    int[][] arr2D = {{11,12}, {21, 22}};

    System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4]
    System.out.println(Arrays.deepToString(arr2D)); // [[11,12], [21, 22]]
```

* equals() : 두 배열에 저장된 모든 요소를 비교해서 같으면 true, 다르면 false를 반환 (다차원 : deepEquals())

```
    String[][] str2D = new String[][]{{"aaa" ,"bbb" },{"AAA","BBB" }}; 
    String [][] str2D2 = new String[][]{{ "aaa", "bbb" }, {"AAA", "BBB" }};

    System.out.println(Arrays.equals(str2D, str2D2)); //false 
    System.out.println(Arrays.deepEquals(str2D, str2D2)); // true

```

#### 배열의 List로 변환 - asList(Object... a)

```
    List list = Arrays.asList (new Integer[] {1,2,3,4,5});// list = [1, 2, 3, 4, 5] 
    List list = Arrays.asList(1,2,3,4,5); // list = [1, 2, 3, 4, 5]
    list.add(6); //UnsupportedOperationException 예외 발생
```
* asList() : 배열을 List에 담아서 반환, 매개변수타입이 가변인수라서 배열 생성 없이 저장할 요소들만 나열하는 것도 가능하다.
    * 단, 반환한 List의 크기변경이 불가( 추가 / 삭제 불가 )
    크기변경이 가능하려면

    > List list = new ArrayList(Arrays.asList(1,2,3,4,5));

#### ParallelXXX(), spliterator(), stream()
* ParallelXXX() : 보다 빠른 결 과를 얻기 위해 여러 쓰레드가 작업을 나누어 처리하도록 한다.
* spliterator() : 여러 쓰레 드가 처리할 수 있게 하나의 작업을 여러 작업으로 나누는 Spliterator를 반환
* stream() : 컬렉션을 스트림으로 변환한다

### 1.7 Comparator와 Comparable

: Arrays.sort()를 호출하면 Character 클래스의 Comparable의 구현에 의해 정렬

- wrapper클래스(Integer), String, Date, File 등
- 기본적으로 오름차순
- [Comparable클래스목록-Java API](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html)

```
public interface Comparator {
    // 객체 비교후 음수, 0, 양수
    int compare(Object o1, Object o2);
    boolean equals(Object obj);
}

public interface Comparable {
    // 비교하는 두 객체가 같으면 0, 작으면 음수, 크면 양수
    public int compareTo(Object o);
}
```

> Comparable : 기본 정렬 기준을 구현하는데 사용
> Comparator : 기본 정렬 기준 외에 다른 기준으로 정렬하고자할 때 사용

[Comparator예제](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/ComparatorEx.java)

### 1.8 HashSet

: Set인터페이스를 구현한 가장 대표적인 컬렉션(중복X)

- 추가할 때 add메서드, addAll메서드 이용 중복시 false반환
- 저장순서를 유지하고자 한다면 LinkedHashSet을 사용
- [HashSet의 메서드](https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html)

#### HashSet예제
[객체별중복값처리](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/HashSetEx1.java)
[로또번호출력-중복X](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/HashSetLotto.java)
[빙고판출력](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/Bingo.java)
[인스턴스가 여러개일때 중복인식 문제](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/HashSetEx3.java)
[↑해결법](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/HashSetEx4.java)

#### 오버라이딩을 통해 작성된 hashCode()의 조건 3가지
1. 동일한 객체 여러번 호출시에도 동일한 int값 반환
(실행시마다 동일한 int값 X, 단 equals 메서드 멤벼번수 값 동일)

```
    // 매 실행시 같은 값 X , 일치여부를 확인
    Person2 p = new Person2("David", 10);
    
    // hashCode1,hashCode2항상 일치
    int hashCode1 = p.hashCode();
    int hashCode1 = p.hashCode();
    
    // 값 변경되면 hashCode3값과는 위와 달라도됨
    p.age = 20;
    int hashCode3 = p.hashCode();
```

2. 두 객체의 equals메서드 비교 결과 값 true인 경우, 
반드시 두 객체의 hashCode()호출 값은 동일

```
    Person2 p1 = new Person2("David", 10);
    Person2 p2 = new Person2("David", 10);
    
    boolean b = p1.equals(p2); // true라면

    // hashCode1,hashCode2항상 일치
    int hashCode1 = p.hashCode();
    int hashCode1 = p.hashCode();
```

3. 두 객체의 equals메서드 비교 결과 값 false인 경우, 
두 객체의 hashCode()는 해싱(hashing)사용하는 컬렉션(ex> Hashtable, HashMap ... )의 성능 향상을 위해 다른 int값을 반환하는것이 좋다.(속도저하의 이유)

[합집합&교집합&차집합](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/HashSetEx5.java)

### 1.9 TreeSet

: 이진 검색 트리(binary search tree)라는 자료구조의 형태로 데이터를 저장

#### 이진 검색 트리는 

    - 정렬, 검색, 범위검색(range search)에 탁월
    - TreeSet은 이진 검색 트리의 성능을 향상시킨 '레드-블랙 트리'
    - 중복데이터 저장 X(Set인터페이스), 저장순서 유지 X
    - 이진트리는 노드(node)가 서로 연결된 구조, 부모-자식관계
    - 시작 노드 = 루트(root), 왼-작은거 (부모노드) 오른-큰거
    - 모든 노드는 최대 두 개의 자식노드를 가질 수 있다.
    - 노드 추가 삭제에 시간이 걸린다(순차적으로 저장하지 않으므로)

```
class TreeNode{
    TreeNode left;  //왼쪽자식노드
    Object   element; // 객체 저장하기위한 참조변수
    TreeNode right; //오른쪽자식노드
}
```

[TreeSet의 생성자와 메서드]()

#### TreeSet 예제

[로또-정렬없이바로가능](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/TreeSetLotto.java)
[subSet() 범위검색시 - 범위설정법](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/TreeSetEx1.java)

* 주의점1 : 끝 범위는 포함하지 않기 때문에 "zzz"같은 문자열 붙여줘야 한다
* 주의점2 :  대문자>>소문자 이므로 순서가 원하는 대로 안나올수 있으니 통일하여 저장하는 것이 좋다

[출력순서](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/AsciiPrint.java)
[headSet/tailSet메서드](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/TreeSetEx2.java)

### 1.10 HashMap과 HashTable

: 구 HashTable 신 HashMap(구 Vector 신 ArrayList 처럼)

- 키(key)와 값(value)을 묶어서 하나의 데이터(entry)로 저장
- 해싱을 사용하여 많은 양의 데이터를 검색하기 유용

```
public class HashMap extends AbstractMap implements Map, Cloneable, Serializable
{
    // 내부 클래스 정의(객체 지향적인 코드)
    transient Entry[] table;
    ...
    // Entry타입의 배열 선언
    static class Entry implements Map.Entry {
        // Object 타입으로 저장
        final Object key;   // 컬렉션 내의 키(key) 중에서 유일
        Object value;   //키(key)와 달리 중복 허용
        ...
    }
}
```
[HashMap 생성자와 메서드]()

#### HashMap 예제
[HashMap 중복데이터 처리 - 마지막값](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/HashMapEx1.java)
[entrySet(),keySet(),values()](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/HashMapEx2.java)
[HashMap의 값으로 HashMap을 저장하기](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/HashMapEx3.java)
[한정되지 않은 범위, 비순차적 값의 빈도수 구하기](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/HashMapEx4.java)

#### 해싱과 해시함수
: 해싱이란 해시함수(hash function)를 이용해서 데이터를 해시테이블(hash table)에 저장하고 검색하는 기법

- 해시함수는 데이터 저장위치를 알려줘서 검색이 용이
- HashSet, HashMap, Hashtable 등이 해싱을 구현한 컬렉션 클래스
- 해싱에서 사용하는 자료구조는 배열 + 링크드리스트
- 서랍과 자료에 비유 ; 서랍은 해싱에 사용되는 자료구조 중 배열의 각 요소를 의미하며, 배열의 각 요소에는 링크드 리스트가 저장되어 있어서 실제 저장한 데이터는 링크드 리스트에 담겨지게 됨
- 순서
    1. 검색하고자 하는 값의 키로 해시함수 호출
    2. 해시함수의 계산결과인 해시코드를 이용해 해당값이 저장되어있는 링크드 리스트를 찾기
    3. 링크드리스트에서 검색한 키와 일치하는 데이터 찾기
- **링크드 리스트는 검색 불리 = 크기가 커질수록 속도 떨어짐**
- **배열은 몇번째 있는지만 알면 속도 빠름**
> 배열의 n번째 요소의 주소 = 배열의 시작주소 + type의 size * n

```
int hashFunction(String key) {
    return Integer.parseInt(key.substring(0,1);
}
```
* 실제로는 Object클래스에 정의된 hashCode()를 해시함수로 사용
* String클래스의 경우 Object로부터 상속받은 hashCode()를 오버라이딩 해서 문자열의 내용으로 해시코드를 만들어냄!
* equals()로 비교 결과가 true이며 hashCode()의 반환 값이 같아야 같은 객체로 인식, 중복 X, 새로운값으로 덮어씌움
**클래스 정의시 equals()를 재정의 해야한다면 hashCode()도 같이 재정의 해서 equals()의 결과가 true인 경우에는 해시코드가 항상 같도록 해주어야한다!(그렇지않으면따로저장됨)**


### 1.11 TreeMap

: 이진검색트리의 형태로 키와 값의 쌍으로 이루어진 데이터 저장

- 검색과 정렬에 적합한 컬렉션 클래스
- 검색 시 HashMap>TreeMap
- [범위검색이나 정렬이 필요한 경우 TreeMap](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/TreeMapEx1.java)

[TreeMap의 생성자와 메서드]()

### 1.12 Properties

: HashMap의 구버전인 Hashtable을 상속받아 구현한 것으로, Hashtable은 키와 값을 (Object, Object)의 형태로 저장하는 데 비해 Properties는 (String, String)의 형태로 저장한다.(단순화된 컬렉션 클래스)

- 주로 애플리케이션의 환경설정과 관련된 속성을 저장
- 데이터를 파일로부터 읽고 쓰는 기능 제공
- 간단한 입출력을 쉽게 해결

[Properties의 생성자와 메서드]()

#### Properties의 예제
[기본메서드활용-저장,읽기,출력](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/PropertiesEx1.java)
[데이터입력받기(외부파일)](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/PropertiesEx2.java)
[Properties에 저장된 데이터를 파일로저장](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/PropertiesEx3.java)
[시스템속성가져오기-getProperties()](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/PropertiesEx4.java)


### 1.13 [Collections](https://github.com/bpjava/hyumin/blob/master/ch11/src/ch11/CollectionsEx.java)

: 컬렉션과 관련된 메서드 제공

 - fill(), copy(), sort(), binarySearch() 두 클래스에 모두 포함

#### 컬렉션의 동기화

- 멀티 쓰레드(multi-thread) 프로그래밍에서는 하나의 객체를 여러 쓰레드가 동시에 접근 할 수 있기 때문에 일관성(consistency)을 유지하기 위해서는 공유되는 객체에 동기화(synchronization) 가 필요하다.
- 단 멀티쓰레드 프로그래밍이 아닌 경우에는 성능 저하요인이 됨
(Vector, Hashtable과 같은 구버전은 자체적으로 처리)
- 동기화 메서드

```
static Collection   synchronizedCollection(Collection c)
static List         synchronizedList(List List)
static Set          synchronizedSet(Set s)
static Map          synchronizedMap(Map m)
static SortedSet    synchronizedSortedSet(SortedSet s)
static SortedMap    synchronizedSortedMap(SortedMap m)
```

> 사용법
```
List syncList = Collections.synchronizedList(new ArrayList(...));
```

#### 변경불가 컬렉션 만들기

- 데이터 보호를 위해 읽기전용으로 만들 경우
- 멀티 쓰레드 프로그래밍에서 여러 쓰레드가 하나의 컬렉션을 공유할 경우, 데이터 손상을 방지

```
static Collection   unmodifiableCollection(Collection c)
static List         unmodifiableList(List List)
static Set          unmodifiableSet(Set s)
static Map          unmodifiableMap(Map m)
static NavigableSet unmodifiableNavigableSet(NavigableSet s)
static SortedSet    unmodifiableSortedSet(SortedSet s)
static NavigableMap unmodifiableNavigableMap(NavigableMap m)
static SortedMap    unmodifiableSortedMap(SortedMap m)
```

#### 싱글톤 컬렉션 만들기(singleton~)

- 인스턴스를 new연산자가 아닌 메서드를 통해서만 생성할 수 있게 함으로써 생성할 수 있는 인스턴스의 개수를 제한
- 요소 지정 후 , 해당 요소를 저장하는 컬렉션을 반환, 변경 불가
```
static List singletonList(Object o)
static Set singleton(Object o)  // singletonSet 아님
static Map singletonMap(Object key, Object value)
```

#### 한 종류의 객체만 저장하는 컬렉션 만들기

- 대부분의 경우 한 종류의 객체를 저장, 컬렉션에 지정된 종류의 객체만 저장하도록 제한하고 싶을 때 아래의 메서드를 사용한다.

```
static Collection   checkedCollection(Collection c, Class type)
static List         checkedList(List List, Class type)
static Set          checkedSet(Set s, Class type)
static Map          checkedMap(Map m, Class keyType, Class valueType)
static Queue        checkedQueue(Queue queue, Class type)
static NavigableSet checkedNavigableSet(NavigableSet s, Class type)
static SortedSet    checkedSortedSet(SortedSet s, Class type)
static NavigableMap checkedNavigableMap(NavigableMap m, Class keyType, Class valueType)
static SortedMap    checkedSortedMap(SortedMap m, Class keyType, Class valueType)
```

> 사용법
```
List list = new ArrayList();
List checkedList = checkedList(list, String.class);//String만 저장가능
checkedList.add("abc");            // ok.
checkedList.add(new Integer(3));   // 에러, ClassCastException발생
```

### 1.14 컬렉션 클래스 정리 & 요약

**상황에 맞게 쓰기**
|컬렉션|특  징|
|:--|:--|
|ArrayList|배열기반, 데이터의 추가와 삭제에 불리, 추가삭제는 제일 빠름. 임의의 요소에 대한 접근성(accessibility)이 뛰어남.|
|LinkedList|연결기반, 데이터의 추가와 삭제에 유리. 임의의 요소에 대한 접근성이 좋지 않다.|
|HashMap|배열과 연결이 결합된 형태. 추가, 삭제, 검색, 접근성이 모두 뛰어남. 검색에는 최고성능을 보인다.|
|TreeMap|연결기반, 정렬과 검색(특히 범위검색)에 적합. 검색성능은 HashMap보다 떨어짐|
|Stack|Vector를 상속받아 구현|
|Queue|LinkedList가 Queue인터페이스를 구현|
|Properties|Hashtable을 상속받아 구현|
|HashSet|HashMap을 이용해서 구현|
|TreeSet|TreeMap을 이용해서 구현|
|LinkedHashMap/LinkedHashSet|HashMap과 HashSet에 저장순서 유지기능 추가|
