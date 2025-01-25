package commoncodingquestions;

public class LongestCommonPrefix {
    // Write a Java function to find the longest common prefix string amongst an array of strings.

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"}; // Example array of strings
        System.out.println(findLongestCommonPrefix(strs));
    }

    public static String findLongestCommonPrefix(String[] strs){
        StringBuilder stringBuilder = new StringBuilder();
        String firstString = strs[0];
        //loop for index
        for(int i = 0; i < firstString.length(); i++){
            boolean isValid = true;
            //loop for characters
            for(int j = 1; j < strs.length; j++){
                if(i == strs[j].length()){
                    return stringBuilder.toString();
                }
                if(firstString.charAt(i) != strs[j].charAt(i)){
                    isValid = false;
                }
            }
            if(isValid){
                stringBuilder.append(firstString.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
