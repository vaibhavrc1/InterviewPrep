package commoncodingquestions;

public class PatternPrograms {
    public static void main(String[] args) {
        printDescendingStairsPattern(6);
        printAscendingStairsPattern(6);
    }

    public static void printDescendingStairsPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printAscendingStairsPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
