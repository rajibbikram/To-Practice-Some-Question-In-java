package PraticQuestion;

public class Solution {
    public static int numOfStr(String[] patterns, String wor){
        int count = 0;
        for (String p : patterns){
            if(wor.contains(p)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        String[]  patterns = {"a", "abc", "bc", "d"};

        String wor = "abc";

        System.out.println(sol.numOfStr(patterns, wor));

    }
}
