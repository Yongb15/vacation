package Answer01;

public class As04 {
    public static void main(String[] args) {

        // 구구단을 홀수 단만 출력하도록 프로그램을 만드시오. 구현 소스

        for (int i = 2; i <= 9; i++) {
            System.out.println();
            if(i % 2 == 0) {
                continue;
            }
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
