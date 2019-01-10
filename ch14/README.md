# 람다(Lambda Expression)

## 1. 람다식

>메서드를 하나의 식(expression)으로 표현한 것.
메서드를 람다식으로 표현하면 메서드의 이름과 반환값이 없어지므로 람다식을 익명함수(anonymous function)라고도 한다.

>람다식은 메서드의 매개변수로 전달될 수 있고,
메서드의 결과로 반환될 수 있다.
즉, 메서드를 변수처럼 다루는 것이 가능하다.

## 2. 람다식 작성하기

- 메서드에서 이름과 반환타입 제거
- 매개변수 선언부와 몸통{} 사이에 -> 추가

```
//기존
반환타입 메서드이름 (매개변수 선언)  {
  ...
}

//람다식
(매개변수 선언) ->  {
  ...
}
```

- 반환값이 있는 메서드는 return 대신 식(expression)으로 대신할 수 있다.(연산 결과가 자동으로 반환값이 되고 ; 생략)
- 매개변수의 타입은 추론가능하면 생략 가능 (대부분 생략 가능)
- 두 매개변수 중 하나의 타입만 생략하는 것은 불가능
- 매개변수가 하나뿐이면 괄호() 생략 가능
- 중괄호{} 안의 문장이 하나일 때는 중괄호{} 생략 가능 (문장 끝에 ; 생략)
- 중괄호{} 안의 문장이 return문일경우 중괄호{} 생략 불가능
```
//기존
int max(int a, int b) {
  return a > b ? a : b;
}

//람다식
(int a, int b) -> {
  return a > b ? a : b;
}

//return문 대신 expression 사용
(int a, int b) -> a > b ? a: b

//매개변수 타입 생략
(a, b) -> a > b ? a : b

//매개변수 1개일 경우 괄호 생략
a -> a*a     //OK
int a -> a*a //에러

//본문 문장 1개일 경우 중괄호 생략
(String name, int i) -> System.out.println(name+"="+i)
```

## 3. 함수형 인터페이스(Functional Interface)
> 람다식을 다루기 위한 인터페이스

람다식은 메서드와 동등한 것이 아니라 익명클래스의 객체와 동등하다.

```
// 람다식
  (int a, int b) -> a > b ? a : b

// 익명클래스의 객체
  new Object()  {
    int max(int a, int b) {
      return a > b ? a : b ;
    }
  }
```

- 람다식으로 정의된 익명 객체의 메서드를 호출하려면 참조변수가 필요하다.
- 이 때, 참조변수의 타입은 클래스 또는 인터페이스가 가능한데,
- 람다식과 동등한 메서드가 정의되어 있는 것이어야 한다.

```
// 예를 들어 max() 메서드가 정의된 Myfunction 인터페이스 정의
  interface MyFunction  {
    public abstract int max(int a, int b);

// MyFunction 인터페이스를 구현한 익명클래스 객체 생성
  MyFunction f = new MyFunction() {
    public int max (int a, int b);
      return a > b ? a : b;
    }
  }
  int big = f.max(5, 3);  //익명 객체의 메서드 호출

// 위의 익명 객체를 람다식으로 대체
  MyFunction f = (int a, int b) -> a > b ? a : b;
  int big = f.max(5, 3);
```

- MyFunction 인터페이스를 구현한 익명 객체를 람다식으로 대체 가능한 이유:
  - 람다식도 실제로는 익명 객체 
  - MyFunction 인터페이스를 구현한 익명 객체의 메서드 max()와 람다식의 매개변수의 타입과 개수, 반환값이 일치

- 함수형 인터페이스에는 오직 하나의 추상 메서드만 정의되어 있어야 한다. 
    - 람다식과 인터페이스가 1:1로 연결되기 때문이다.
- static 메서드와 default 메서드의 개수에는 제약이 없다.

- @FunctionalInterface를 붙이면 컴파일러가 함수형 인터페이스를 올바르게 정의하였는지 확인해준다.

```
// 기존 인터페이스의 메서드 구현
  List<String> list = Arrays.asList("abc", "aaa", "bbb", "ccc");
  Collections.sort(list, new Comparator<String>() {
    public int compare(String s1, String s2)  {
      return s2.compareTo(s1);
    }
  });

// 람다식으로 구현
  List<String> list = Arrays.asList("abc", "aaa", "bbb", "ccc");
  Collections.sort(list, (s1, s2) -> s2.compareTo(s1));
```

- 함수형 인터페이스로 람다식을 참조가능
- 람다식의 타입이 함수형 인터페이스의 타입과 일치하는 것은 아니다. 
    - 람다식은 익명 객체이고 익명 객체는 타입이 없다. 형변환이 필요

```
MyFunction f = (MyFunction) (()->{}); //
```
- MyFunction인터페이스를 직접 구현X 
- 인터페이스를 구현한 클래스의 객체와 동일 ->형변환 가능(생략 가능)

- 람다식은 오직 함수형 인터페이스로만 형변환이 가능(Object 타입으로 형변환 불가능)
 - Object 타입으로 형변환하려면 함수형 인터페이스로 변환 후 형변환

```
Object obj = (Object)(MyFunction)(()->{});
String str = (Object)(MyFunction)(()->{})).toString();
```

## 4. java.util.function 패키지
> 이 패키지에 자주 쓰이는 형식의 메서드를 함수형 인터페이스로 정의

|함수형 인터페이스|메서드|설명|
|--|--|--|
|java.lang.Runnable|	void run()	|매개변수도 없고, 반환값도 없음
|Supplier|	T get()	|매개변수는 없고, 반환값만 있음|
|Consumer|	void accept(T t)	|Supplier와 반대로 매개변수만 있고, 반환값이 없음|
|Function|	R apply(T t)	|일반적인 함수. 하나의 매개변수를 받아서 결과를 반환|
|Predicate|	boolean test(T t)	|조건식을 표현하는데 사용. 매개변수는 하나, 반환 타입은 boolean|
|BiConsumer|	void accept(T t, U u)	|두개의 매개변수만 있고, 반환값이 없음|
|BiPredicate|	boolean test(T t, U u)	|조건식을 표현하는데 사용됨. 매개변수는 둘, 반환값은 boolean|
|BiFunction|	R apply(T t, U u)	 |두개의매개변수를 받아서 하나의 결과를 반환|

- 수학에서 결과로 true 또는 false를 반환하는 함수를 Predicate 라고 한다.
- 매개변수가 2개인 함수형 인터페이스는 이름 앞에 ‘Bi’가 붙는다.
- Supplier는 매개변수는 없고 반환값만 존재하는데 메서드는 두 개의 값을 반환할 수 없으므로 BiSupplier가 없다.
- 매개변수의 타입과 반환타입이 일치할 때는 Function 대신 UnaryOperator를 사용한다.      (매개 변수 2개면 BinaryOperator)

```
// 조건식 표현에 사용되는 Predicate

Predicate<String> isEmptyStr = s -> s.length() == 0;
String s = "";

if(isEmptyStr.test(s))
  System.out.println("This is an empty String.");
```

## 5. Function의 합성과 Predicate의 결합

### 5.1. Function의 합성
> 두 람다식을 합성해서 새로운 람다식을 만들 수 있다.

```
함수 f, g가 있을 때
f.andThen(g)는 함수 f를 먼저 적용하고 g 적용.
f.compose(g)는 함수 g를 먼저 적용하고 f 적용.
```

### 5.2. Predicate의 결합
> 여러 Predicate를 and(), or(), negate()로 연결해서 하나의 새로운 Predicate로 결합할 수 있다. Predicate의 끝에 negate()를 붙이면 조건식 전체가 부정이 된다.

```
Predicate<Integer> p = i -> i < 100;
Predicate<Integer> q = i -> i < 200;
Predicate<Integer> r = i -> i%2 == 0;
Predicate<Integer> notP = p.negate();

// 100 <= i && (i < 200 || i%2==0)
Predicate<Integer> all = notP.and(q.or(r));
System.out.println(all.test(150));  // true
``` 
static 메서드인 isEqual()은 두 대상을 비교하는 Predicate를 만들 때 사용한다.
isEqual()의 매개변수로 비교대상을 하나 지정하고, 또 다른 비교대상은 test()의 매개변수로 지정한다.

```
Predicate<String> p = Predicate.isEqual(str1);
boolean result = p.test(str2);  //str1과 str2가 같은지 비교하여 결과를 반환

// 위의 두 문장을 하나로 합치면
boolean result = Predicate.isEqual(str1).test(str2);
```

## 6. 메서드 참조(Method reference)
> 람다식이 하나의 메서드만 호출하는 경우, 메서드 참조를 통해 람다식을 간략히 할 수 있다.
클래스명::메서드명 또는 참조변수::메서드명

```
// 기존
Function<String, Integer> f = (String s) -> Integer.parseInt(s);

// 메서드 참조
Funcation<String, Integer> f = Integer::parseInt;
```

* 생성자를 호출하는 람다식도 메서드 참조로 변환 가능

```
Supplier<MyClass> s = () -> new MyClass();  // 람다식
Supplier<MyClass> s = MyClass::new; // 메서드 참조
```
* 배열 생성할 경우
```
Function<Integer, int[]> f = x -> new int[x]; // 람다식
Function<Integer, int[]> f2 = int[]::new; // 메서드 참조
```

# 스트림(Stream)

## 1. 스트림(Stream)
> 스트림은 데이터 소스를 추상화하고, 데이터를 다루는데 자주 사용되는 메서드들을 정의해 놓았다.

- Collection이나 Iterator 같은 인터페이스를 이용해서 컬렉션을 다루는 방식을 표준화 했지만, 각 컬렉션 클래스에는 같은 기능의 메서드들이 중복해서 정의되어 있다. 
- List를 정렬할 때는 Collection.sort()를 사용해야하고, 배열을 정렬할 때는 Arrays.sort()를 사용해야 한다. 

- **이렇게 데이터 소스마다 다른 방식으로 다루어야하는 문제점을 해결**

```
// 기존
String[] strArr = {"aaa", "bbb", "ccc"};
List<String> strList = Arrays.asList(strArr);

// 스트림 생성
Stream<String> strStream1 = strList.stream();
Stream<String> strStream2 = Arrays.stream(strArr);

// 스트림 출력
strStream1.sorted().forEach(System.out::println);
strStream2.sorted().forEach(System.out::println);
```

- 스트림은 데이터 소스로 부터 데이터를 읽기만 할 뿐, 변경하지 않는다.
- 스트림은 한번 사용하면 닫혀서 다시 사용할 수 없다.
- 스트림은 작업을 내부 반복으로 처리한다. 
```
  void forEach(Consumer<? super T> action) {
    Objects.requireNonNull(action); // 매개변수의 널 체크
    
    for(T t : src)  {
      action.accept(T);
    }
  }
```
- 스트림은 최종 연산이 수행되기 전까지 중간 연산이 수행되지 않는다. 중간 연산을 호출하는 것은 단지 어떤 작업이 수행되어야하는지를 지정해주는 것일 뿐이다.
- 요소의 타입이 T인 스트림은 Stream이지만, 오토박싱/언박싱의 비효율을 줄이기 위해 데이터 소스의 요소를 기본형으로 다루는 InsStream, LongStream, DoubleStream이 제공된다.
- 병렬스트림은 내부적으로 fork&join 프레임웍을 이용해서 자동적으로 연산을 병렬로 수행한다. 스트림에 parallel() 메서드를 호출하면 병렬로 연산하고, parallel()을 취소하려면 sequential()을 호출한다.
- parallel()과 sequential()은 새로운 스트림을 생성하는 것이 아니라, 그저 스트림의 속성을 변경할 뿐이다.
```
  int sum = strStream.parallelStream()
                     .mapToInt(s -> s.length())
                     .sum();
```

## 2. 스트림 만들기
> 스트림의 소스가 될 수 있는 대상은 배열, 컬렉션, 임의의 수 등 다양하다.

### 2.1. 컬렉션
> 컬렉션의 최고 조상인 Collection에 stream()이 정의되어 있어서 Collection의 자손인 List와 Set을 구현한 컬렉션 클래스들은 모두 stream()으로 스트림을 생성할 수 있다.

```
Stream<T> Collection.stream()

// List로부터 스트림 생성
List<Integer> list = Arrays.asList(1,2,3,4,5);
Stream<Integer> intStream = list.stream();  // list를 소스로 하는 컬렉션 생성
```

### 2.2. 배열
> 배열을 소스로 하는 스트림을 생성하는 메서드는 다음과 같이 Stream과 Arrays에 static메서드로 정의되어 있다.

```
Stream<T> Stream.of(T... values)  // 가변 인자
Stream<T> Stream.of(T[])
Stream<T> Arrays.stream(T[])
Stream<T> Arrays.stream(T[] array, int startInclusive, int endExclusive)
```

#### 문자열 스트림 생성 
```
  Stream<String> strStream = Stream.of("a","b","c"); // 가변인자
  Stream<String> strStream = Stream.of(new String[]{"a","b","c"});
  Stream<String> strStream = Arrays.stream(new String[]{"a","b","c"});
  Stream<String> strStream = Arrays.stream(new String[]{"a","b","c"}, 0, 3);
```
#### int, long, double과 같은 기본형 배열을 소스로 하는 스트림 생성

```
  IntStream IntStream.of(int...values)
  IntStream IntStream.of(int[])
  IntStream Arrays.stream(int[])
  IntStream Arrays.stream(int[] array, int startInclusive, endExclusive)
```

### 2.3. 특정 범위의 정수
```
  IntStream intStream = IntStream.range(1, 5);      // 1,2,3,4
  IntStream intStream = IntStream.rangeClosed(1, 5) // 1,2,3,4,5
```

### 2.4. 임의의 수

> 난수를 생상하는 Random클래스에는 아래와 같은 인스턴스 메서드들이 포함되어 있다.

```
//해당 타입의 난수들로 이루어진 스트림 반환하는 메서드들

IntStream ints()
LongStream longs()
DoubleStream doubles()

//위의 메서드들이 반환하는 스트림은 크기가 정해지지 않은 무한 스트림(infinite stream)이므로  
//limit()도 같이 사용해서 스트림의 크기를 제한해 주어야 한다. limit()은 스트림의 개수를 지정하는데 사용된다.

IntStream intStream = new Random().ints();  // 무한스트림
intStream.limit(5).forEach(System.out::println);  // 5개의 요소만 출력


//매개변수로 스트림의 크기를 지정하면 limit()을 사용하지 않아도 된다.
IntStream ints(long streamSize)
LongStream longs(long streamSize)
DoubleStream doubles(long streamSize)

//지정된 범위의 난수를 발생시키는 스트림을 얻는 메서드들(end는 범위에 미포함)
IntStream ints(int begin, int end)
LongStream longs(long begin, long end)
DoubleStream doubles(double begin, double end)

IntStream ints(long streamSize, int begin, int end)
LongStream longs(long streamSize, long begin, long end)
DoubleStream doubles(long streamSize, double begin, double end)
```

### 2.5. 람다식 - iterate(), generate()
 >Stream 클래스의 iterate()와 generate()는 람다식을 매개변수로 받아서, 이 람다식에 의해 계산되는 값들을 요소로 하는 무한 스트림을 생성한다.

```
static <T> Stream<T> iterate(T seed, UnaryOperator<T> f)
static <T> Stream<T> generate(Supplier<T> s)
```

- iterate()는 씨앗값(seed)으로 지정된 값부터 시작해서 람다식 f에 의해 계산된 결과를 다시 seed값으로 계산을 반복한다.
- generate()는 iterate()와 달리 이전 결과를 이용해서 다음 요소를 계산하지 않는다.
- iterate()와 generate()에 의해 생성된 스트림은 기본형 스트림 타입의 참조변수로 다룰 수 없다.
```
// iterate()
Stream<Integer> evenStream = Stream.iterate(0, n->n+2); // 0, 2, 4, 6, ...

// generate()
Stream<Double> randomStream = Stream.generate(Math::random);
Stream<Integer> oneStream = Stream.generate(()->1);
```

### 2.6. 빈 스트림
> 요소가 하나도 없는 빈 스트림을 생성할 수 있다.
스트림에 연산을 수행한 결과가 하나도 없을 때, null보다 빈 스트림을 반환하는 것이 낫다.
```
Stream emptyStream = Stream.empty();  // empty()는 빈 스트림을 생성해서 반환한다.
long count = emptyStream.count();   // count의 값은 0
```

### 2.7. 두 스트림의 연결
> Stream의 static 메서드인 concat()을 사용해서 두 스트림을 하나로 연결할 수 있다.
두 스트림은 같은 타입이어야 한다.

```
String[] str1 = {"123", "456", "789"}
String[] str2 = {"ABC", "abc", "DEF"}

Stream<String> strs1 = Stream.of(str1);
Stream<String> strs2 = Stream.of(str2);
Stream<String> strs3 = Stream.concat(strs1, strs2);   // 두 스트림을 하나로 연결
```

## 3. 스트림의 중간연산

### 3.1. 스트림 자르기

>Stream skip(long n) // 처음 n개의 요소 건너뛰기
Strema limit(long maxSize) // 스트림의 요소를 maxSize개로 제한

```
IntStream exampleStream = IntStream.rangeClosed(1, 10); // 1~10의 요소를 가진 스트림
exampleStream.skip(3).limit(5).forEach(System.out::print);  // 45678
```

### 3.2. 스트림 요소 걸러내기
>distinct()는 스트림에서 중복된 요소들 제거
filter()는 주어진 조건(Predicate)에 맞지 않는 요소를 걸러낸다.

```
// distinct()
IntStream exampleStream = IntStream.of(1,2,2,3,3,3,4,5,5,6);
exampleStream.distinct().forEach(System.out::print);  // 123456

// filter()
IntStream example2Stream = IntStream.rangeClosed(1, 10);
example2Stream.filter(i -> i%2 ==0).forEach(System.out::print); // 246810

// filter()를 다른 조건으로 여러 번 사용. 두 문장의 결과는 같다.
example2Stream.filter(i -> i%2!=0 && i%3!=0).forEach(System.out::print);  //157
example2Stream.filter(i -> i%2!=0).filter(i -> i%3!=0).forEach(System.out::print);
```

### 3.3. 스트림 정렬
>Stream sorted()
Stream sorted(Comparator<? super T> comparator)

```
Stream<String> strStream = Stream.of("dd","aaa","CC","cc","b");
strStream.sorted().forEach(System.out::print); // CCaaabccdd

// 기본정렬 역순
strStream.sorted(Comparator.reverseOrder());

// 대소문자 구분 없이
strStream.sorted(String.CASE_INSESITIVE_ORDER)

// 길이 순 정렬
strStream.sorted(Comparator.comparing(String::length))

//정렬 조건을 추가할 때는 thenComparing() 사용
studentStream.sorted(Comparator.comparing(Student::getBan)
                      .thenComparing(Student::getTotalScore)
                      .thenComparing(Student::getName)
                      .forEach(System.out::println);
```

### 3.4. 스트림 변환
> 스트림의 요소에 저장된 값 중에서 원하는 필드만 뽑아내거나, 특정 형태로 변환해야 할 때
map() 사용

```
// map()으로 Stream<File>을 Stream<String>으로 변환하기

Stream<File> fileStream = Stream.of(new File("Ex1.java"), new File("Ex2.java"));
Stream<String> filenameStream = fileStream.map(File::getName);
filenameStream.forEach(System.out::println);

// map() 여러 번 사용

fileStream.map(File::getName)   // Stream<File> -> Stream<String>
  .filter(s -> s.indexOf('.')!= -1)   // 확장자 없는 것 제외
  .map(s -> s.substring(s.indexOf('.')+1))    // Stream<String> -> Stream<String>
  .map(String::toUpperCase)   // 모두 대문자로 변환
  .distinct()   
  .forEach(System.out::print);
```

## 4. 스트림의 중간연산

### 4.1. 스트림 조회
>연산과 연산 사이에 올바르게 처리되었는지 확인하려면 peek() 사용
forEach()와 달리 스트림의 요소를 소모하지 않으므로 연산 사이에 여러 번 사용 가능

```
fileStream.map(File::getName)
  .filter(s -> s.indexOf('.') != -1)    //확장자 없는 것 제외
  .peek(s -> System.out.printf("filename=%s%n", s))   //파일명 출력
  .map(s -> s.substring(s.indexOf('.')+1))   //확장자만 추출
  .peek(s -> System.out.printf("extension=%s%n", s))  //확장자 출력
  .forEach(System.out::println);
```

### 4.2. Stream 스트림을 기본형 스트림으로 변환
> map()은 연산의 결과로 Stream 타입의 스트림을 반환하는데,
스트림의 요소를 숫자로 변환하는 경우 IntStream과 같은 기본형 스트림으로 변환하는 것이 더 유용할 수 있다.

```
DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper)  
IntStream mapToInt(ToIntFunction<? super T> mapper)
LongStream mapToLong(ToLongFunction<? super T> mapper)

// 스트림에 포함된 모든 학생의 성적을 합산하기 위해 map()으로 새로운 스트림 생성
Stream<Integer> studentScoreStream = studentStream.map(Student::getTotalScore);

// 애초에 Stream<Integer>가 아닌 IntStream 타입의 스트림 생성하기
// 성적을 더할 때 Integer를 int로 변환할 필요 없어서 더 효율적이다.
IntStream studentScoreStream = studentStream.mapToInt(Student::getTotalScore);
int allTotalScore = studentScoreStream.sum();
```

> count()만 지원하는 Stream와 달리 IntStream과 같은 기본형 스트림은 아래와 같이 숫자를 다루는데 편리한 메서드들을 제공한다.

```
int sum()                   스트림 모든 요소의 총합
OptionalDouble average()    sum()/count()
OptionalInt max()           스트림 요소 중 제일 큰 값
OPtionalInt min()           스트림 요소 중 제일 작은 값
```

* max()와 min()은 Stream에도 정의되어 있지만 매개변수로 Comparator를 지정해야 한다.
* 이 메서드들은 최종연산이다.
* sum()과 average()를 모두 호출하려면 summaryStatistics() 메서드 사용

>IntStream을 Stream로 변환할 때는 mapToObj() 사용
IntStream을 Steram로 변환할 때는 boxed() 사용

```
//mapToObj() 사용해서 IntStream을 Stream<String>으로 변환

//로또번호 생성기
IntStream intStream = new Random().ints(1,46);  // 1~45사이의 정수
Stream<String> lottoStream = intStream.distinct().limit(6).sorted()
                                .mapToObj(i->i+",");    // 정수를 문자열로 변환
lottoStream.forEach(System.out::print); // 12,14,23,29,45
```

>CharSequence에 정의된 chars()는 String이나 StringBuffer에 저장된 문자들을 IntStream으로 다룰 수 있게 해준다.

```
IntStream charStream = "12345".chars();
int charSum = charStream.map(ch-> ch-'0').sum() // charSum=15
```
> Stream -> IntStream 변환 시, mapToInt(Integer::parseInt) 사용
Stream -> IntStream 변환 시, mapToInt(Integer::intValue) 사용

### 4.3. Stream를 Stream로 변환
> flatMap() 사용

```
// 요소가 문자열 배열(String[])인 스트림
Stream<String[]> strArrStrm = Stream.of(
                              new String[]{"abc", "def", "ghi"},
                              new String[]{"ABC", "DEF"m "JKLMN"}
                              );

// Stream<String[]>을 map(Arrays::stream)으로 변환한 결과는 Stream<String>이 아닌 Stream<Stream<String>>.
// 즉 스트림의 스트림이다.
Stream<Stream<String>> strStrStrm = strArrStrm.map(Arrays::stream);

//map() 대신 flatMap() 사용하면 각 배열이 하나의 스트림의 요소가 된다.
Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
```

## 5. Optional
> Optional은 지네릭 클래스로 ‘T타입의 객체’를 감싸는 래퍼 클래스다.
그래서 Optional타입의 객체에는 모든 타입의 참조변수를 담을 수 있다.

> 최종 연산의 결과를 그냥 반환하는 것이 아니라 Optional 객체에 담아서 반환하면,
반환된 결과가 null인지 매번 if문으로 체크하는 대신 Optional에 정의된 메서드를 통해 간단히 처리할 수 있다.

### 5.1. Optional 객체 생성하기
> of() 또는 ofNullable() 사용

```
//참조변수의 값이 null일 가능성이 있으면 of()대신 ofNullable() 사용
Optional<String> optVal = Optional.of(null); //NullPointerException 발생
Optional<String> optVal = Optional.ofNullable(null);  // OK

//Optional<T> 타입의 참조변수를 기본값으로 초기화할 때 empty() 사용
//null로 초기화할 수 있지만 empty()로 초기화하는 것이 바람직
Optional<String> optVal = null;
Optional<String> optVal = Optional.empty();  // 빈 객체로 초기화
```

### 5.2. Optional 객체의 값 가져오기
> get(), orElse()

```
Optional<String> optVal = Optional.of("abc");
String str1 = optVal.get();   // optVal에 저장된 값을 반환. null이면 예외발생
String str2 = optVal.orElse("");  // optVal에 저장된 값이 null이면 ""를 반환
String str3 = optVal.orElseGet(String::new);  // null을 대체할 값을 반환하는 람다식 지정
String str4 = optVal.orElseThrow(NullPointerException::new);  // null일 때 지정된 예외를 발생
```

> isPresent()는 Optional 객체의 값이 null이면 false를, 아니면 true 반환
ifPresent(Consumer block)는 값이 있으면 주어진 람다식 실행, 없으면 아무일 안함

```
//조건문
if(str!=null) {
  System.out.println(str);
}

//위의 조건문을 isPresent()로 구현
if(Optional.ofNullable(str).isPresent())  {
  System.out.println(str);
}

//위의 조건문을 ifPresent()로 구현
Optional.ofNullable(str).ifPresent(System.out::println);
```

## 6. 스트림의 최종 연산
> 최종 연산은 스트림의 요소를 소모해서 결과를 만든다. 그래서 최종 연산후에는 스트림이 닫혀서 더이 상 사용할 수 없다.

### 6.1. forEach()
> 반환 타입이 void이므로 스트림의 요소를 출력하는 용도로 많이 사용

### 6.2. 조건검사
> allMatch(), anyMatch(), noneMatch(), findFirst(), findAny()

```
boolean allMatch (Predicate<? super T> predicate)
boolean anyMatch (Predicate<? super T> predicate)
boolean noneMatch (Predicate<? super T> predicate)

// 학생성적 스트림에서 총점이 낙제점 이하인 학생 확인
boolean noFailed = stuStream.anyMatch(s->s.getTotalScore()<=100);

// 스트림 요소 중 조건에 일치하는 첫 번째 것 반환
Optional<Student> stu = stuStream.filter(s->s.getTotalScore()<=100).findFirst();

// 병렬스트림의 경우 findFirst() 대신 findAny() 사용
Optional<Student> stu = parallelStream.filter(s->s.getTotalScore()<=100).findAny();
```

### 6.3. 통계
> count(), sum(), average(), max(), min()
```
// 기본형 스트림이 아닌 경우 통계 관련 메서드는 아래 3개 뿐이다.
// 기본형 스트림의 min(), max()와 달리 매개변수로 Comparator가 필요하다.
long count()
Optional<T> max(Comparator<? super T> comparator)
Optional<T> min(Comparator<? super T> comparator)
```

### 6.4. reduce()
> reduce()는 스트림의 요소를 줄여나가면서 연산을 수행하고 최종결과를 반환한다.
그래서 매개변수의 타입이 BinaryOperator 이다.
처음 두 요소를 가지고 연산한 결과로 그 다음 요소와 연산한다.
모든 스트림의 요소를 소모하게 되면 그 결과를 반환한다.
```
Optional<T> reduce(BinaryOperator<T> accumulator)
```
> reduce()의 사용방법은 초기값과 어떤 연산(BinaryOperator)으로 스트림의 요소를 줄여나갈 것인지만 결정하면 된다.

## 7. collect()
>스트림의 요소를 수집하는 최종 연산
collect()가 스트림의 요소를 수집하기 위한 수집 방법이 정의된 것이 collector.
collector는 Collector인터페이스를 구현한 것.

```
collect() 스트림의 최종 연산. 매개변수로 collector가 필요하다.
Collector 인터페이스. collector는 이 인터페이스를 구현해야한다.
Collectors 클래스. static 메서드로 미리 작성된 collector를 제공한다.
```

> collect()의 매개변수 타입은 Collector인데. 매개변수가 Collector를 구현한 클래스의 객체이어야 한다는 뜻.
그리고 collect()는 이 객체에 구현된 방법대로 스트림의 요소를 수집한다.

### 7.1. 스트림을 컬렉션과 배열로 변환
> toList(), toSet(), toMap(), toCollection(), toArray()

```
// 스트림의 모든 요소를 컬렉션에 수집하려면, Collectors클래스의 toList()와 같은 메서드를 사용하면 된다.  
List<String> names = stuStream.map(Student::getName)
                              .collect(Collectors.toList());

// List나 Set이 아닌 특정 컬렉션을 지정하려면,
// toCollection()에 해당 컬렉션의 생성자 참조를 매개변수로 넣어주면 된다.
ArrayList<String> list = names.stream()
                              .collect(Collectors.toCollection(ArrayList::new));
                              
// Map은 객체의 어떤 필드를 키와 값으로 사용하지 지정해야 한다.
// 요소의 타입이 Person인 스트림에서 사람의 주민번호(regId)를 키로 하고, 값으로 Person 객체를 그대로 저장
Map<String, Person> map = personStream.collect(Collectors.toMap(p->p.getRegId(), p->p)

// 스트림에 저장된 요소들을 T[] 타입의 배열로 변환하려면 toArray() 사용
// 단, 해당 타입의 생성자 참조를 매개변수로 지정해줘야 한다. 지정하지 않으면 반환되는 배열의 타입은 Object[]
Student[] stuNames = studentStream.toArray(Student[]::new);   // OK
Student[] stuNames = studentStream.toArray();                 // 에러
Object[] stuNames = studentStream.toArray();                  // OK
```

### 7.2. 통계
> counting(), summingInt(), averagingInt(), maxBy(), minBy()

### 7.3. 문자열 결합
> joining()
스트림의 요소가 String이나 StringBuffer처럼 CharSequence의 자손인 경우에만 결합 가능하므로
스트림의 요소가 문자열이 아닌 경우에는 먼저 map()을 이용해서 스트림의 요소를 문자열로 변환해야 한다.

```
String studentNames = stuStream.map(Student::getName).collect(joining());
String studentNames = stuStream.map(Student::getName).collect(joining(","));
String studentNames = stuStream.map(Student::getName).collect(joining(",", "[", "]"));

// 만약 map()없이 스트림에 바로 joining()하면, 스트림의 요소에 toString()을 호출한 결과를 결합한다.
String studentInfo = stuStream.collect(joining(","));
```

### 7.4. 그룹화와 분할
> groupingBy(), partitioningBy()
그룹화는 스트림의 요소를 특정 기준으로 그룹화하는 것
분할은 스트림의 요소를 두 가지, 지정된 조건에 일치하는 그룹과 아닌 그룹으로 분할하는 것
groupingBy()는 스트림의 요소를 Function으로, partitioningBy()는 Predicate로 분류
보통 스트림의 두 개의 그룹으로 나눠야 하면 partitioningBy()쓰는 것이 더 빠르고, 그 외에는 groupingBy()를 쓰면 된다.
그룹화와 분할의 결과는 Map에 담겨 반환된다.

### 7.5. partitioningBy()에 의한 분류
```
// 1. 기본 분할
Map<Boolean, List<Student>> stuBySex 
              = stuStream.collect(partitioningBy(Student::isMale));  // 학생들을 성별로 분할
List<Student> maleStudent = stuBySex.get(true);   // Map에서 남학생 목록을 얻는다.
List<Student> femaleStudent = stuBySex.get(false);  // 여학생 목록

// 2. 기본 분할 + 통계 정보
Map<Boolean, Long> stuNumBySex = stuStream.collect(partitioningBy(Student::isMale, counting()));
System.out.println(stuNumBySex.get(true));  // 8 (남학생수)
System.out.println(stuNumBySex.get(false));  // 10 (여학생수)


// 남학생 1등 구하기, mapBy()의 반환타입은 Optional<Student>
Map<Boolean, Optional<Student>> topScoreBySex
                = stuStream.collect(partitioningBy(Student::isMale, maxBy(comparingInt(Student::getScore))));
System.out.println(topScoreBySex.get(true));  // Optional{[남일등, 남, 1, 1, 300]}


// mapBy()의 반환타입이 Optional<Student>가 아닌 Student를 반환 결과로 얻으려면,  
// collectiongAndThen()과 Optional::get 함께 사용
Map<Boolean, student> topScoreBySex 
            = stuStream.collect(
                        partitioningBy(
                            Student::isMale, collectingAndThen(
                                              maxBy(comparingInt(Student::getScore))
                                              , Optional::get)));
                                              
// 3. 이중 분할
Map<Boolean, Map<Boolean, List<Student>>> failedStuBySex 
                         = stuStream.collect(
                                      partitioningBy(Student::isMale, partitioningBy(s->s.getScore()<150)));
List<Student> failedMaleStu = failedStuBySex.get(true).get(true);
```

### 7.6. groupingBy()에 의한 분류
> groupingBy()로 그룹화하면 기본적으로 List에 담는다.

```
// 1. 학생 스트림을 반 별로 그룹지어 Map에 저장 
Map<Integer, List<Student>> stuByBan 
                  = stuStream.collect(groupingBy(Student::getBan, toList()));   //toList()생략가능

Map<Integer, HashSet<Student>> stuByHak 
                  = stuStream.collect(groupingBy(Student::getHak, toCollection(HashSet::new)));


// 2. 학생 스트림을 성적의 등급(Student.Level)으로 그룹화
Map<Student.Level, Long> stuByLevel
            = stuStream.collect(
                        groupingBy(s-> { if(s.getScore()>=200)      return Student.Level.HIGH;
                                         else if(s.getScore()>=100) return Student.Level.MID;
                                         else                       return Student.Level.LOW;
                                       }, counting()));


// 3. groupingBy() 다중 사용하기.
// 학년별로 그룹화하고 다시 반별로 그룹화
Map<Integer, Map<Integer, List<Student>>> stuByHakAndBan
            = stuStream.collect(groupingBy(Student::getHak,
                                groupingBy(Student::getBan)));
                                

// 4. 각 반별 1등 추출
Map<Integer, Map<Integer, Student>> topStuByHakAndBan
            = stuStream.collect(groupingBy(Student::getHak,
                                groupingBy(Student::getBan, 
                                           collectingAndThen(
                                                        maxBy(comparingInt(Student::getScore)),
                                                                                      Optional::get))));


// 5. 학년별, 반별 그룹화한 후에 성적그룹으로 변환하여 Set에 저장
Map<Integer, Map<Integer, Set<Student.Level>>> stuByHakAndBan
            = stuStream.collect(groupingBy(Student::getHak,
                                groupingBy(Student::getBan,
                                           mapping(s-> {
                                                        if(s.getScore()>=200)      return Student.Level.HIGH;
                                                        else if(s.getScore()>=100) return Student.Level.MID;
                                                        else                       return Student.Level.LOW;
                                                       } , toSet()))));
```

## 8. 스트림 변환 정리
|from|to|변환메서드|
|--|--|--|
|1. 스트림 -> 기본형 스트림|		
|Stream|	IntStream|	mapToInt (ToIntFunction mapper)
||LongStream|	mapToLong (ToLongFunction mapper)
||DoubleStream|	mapToDouble (ToDoubleFunction mapper)
|2. 기본형 스트림 -> 스트림|		
|IntStream|	Stream||	
|LongStream|	Stream|	boxed()|
|DoubleStream|	Stream||	
|Stream|	mapToObj| (DoubleFunction mapper)|
|3. 스트림의 스트림 -> 스트림|		
|Stream>	|Stream|	flatMap (Function mapper)|
|Stream|	IntStream	|flatMapToInt (Function mapper)|
|Stream|	LongStream	|flatMapToLong (Function mapper)|
|Stream|	DoubleStream	|flatMapToDouble (Function mapper)|
|4. 컬렉션 -> 스트림|		
|Collection, List, Set|	Stream	|stream()|