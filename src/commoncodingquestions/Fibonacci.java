package commoncodingquestions;

public class Fibonacci {
    //Write a function to compute the Nth Fibonacci number.
    public static void main(String[] args) {
        System.out.println(findNthFibonacci(6));
    }

    public static int findNthFibonacci(int num){
        if(num < 3){
            return num;
        }
        int first = 1;
        int second = 2;
        int sum = 0;
        for(int i = 3; i <= num; i++){
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;

    }
}
