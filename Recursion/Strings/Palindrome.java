public class Palindrome {
    static boolean isPalindrome(String str, int s, int e){
        if(s>=e){
            return true;
        }
        return (str.charAt(s)==str.charAt(e)) && isPalindrome(str, s+1, e-1);
    }
    public static void main(String[] args) {
        String a = "nitin";
        boolean result = isPalindrome(a, 0, a.length()-1);
        System.out.println(result);
    }
}
