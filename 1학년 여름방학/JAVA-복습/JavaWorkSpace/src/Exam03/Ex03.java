package Exam03;

public class Ex03 {
    public static void main(String[] args) {

        int age = 15;

        if(age < 8) {
            System.out.println("유치원생입니다!");
        }

        else if(age < 14) {                                     // age >= 8 && age < 14
            System.out.println("초등학생입니다!");
        }

        else if(age < 17) {                                     // age >= 14 && age < 17
            System.out.println("중학생입니다!");
        }

        else if(age < 20) {                                     // age >= 17 && age < 20
            System.out.println("고등학생입니다!");
        }

        else {                                                  // 20보다 높을 때
            System.out.println("성인입니다!");
        }
    }
}
