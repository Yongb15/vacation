package Exam01;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {        // main은 시작함수  1.

        int num1 = 10;                                  // 지역변수     2.
        int num2 = 20;                                  // 지역변수     3.
        int result = add(num1, num2);                   // main -> add()함수  4.

        System.out.println(result);

        int result2 = add(10, 20, 30);                  // 매개변수의 개수에 따라 동작하는 것이 다름
        System.out.println(result2);



        double result3 = add(10, 20, 30);                  // 매개변수의 개수에 따라 동작하는 것이 다름
        System.out.println(result3);
    }

    static int add(int num1, int num2) {            // 함수 지역 / 실행코드   num1, num2 = 변수x 그냥 코드임. // ex) 레시피  /// 임시 메모리(스택영역메모리)

        int result = num1 + num2;                   // 지역변수

        return result;                              // 함수의 종료   / 연산 후 없어짐
    }

    static int add(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;

        return result;
    }

    static double add(double num1, double num2) {            // 함수 지역 / 실행코드   num1, num2 = 변수x 그냥 코드임. // ex) 레시피  /// 임시 메모리(스택영역메모리)

        double result = num1 + num2;                   // 지역변수

        return result;                              // 함수의 종료   / 연산 후 없어짐
    }


}
