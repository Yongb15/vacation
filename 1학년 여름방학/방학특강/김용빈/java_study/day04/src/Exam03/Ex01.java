package Exam03;

//import Exam02.Book;
//import Exam02.Ex02;
import Exam02.*;                                // * = 패키지안 모든 클래스를 의미함.

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {

        //Exam02.Book book = new Book();
        Book book = new Book();

        //Exam02.Ex01 Ex01 = new Exam02.Ex01();
        Ex02 Ex01 = new Ex02();

        int[] nums = { 10, 20, 30 };
        System.out.println(Arrays.toString(nums));
    }
}
