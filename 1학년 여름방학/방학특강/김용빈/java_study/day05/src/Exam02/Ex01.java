package Exam02;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();                     //  s1, args -> 지역 변수

        s1.id = 202307053;
        s1.name = "김용빈";
        s1.subject = "컴공과";

        s1.showInfo();

        Student s2 = new Student();                     // 객체를 만들면 힙에 공간 생성

        s2.id = 202314409;
        s2.name = "김유미";
        s2.subject = "자퇴";
        s2.showInfo();

        System.out.println("s1 : " + s1 + ", 힙 메모리 주소 : " + System.identityHashCode(s1));   // 패키지명.클래스명@16진수
        System.out.println("s2 : " + s2 + ", 힙 메모리 주소 : " + System.identityHashCode(s2));   // Exam02.Student@378fd1ac
    }
}
