package Exam05;

public class Ex06 {
    public static void main(String[] args) {

        int[] nums = { 10, 20, 30, 40, 50, 60 };             // 0, 1, 2, 3
        System.out.println("공간의 개수 : " + nums.length);

        for(int i = 0; i < nums.length; i++) {
            System.out.println("nums[" + i +"] : " + nums[i]);
        }
    }
}
