
public class subSeq {
    static void getSubSeq(String str, String result){
        if(str.length()==0){
            System.out.println(result);
            return;
        }
        char singleChar = str.charAt(0);
        String smallString = str.substring(1);
        getSubSeq(smallString, result); // Not include
        getSubSeq(smallString, result + singleChar); // Include
    }
    public static void main(String[] args) {
        getSubSeq("amit", "");
    }
}

