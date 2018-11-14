# chapter08 예외처리(Exception handling)


## 1.1 프로그램 오류

| 컴파일에러(compile-time error) | 런타임에러(runtime error) |
| :--------: | :--------: |
| 컴파일할 때 발생하는 에러 | 실행할 때 발생하는 에러 |

- 논리적 에러
의도와 다른 결과를 초래
오류는 없으나 결과가 원치 않게 나옴
ex) 창고 재고가 음수로나옴

### JAVA의 런타임 에러 - 프로그램 코드에 의해서 에러(error)와 예외(Exception)

| 에러(error) | 예외(Exception) |
| :--------: | :--------: |
|  수습될수 없는 심각한 오류 | 수습될수 있는 다소 미약한 오류 |

>에러(error)는 어쩔 수 없지만, 예외(Exception)는 처리해야한다.


## 1.2 예외처리의 정의와 목적

| 정의 | 목적 |
| :--------: | :--------: |
|  프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것 | 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는것 |


## [1.3 예외처리구문 – try-catch](https://github.com/bpjava/hyumin/blob/master/ch8/src/ch8/ExceptionEx1.java)

```
try {
    // 예외가 발생할 가능성이 있는 문장들을 넣는다.
} catch (Exception1 e1) {
    // Exception1이 발생했을 경우, 이를 처리하기위한 문장을 적는다.
} catch (Exception2 e2) {
    // Exception2이 발생했을 경우, 이를 처리하기위한 문장을 적는다.
...
} catch (ExceptionN eN) {
    // Exception1이 발생했을 경우, 이를 처리하기위한 문장을 적는다.
}
```

> if 문과 달리 try블럭이나 catch블럭 내에 포함된 문장이 하나라도 괄호를 생략할 수는 없다.


## 1.4 try-catch문에서의 흐름

> try블럭내에서 예외가 발생한 경우
1. 예외와 일치하는 catch블럭 확인
2. O - catch블럭 내 문장들 수행 /
	  X - 예외 처리되지 않음

[예외발생 O](https://github.com/bpjava/hyumin/blob/master/ch8/src/ch8/ExceptionEx5.java)
123**56**

> try블럭 내에서 예외가 발생하지 않은 경우
1. catch 블럭을 거치지 않고 전체 try - catch문을 빠져나가서 수행함

[예외발생 X](https://github.com/bpjava/hyumin/blob/master/ch8/src/ch8/ExceptionEx4.java)
123**46**

## 1.5 예외 발생시키기

1. 먼저 연산자 new를 이용해서 발생시키려는 예외클래스의 객체를 만든다.
```
Exception e = new Exception("고의로 발생");
```
2. 키워드 throw를 이용하여 예외를 발생시킨다.
```
throw e;
```
<한줄로 줄여쓰기>
```
throw new Exception("고의로 발생");
```
[예외발생](https://github.com/bpjava/hyumin/blob/master/ch8/src/ch8/ExceptionEx9.java)

## 1.6 예외클래스의 계층구조

> RuntimeException클래스들 - 예외처리 선택

프로그래머 실수로 발생하는 예외, 컴파일 에러가 나지 않음(예외체크 X)

ex> ClassCastException, NullPointerException, IndexOutOfBoundException

[RuntimeException](https://github.com/bpjava/hyumin/blob/master/ch8/src/ch8/ExceptionEx11.java)

> Exception클래스들 - 예외처리 필수

사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외 (예외체크 O)

ex> IOException, ClassNotFoundException

[Exception](https://github.com/bpjava/hyumin/blob/master/ch8/src/ch8/ExceptionEx10.java)


## 1.7 예외의 발생과 catch블럭
[예외 찾을땐 instanceof연산자 사용](https://github.com/bpjava/hyumin/blob/master/ch8/src/ch8/ExceptionEx7.java)

  - try블럭에서 예외가 발생하면, 발생한 예외를 처리할 catch블럭을 찾는다.
  - 첫번째 catch블럭부터 순서대로 찾아 내려가며, 일치하는 catch블럭이 없으면 예외는 처리되지 않는다.
  - 예외의 최고 조상인 Exception을 처리하는 catch블럭은 모든 종류의 예외를 처리할 수 있다.  **(반드시 마지막 catch블럭이어야 한다.)**
  
  - 발생한 예외 객체를 catch블럭의 참조변수로 접근할 수 있다.

| printStackTrace() | getMessage() |
| :--------: | :--------: |
| 예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력 | 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다. |

[printStackTrace()/getMessage()](https://github.com/bpjava/hyumin/blob/master/ch8/src/ch8/Exception8.java)


## 1.8 finally 블럭

- 예외의 발생여부와 관계없이 **항상** 실행되어야 하는 코드를 넣는다.
- 선택적으로 사용할 수 있으며, try-catch-finally의 순서로 구성된다.
- 예외 발생시, try -> catch -> finally 순서로 실행되고
- 예외 미발생시, try -> finally의 순서로 실행된다.

- try또는 catch블럭에서 return문을 만나도 finally블럭은 수행된다.

```
try {
    // 예외가 발생할 가능성이 있는 문장들을 넣는다.
} catch (Exception1 e1) {
    // Exception1이 발생했을 경우, 이를 처리하기위한 문장을 적는다.
} finally {
    // 예외의 발생여부와 관계없이 항상 수행되어야 하는 문장들을 넣는다.
    // finally블럭은 try-catch문의 맨 마지막에 위치해야한다.
}
```

[finally 사용법](https://github.com/bpjava/hyumin/blob/master/ch8/src/ch8/FinallyTest.java)

[finally 적용](https://github.com/bpjava/hyumin/blob/master/ch8/src/ch8/FinallyTest3.java)


## 1.9 메서드에 예외선언하기

- 예외를 처리하는 다른방법
- 호출한 메서드로 전달하는 것
- 호출한 메서드에서 예외처리를 해야할 때만 사용
```
void method() throws Exception1, Exception2, ... ExceptionN {
    // 메서드의 내용
}
```

> 예외를 발생시키는 키워드 throw와 예외를 메서드에 선언할 때 쓰이는 throws를 잘 구별!

[예외선언순서](https://github.com/bpjava/hyumin/blob/master/ch8/src/ch8/Exception12.java)

### 예외처리 위치
[method1에서 예외처리](https://github.com/bpjava/hyumin/blob/master/ch8/src/ch8/ExceptionEx13.java)


[main에서 예외처리](https://github.com/bpjava/hyumin/blob/master/ch8/src/ch8/ExceptionEx14.java)

### 파일 생성 예제
[method1에서 예외처리](https://github.com/bpjava/hyumin/blob/master/ch8/src/ch8/ExceptionEx15.java)

[main에서 예외처리](https://github.com/bpjava/hyumin/blob/master/ch8/src/ch8/ExceptionEx16.java)

## 1.10 예외 되던지기(re-throwing)

  - 예외를 처리한 후에 다시 예외를 생성해서 호출한 메서드로 전달하는 것
  - 예외가 발생한 메서드와 호출한 메서드, 양쪽에서 예외를 처리해야 하는 경우에 사용.


## 1.11 사용자정의 예외 만들기

  - 기존의 예외 클래스를 상속받아서 새로운 예외 클래스를 정의할 수 있다.
```
class MyException extends Exception {
	MyException(String msg) { // 문자열을 매개변수로 받는 생성자
    super(msg); //조상인 Exception클래스의 생성자 호출
    }
}
```

  - 에러코드를 저장할 수 있게 ERR_CODE와 getErrCode()를 멤버로 추가 
```
class MyException extends Exception { // 에러 코드 값을 저장하기 위한 필드를 추가 했다. 
    private final int ERR_CODE; // 생성자를 통해 초기화
    MyException (String msg, int errCode) { //생성자
        super(msg); 
        ERR_CODE = errCode;
    } 
    MyException (String msg) {  
        this (msg, 100) ;  // ERR_CODE를 100(기본값) 으로 초기화한다.

    public int getErrCode() { // 에러 코드를 얻을 수 있는 메서드도 추가했다. 
    return ERR_CODE; // 이 메서드는 주로 getMessage () 와 함께 사용될 것이다.
    }
}
```





