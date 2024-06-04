package Exam04;

public class Ex08 {
    public static void main(String[] args) {

        int num = 1;

        while(num <= 10) {
            System.out.println("참일 때 반복");
            System.out.println(num);
            num++;
        }

        // int num1 : 초기값, num <= 10 : 조건식, num++ : 증감식 -> 반복 횟수가 있는 경우 필수 요소
        // for (초기화식; 조건식; 증감식) { .... }
    }
}
