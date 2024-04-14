import java.util.ArrayList;
import java.util.List;

public class Permutation {
    static public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        permuteCombos(nums, 0, list, answer);
        // System.out.println(answer);
        return answer;
    }
    static public void permuteCombos(int[] nums, int j, List<Integer> list, List<List<Integer>> answer){
        if(j==nums.length){
            answer.add(list);
            return;
        }
        else{
            for(int i=0;i<nums.length;i++){
                // System.out.println("List: "+list+" j: "+j+" i: "+i);
                if(!list.contains(nums[i])){
                    List<Integer> newList = new ArrayList<Integer>();
                    for(int k=0;k<list.size();k++){
                        newList.add(list.get(k));
                    }
                    newList.add(nums[i]);
                    // System.out.println("newList: "+newList);
                    permuteCombos(nums, j+1, newList, answer);
                }              
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        permute(nums);
    }
    
}