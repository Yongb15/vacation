package Exam02;

public class Ex15 {
    public static void main(String[] args) {

        int num = 12;
        boolean result = num++ > 11 && (num = num + 20) > 50;           // 단락회로 평가

        System.out.println(num);
        System.out.println(result);

    }
}
