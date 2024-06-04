package Exam03;

public class Ex02 {
    public static void main(String[] args) {        // new -> b1으로 대입

        // new Book() : 생성자 함수(객체를 생성하는 함수), 주소값 반환(객체 생성)
        Book b1 = new Book( 1001, "책2", "저자2");       // Book에 정의된 변수들이 힙 메모리에 생성, 메모리에 만들 때  new를 붙임. () <- 생성자
        // 클래스명

        b1.showInfo();

        // Class cls = Book.class; // Class.클래스
    }
}
