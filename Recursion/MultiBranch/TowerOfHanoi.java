package MultiBranch;
public class TowerOfHanoi {
    static void TOH(int start,int mid,int dest,int n){
        if(n==1){
            System.out.println("Moved Disk from "+start+" to "+dest);
            return;
        }
        TOH(start,dest,mid,n-1);
        TOH(start,mid,dest,1);
        TOH(mid,start,dest,n-1);
    }
    public static void main(String[] args) {
        TOH(1, 2, 3, 3);
    }
}
