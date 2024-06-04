package exam01;

public class Ex14 {
    public static void main(String[] args) {

        // num가 10 이상이고 100 이하인가?   10 <= num <= 100

        int num = 15;

        boolean result1 = num >= 10;
        boolean result2 = num <= 100;
        boolean result3 = result1 && result2;

        System.out.println(result3);

        boolean result4 = num >= 10 && num <= 100;      // 비교연산 후 논리연산

        System.out.println(result4);

    }
}
