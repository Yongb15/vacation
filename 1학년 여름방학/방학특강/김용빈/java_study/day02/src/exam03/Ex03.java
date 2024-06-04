package exam03;

public class Ex03 {
    public static void main(String[] args) {

        char gender = 'F';

        /**
        String str = nul;                                   // nul == 값이 없음

        if(gender == 'F') {
            System.out.println("여성입니다.");
        }

        else {
            System.out.println("남성입니다.");
        }   */

        String str = gender == 'F' ? "여성" : "남성";
        System.out.println(str);

    }
}