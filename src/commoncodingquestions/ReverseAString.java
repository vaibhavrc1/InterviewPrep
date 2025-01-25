package commoncodingquestions;

public class ReverseAString {
    //Write a Java program to reverse a given string without using any built-in functions or libraries.

    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str){
        char[] chars = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
