package Exam03;

public class Book {                     //class : 설계도, 정의

    int isbn;        // 일련번호   // 4byte                   정의만 함. 변수x
    String title;   // 책 제목     // 4byte
    String author;  // 저자        // 4byte

    public Book() {                               // 기본 생성자 ★            // 객체를 만듬 ★
        // 코드가 없는 이유는 매우 중요하기 때문에 감쳐줘 있음
        // return 안하는 이유 : 반환값이 명시 X, 반환값 변경 불가(개발자가 통제를 못하게 막아놨기 때문)
        // 객체 생성 이후에 코드가 실행
        // 생성된 객체의 변수(맴버 변수)의 초기화를 주로 진행
        isbn = 1000;
        title = "책1";
        author = "저자1";
    }

    public Book(int _isbn, String _title, String _author) {
        isbn = _isbn;
        title = _title;
        author = _author;
    }

    void showInfo() {
        System.out.println("isbn = " + isbn + ", title = " + title + ", author = " + author);
    }
}
