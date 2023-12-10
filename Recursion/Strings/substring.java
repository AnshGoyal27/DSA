import java.util.ArrayList;

class substring{
    static ArrayList<String> getSubSequences(String str){
        // Termination Case
        if(str.length()==0){
            ArrayList<String> list = new ArrayList<String>();
            list.add("");
            return list;
        }
        // Pick first char
        char first = str.charAt(0);
        // Make string small until exhaust
        ArrayList<String> result = getSubSequences(str.substring(1));
        ArrayList<String> finalList = new ArrayList<>();
        // Do include and Do not include
        for(int i=0; i<result.size();i++){
            finalList.add(result.get(i)); // Not include
            finalList.add(result.get(i)+first); // Include
        }
        return finalList;
    }
    public static void main(String[] args) {
        System.out.println(getSubSequences("Amit"));
    }
}