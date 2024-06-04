package Exam01;

public class Ex03 {
    public static void main(String[] args) {

        int total = 0, num = 1;             // 초기값

        while(num <= 100) {                 // 조건식

            total += num;                                       // total = total + num;
            num++;                          // 증감식            // num = num + 1;
        }

        System.out.println("합계 : " + total);

    }
}
