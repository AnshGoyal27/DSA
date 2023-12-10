import java.util.Scanner;

public class Div11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Number: ");
        int n = s.nextInt();
        int sumo=0;
        int sume=0;
        int i=0;
        while(n>0){
            if(i%2==0){
                sumo+=n%10;
            }
            else{
                sume+=n%10;
            }
            n = Math.floorDiv(n,10);
            i++;
        }
        if(Math.abs(sumo-sume)==0 || Math.abs(sumo-sume)%11==0){
            System.out.print("Divisible by 11");
        }
    }
}
