package Exam01;

public class Ex07 {
    public static void main(String[] args) {

        int total = 0;

        for (int i = 1; i <= 100; i++) {

            // 짝수일때 반복을 건너뛰기 하면 홀수만 더해진다

            if( i % 2 == 0) {           // 짝수
                continue;               // 건너뛰기
            }
            total += i;

            /** if (i % 2 == 1) {       // 홀수
                total += i;
            } */
        }
        
        System.out.println("홀수의 값 : " + total);
    }
}
