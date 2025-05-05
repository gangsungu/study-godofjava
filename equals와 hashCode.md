## equals와 hashCode

* 동일성과 동등성
    - 동일성(Identity) 
        + 객체의 메모리 주소를 비교하여 같은 객체인지 확인
        + == 연산자를 사용하면 객체가 동일한 메모리 주소인지 확인할 수 있다
        ```java
        String str1 = new String("Java");
        String str2 = new String("Java");

        System.out.println(str1 == str2);  // false (서로 다른 객체)
        ```
        > str1과 str2는 값은 같지만 서로 다른 객체로 생성되었으므로 == 비교시 false 반환
    - 동등성(Equality)
        + 객체의 메모리 주소가 같은지 비교
        ```java
        String str1 = new String("Java");
        String str2 = new String("Java");

        System.out.println(str1.equals(str2));  // true (내용이 같음)
        ```
        > equals() 메소드는 객체의 데이터 값이 같은지 확인하므로 true를 반환

* 참고링크
    - https://velog.io/@rg970604/JAVA-Equals%EC%99%80-HashCode%EB%A5%BC-%EC%9E%AC%EC%A0%95%EC%9D%98%ED%95%98%EB%8A%94-%EC%9D%B4%EC%9C%A0
    - https://inpa.tistory.com/entry/JAVA-%E2%98%95-equals-hashCode-%EB%A9%94%EC%84%9C%EB%93%9C-%EA%B0%9C%EB%85%90-%ED%99%9C%EC%9A%A9-%ED%8C%8C%ED%97%A4%EC%B9%98%EA%B8%B0
    - https://tecoble.techcourse.co.kr/post/2020-07-29-equals-and-hashCode/