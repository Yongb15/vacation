package Exam05;

public class Ex01 {
    public static void main(String[] args) {

        /**
         int studentId1 = 202310001;
         int studentId2 = 202310002;
         // ...
         int studentId3 = 20231000100;
         */

        int[] studentIds = new int[100];

        for(int i = 0; i <= 99; i++) {

            studentIds[i] = 2023210001 + i;
            System.out.println("학번 : " + studentIds[i]);

        }
    }
}
