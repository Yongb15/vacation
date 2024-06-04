package Exam02;

public class Ex01 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.isbn = 1000;
        b1.title = "책1";
        b1.author = "저자1";
        b1.publisher = "출판사1";

        b1.showInfo();
    }
}
