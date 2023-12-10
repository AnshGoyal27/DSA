public class voidPermutation {
    static void getPerm(String str, String result){
        if(str.length()==0){
            System.out.println(result);
            return;
        }
        char singleChar = str.charAt(0);
        String smallString = str.substring(1);
        // getPerm(smallString, result); // Not include
        // getPerm(smallString, result + singleChar); // Include
        for(int i = 0;i<result.length();i++){
            StringBuilder stringBuilder = new StringBuilder(result);
            stringBuilder.insert(i,singleChar);
            getPerm(smallString, result);
        }
    }
    public static void main(String[] args) {
        getPerm("amit", "");
    }
}
