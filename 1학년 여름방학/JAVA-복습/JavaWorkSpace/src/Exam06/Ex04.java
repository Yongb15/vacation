package Exam06;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {

        int[][] nums = new int[2][3];           // 47분

        nums[0][0] = 10;
        nums[0][1] = 20;
        nums[0][2] = 30;

        nums[1][0] = 40;
        nums[1][1] = 50;
        nums[1][2] = 60;

        System.out.println(nums.length); //2
        System.out.println(nums[0].length); // 3

        System.out.println(Arrays.deepToString(nums));

        for(int i = 0; i < nums.length; i++) {  // 행 - 0, 1
            for(int j = 0; j < nums[i].length; j++) {   // 각 행의 열. 0, 1, 2
                System.out.println("행 : " + i + ", 열 : " + j + "," + nums[i][j]);
            }
        }
    }
}
