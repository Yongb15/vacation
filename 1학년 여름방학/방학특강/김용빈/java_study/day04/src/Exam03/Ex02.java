package Exam03;

public class Ex02 {
    public static void main(String[] args) {

        int result = calc(3);

        System.out.println(result);
    }

    static int calc(int x) {
        // x = 매개변수
        int y = x * 2 + 1;

        return y;
    }
}
