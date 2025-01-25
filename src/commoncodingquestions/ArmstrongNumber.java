package commoncodingquestions;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber1(153));
        System.out.println(isArmstrongNumber2(153));
        System.out.println(isArmstrongNumber1(152));
        System.out.println(isArmstrongNumber2(152));
    }

    public static boolean isArmstrongNumber1(int num){
        String str = Integer.toString(num);
        char[] chars = str.toCharArray();
        double sum = 0;
        for(char ch: chars){
            int n = ch - '0';
            sum += Math.pow(n, 3);
        }
        return sum == num;
    }

    public static boolean isArmstrongNumber2(int num){
        List<Integer> list = new ArrayList<>();
        int copyNum = num;
        while(copyNum > 0){
            list.add(copyNum % 10);
            copyNum /= 10;
        }
        int sum = 0;
        for(int n: list){
            sum += Math.pow(n, 3);
        }
        return sum == num;
    }
}
