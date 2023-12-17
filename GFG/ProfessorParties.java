import java.util.HashMap;

public class ProfessorParties {
    public static String PartyType ( long a[], int n ){
        HashMap<Long,Boolean> map = new HashMap<>();
        for (long l : a) {
            if(map.get(l)!=null){
                return "BOYS";
            }
            else{
                map.put(Long.valueOf(l), true);
            }
        }
        return "GIRLS";
    }
    public static void main(String[] args) {
        
    }
}
