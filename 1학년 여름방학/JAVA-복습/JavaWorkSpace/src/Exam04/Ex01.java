package Exam04;

public class Ex01 {
    public static void main(String[] args) {

        int rank = 4;

        switch(rank) {

            case 1 :
                System.out.println("금메달!");
                break;

            case 2 :
                System.out.println("은메달!");
                break;

            case 3 :
                System.out.println("동메달!");
                break;

            default :
                System.out.println("탈락!");
        }
    }
}
