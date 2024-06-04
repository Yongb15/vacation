package Exam01;

public class Ex10 {
    public static void main(String[] args) {
        int total = 0, i = 1;

        while(i <= 100) {
            if(i % 2 == 0) {
                i++;
                continue;
            }

            total += i;
            i++;
        }

        System.out.println("합계 : " + total);
    }
}
