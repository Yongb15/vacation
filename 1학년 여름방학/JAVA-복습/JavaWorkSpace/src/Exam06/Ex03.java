package Exam06;

public class Ex03 {
    public static void main(String[] args) {

        //int[] nums = new int[]{10, 20, 30, 40};         // 0, 1, 2, 3
        int[] nums = { 10, 20, 30, 40 };
        System.out.println("공간의 개수 : " + nums.length);

        /**for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }*/

        for(int num : nums) {                           // 향상된 for문
            System.out.println(num);
        }
    }
}
