package Exam02;

public class Book {

    int isbn;           // 일련 번호

    String title;       // 책 제목

    String author;      // 저자

    String publisher;   // 출판사

    void showInfo() {
        System.out.println("isbn:" + isbn + ", title:" + title + ", author:" + author + ", publisher:" + publisher);
    }
}
