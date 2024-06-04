package Exam03;

public class Ex02 {
    public static void main(String[] args) {

        int[] nums = new int[4];            // int 변수 4개 생성 순서 : 0 -> 1 -> 2 -> 3

        nums[0] = 10;                       // 첫 번째(0) int 변수에 10을 대입
        nums[1] = 20;                       // 두 번째(1) int 변수에 20을 대입
        nums[2] = 30;                       // 첫 번째(2) int 변수에 30을 대입
        nums[3] = 40;                       // 두 번째(3) int 변수에 40을 대입

        /** System.out.println("0번째 방 : " + nums[0]);
        System.out.println("1번째 방 : " + nums[1]);
        System.out.println("2번째 방 : " + nums[2]);
        System.out.println("3번째 방 : " + nums[3]); */

        for (int i = 0; i <= 3; i++) {
            System.out.println(i + "번째 방 값 : " + nums[i]);
        }

    }
}
