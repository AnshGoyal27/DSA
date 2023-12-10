//Binary String is given. Find longest string that contains only 1
// Hint: We can flip 0 to 1 once to achieve longest substring that contains 1
// Example for S = "1101100111" the longest substring is of length 5


public class onlyOne {
    static int getLongestLengthofSubString(String str){
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int countZeros = 0;
        for(;right<str.length();right++){
            if(str.charAt(right)=='0'){
                countZeros++;
            }
            while(countZeros>1){
                if(str.charAt(left)=='0'){
                    countZeros--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println(getLongestLengthofSubString("1101100111"));
    }
}
