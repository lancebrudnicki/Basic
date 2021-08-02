import java.util.ArrayList;
import java.util.Arrays;

public class TestBasic{
    public static void main(String[] args){
        Basic tester = new Basic();
        int [] array = {1,4,6,75,34,12,-4};
        int number = 3;
        System.out.println(tester.one());
        System.out.println(tester.two());
        System.out.println(tester.three());
        tester.four();
        System.out.println(tester.five(array));
        System.out.println(tester.six());
        System.out.println(tester.seven(array));
        System.out.println(tester.eight(array, number));
        System.out.println(tester.nine(array));
        System.out.println(tester.ten(array));
        System.out.println(tester.eleven(array));
        System.out.println(tester.twelve(array));
    }


}