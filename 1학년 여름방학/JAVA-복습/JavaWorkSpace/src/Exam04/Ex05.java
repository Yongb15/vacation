package Exam04;

public class Ex05 {
    public static void main(String[] args) {

        int total = 0;

        for(int num = 1; num <= 100; num++) {

            total += num;
            System.out.println("현재 값 : " + total);

        }

        System.out.println("합계 : " + total);

    }
}
