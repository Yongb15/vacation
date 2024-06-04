package Exam03;

public class Ex03 {
    public static void main(String[] args) {

        int result1 = add(10, 20);

        System.out.println(result1);
    }
    
    static int add(int num1, int num2) {    // 함수 지역

        int result = num1 + num2;
        return result;      // 함수 종료

    }
}
