import java.util.Scanner;

public class solution {
    public static void main(String[] args){
        String[][] left =
        {{" _ ","| |","|_|"},
        {" ","|","|"},
        {" _ ","|_ "," _|"},
        {" _","|_","|_"},
        {"   ","|_|","|  "},
        {" _ "," _|","|_ "},
        {" _ "," _|","|_|"},
        {" _","| ","| "},
        {" _ ","|_|","|_|"},
        {" _ ","|_|","|_ "}};
        
        String[][] up =
        {{" _ ","| |","|_|"},
        {" ","|","|"},
        {" _ ","|_ "," _|"},
        {"_ ","_|","_|"},
        {"   "," _|","| |"},
        {" _ "," _|","|_ "},
        {" _ ","|_|","|_ "},
        {"  "," |","_|"},
        {" _ ","|_|","|_|"},
        {" _ "," _|","|_|"}};

        String[][] segment =
        {{" _ ","| |","|_|"},
        {" ","|","|"},
        {" _ "," _|","|_ "},
        {"_ ","_|","_|"},
        {"   ","|_|","  |"},
        {" _ ","|_ "," _|"},
        {" _ ","|_ ","|_|"},
        {"_ "," |"," |"},
        {" _ ","|_|","|_|"},
        {" _ ","|_|"," _|"}};

        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        for(int i=0;i<a.length();i++){
            if(b.charAt(i)=='U'|| b.charAt(i)=='D'){
                System.out.print(up[Character.getNumericValue(a.charAt(i))][0]);
            }
            else if(b.charAt(i)=='L'|| b.charAt(i)=='R'){
                System.out.print(left[Character.getNumericValue(a.charAt(i))][0]);
            }
            else{
                System.out.print(segment[Character.getNumericValue(a.charAt(i))][0]);
            }
        }
        System.out.println();
        for(int i=0;i<a.length();i++){
            if(b.charAt(i)=='U'|| b.charAt(i)=='D'){
                System.out.print(up[Character.getNumericValue(a.charAt(i))][1]);
            }
            else if(b.charAt(i)=='L'|| b.charAt(i)=='R'){
                System.out.print(left[Character.getNumericValue(a.charAt(i))][1]);
            }
            else{
                System.out.print(segment[Character.getNumericValue(a.charAt(i))][1]);
            }
        }
        System.out.println();
        for(int i=0;i<a.length();i++){
            if(b.charAt(i)=='U'|| b.charAt(i)=='D'){
                System.out.print(up[Character.getNumericValue(a.charAt(i))][2]);
            }
            else if(b.charAt(i)=='L'|| b.charAt(i)=='R'){
                System.out.print(left[Character.getNumericValue(a.charAt(i))][2]);
            }
            else{
                System.out.print(segment[Character.getNumericValue(a.charAt(i))][2]);
            }
        }
        System.out.println();
    }
}







// String left = {{"  ","  |","  |"},{" _ ","|_ ","_|"}};