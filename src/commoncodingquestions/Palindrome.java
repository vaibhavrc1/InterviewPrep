package commoncodingquestions;

public class Palindrome {
    //Write a Java program to check if a given string is a palindrome or not.

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
