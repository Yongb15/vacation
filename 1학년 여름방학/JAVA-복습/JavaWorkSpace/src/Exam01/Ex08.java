package Exam01;

public class Ex08 {
    public static void main(String[] args) {

        byte num1 = 100; // 1바이트
        short num2 = num1; // 2 바이트
        int num3 = num2; // 4바이트
        int num4 = num3; // 8바이트

        float num5 = num4;
        double num6 = num4;
        double num7 = num5;

        char ch = '가'; // 2바이트
        int ch2 = ch;
        long ch3 = ch2;
    }
}
