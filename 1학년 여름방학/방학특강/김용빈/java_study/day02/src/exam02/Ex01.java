package exam02;

public class Ex01 {
    public static void main(String[] args) {

        int num1 = 100;
        long num2 = 200L;

        long num3 = num1 + num2;

        /**
            1. 연산은 같은 자료형만 가능
            2. 자동 형변환이 가능한 자료형이 변경 ex) int -> long
         */

        int num4 = 10;
        double num5 = 10.0;

        double num6 = num4 + num5;

        /**
         1. num4 -> int -> double
         */

        System.out.println(num6);

    }
}
