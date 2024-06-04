package Exam03;

public class Ex01 {
    public static void main(String[] args) {    //args도 지역변수

        Book b1 = new Book();                   // b1이 지역변수
        b1.isbn = 1000;                         // 값이 대입하자 변수가 됨. ex) isbn, title, author -> 힙 영역 메모리에서 할당
        b1.title = "잘 먹고 잘 살기";             // 값이 대입하자 변수가 됨. ex) isbn, title, author -> 힙 영역 메모리에서 할당
        b1.author = "김용빈";                    // 값이 대입하자 변수가 됨. ex) isbn, title, author -> 힙 영역 메모리에서 할당

        b1.showInfo();

        System.out.println("b1 : " + b1 + ", 객체의 주소값 : " + System.identityHashCode(b1));       //Exam03.Book@70177ecd : 패키지명.클래스명@주소
                                                // 4byte
        Book b2 = new Book();
        
        b2.isbn = 1001;
        b2.title = "잠만자는방법";
        b2.author = "김유미(진)";

        b2.showInfo();

        System.out.println("b2 : " + b2 + ", 객체의 주소값 : " + System.identityHashCode(b2));

        Book b3 = b2;                                                       // 같은 주소에 접근해서 b2값도 바뀜

        b3.isbn = 1002;
        b3.title = "흐아아암";
        b3.author = "김유진(미)";

        b3.showInfo();
        b2.showInfo();

        System.out.println("b3 : " + b3 + ", 객체의 주소값 : " + System.identityHashCode(b3));

        b1 = null;                                                  // 주소값이 사라짐.


    }


}
