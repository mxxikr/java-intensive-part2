# 🌱 기초 탄탄 독하게 시작하는 Java - Part 2 OOP와 JVM
[![Java](https://img.shields.io/badge/Java-21%2B-orange?logo=java)](https://www.oracle.com/java/)
[![IDE](https://img.shields.io/badge/IntelliJ-IDEA-blue?logo=intellij-idea)](https://www.jetbrains.com/idea/)
* 널널한 개발자님의 [독하게 시작하는 Java - Part 2 강의](https://www.inflearn.com/course/%EB%8F%85%ED%95%98%EA%B2%8C-%EC%8B%9C%EC%9E%91%ED%95%98%EB%8A%94-java-part2) 실습 코드 아카이브

---

### 💻 Development Environment

* java 21
* IDE IntelliJ IDEA

### 🏆 실습 목표

* 객체 지향 프로그래밍의 핵심 원리인 상속과 다형성 그리고 캡슐화 완벽 이해
* JVM 내부 구조와 메모리 관리 메커니즘을 통한 효율적인 코드 작성 능력 습득
* 불변 객체와 다양한 클래스 구조를 활용한 고급 자바 프로그래밍 기법 숙달
* 실전 OOP 실습을 통한 객체 지향 설계 역량 강화

### 📝 Curriculum

1. **시작에 앞서**
2. [**클래스 - 첫 번째**](https://mxxikr.github.io/posts/java-part2-class-structure/)

   * 객체 지향의 기본 단위인 클래스와 인스턴스의 관계 정립
   * 생성자를 활용한 객체 초기화 로직 구현
   * 접근 제어자를 통한 데이터 은닉과 캡슐화 원칙 적용
   * this 키워드의 물리적 의미와 인스턴스 멤버 참조 방식 이해

3. [**클래스 - 두 번째**](https://mxxikr.github.io/posts/java-part2-class-advanced/)

   * 다양한 생성자 정의를 통한 객체 생성 유연성 확보
   * 얕은 복사와 깊은 복사의 메모리 구조적 차이 학습
   * 복사 생성자를 이용한 독립적 객체 복제 구현
   * 정적 멤버의 생명주기와 공유 메모리 영역 활용 기법

4. [**상속과 관계**](https://mxxikr.github.io/posts/java-part2-inheritance/)

   * 클래스 재사용을 위한 상속의 기본 문법과 부모 클래스 참조
   * 메서드 오버라이딩을 통한 하위 클래스의 기능 재정의
   * 객체 간의 포함 및 상속 관계를 설계하는 UML 모델링 기초
   * 동적 바인딩을 통한 런타임 메서드 호출 원리 파악

5. [**다형성**](https://mxxikr.github.io/posts/java-part2-polymorphism/)

   * 하나의 인터페이스로 다양한 구현체를 다루는 다형성의 핵심 가치 이해
   * 업캐스팅과 다운캐스팅의 활용 및 instanceof를 통한 안정성 확보
   * 추상 클래스와 인터페이스를 활용한 설계 추상화 기법
   * 상수 집합 관리를 위한 열거형 클래스 활용

6. [**JVM 기본 이론**](https://mxxikr.github.io/posts/java-part2-jvm/)

   * 자바 실행 환경의 핵심인 JVM 런타임 데이터 영역 구조 분석
   * 메서드 영역과 스택 그리고 힙 영역의 메모리 할당 메커니즘
   * 클래스 로더의 로딩 및 링크와 초기화 단계 상세 학습
   * 바이트 코드가 기계어로 해석되는 과정 이해

7. [**JVM과 GC 그리고 객체**](https://mxxikr.github.io/posts/java-part2-gc-object/)

   * 가비지 컬렉션의 기본 원리와 객체 소멸 조건 분석
   * G1 GC를 포함한 현대적 GC 알고리즘의 동작 방식 이해
   * Object 클래스의 기본 메서드인 equals와 hashCode 재정의 규칙
   * 객체 메모리 레이아웃과 해시코드 생성 원리 학습

8. [**불변 객체와 String 클래스**](https://mxxikr.github.io/posts/java-part2-immutable-string/)

   * 상태를 변경할 수 없는 불변 객체의 설계 목적과 장점 파악
   * JVM이 관리하는 문자열 상수 풀의 동작 원리와 메모리 효율성
   * String과 StringBuilder의 성능 차이 및 상황별 선택 기준
   * 기본 자료형을 객체로 다루는 래퍼 클래스와 박싱 메커니즘

9. [**내부 클래스 익명 객체 패키지**](https://mxxikr.github.io/posts/java-part2-nested-classes/)

   * 클래스 내부에서 정의되는 중첩 클래스의 종류와 스코프 이해
   * 인터페이스 구현체 없이 즉석에서 객체를 생성하는 익명 객체 활용
   * 이벤트 기반 프로그래밍을 위한 내부 클래스 설계 기법
   * 패키지 구조를 이용한 네임스페이스 관리 및 모듈화 기초

10. [**연결 리스트 기반 주소록과 OOP 실습**](https://mxxikr.github.io/posts/java-part2-linked-list/)

    * 참조를 이용한 동적 자료구조인 연결 리스트의 직접 구현
    * 절차적 코드에서 객체 지향적 코드로 발전시키는 단계별 리팩토링
    * 컨테이너와 반복자 패턴을 적용한 객체 순회 기법 실습

11. [**예외 처리**](https://mxxikr.github.io/posts/java-part2-exception-handling/)

    * 프로그램 실행 중 발생하는 예외 상황의 계층 구조 이해
    * Checked Exception과 Unchecked Exception의 처리 전략 수립
    * try catch finally 구문을 활용한 예외 복구와 자원 해제
    * 메서드 선언부에 throws를 명시하여 예외 책임을 전파하는 기법
