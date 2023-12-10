public class Perm {
    static void printStringPerm (String s, String r){
        if(s.length()==0){
            System.out.println(r);
            return;
        }
        /*
         * Logic:- Pick each char from a string and call recursively
         */
        for(int i=0;i<s.length();i++){
            char singleChar = s.charAt(i);
            String remString = s.substring(0, i) + s.substring(i+1);
            printStringPerm(remString, r+singleChar);
        }
    }    

}
