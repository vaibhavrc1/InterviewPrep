package commoncodingquestions;

public class PrimeNumber {

    //Write a Java program to check if a given number is prime or not.
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(29)); //true
        System.out.println(isPrimeNumber(0)); //true
        System.out.println(isPrimeNumber(1)); //true
        System.out.println(isPrimeNumber(2)); //true
        System.out.println(isPrimeNumber(3)); //true
        System.out.println(isPrimeNumber(4)); //true
    }
    public static boolean isPrimeNumber(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
