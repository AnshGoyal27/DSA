import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class mergeIntervals {
    public int[][] merge(int[][] intervals) {
        PriorityQueue<List<Integer>> pq = new PriorityQueue<List<Integer>>(new Comparator<List<Integer>>() {
            public int compare(List<Integer> l1,List<Integer> l2){
                return l1.get(0) - l2.get(0);
            }
        });
        for(int i=0;i<intervals.length;i++){
            List<Integer> toAdd = new ArrayList<Integer>();
            toAdd.add(intervals[i][0]);
            toAdd.add(intervals[i][1]);
            pq.add(toAdd);
        }
        int end = 0;
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        while(!pq.isEmpty()){
            if(answer.size()==0){
                List<Integer> curr = pq.poll();
                end = curr.get(1);
                answer.add(curr);
            }
            else{
                List<Integer> curr = pq.poll();
                if(curr.get(0)<=end){
                    List<Integer> newAdd = new ArrayList<Integer>();
                    newAdd.add(answer.getLast().get(0));
                    newAdd.add(Math.max(curr.get(1),answer.getLast().get(1)));
                    end = newAdd.get(1);
                    answer.removeLast();
                    answer.add(newAdd);
                }
                else{
                    answer.add(curr);
                    end = curr.get(1);
                }
            }
        }
        int[][] ans = new int[answer.size()][2];
        for(int i=0;i<answer.size();i++){
            ans[i][0] = answer.get(i).get(0);
            ans[i][1] = answer.get(i).get(1);
        }
        return ans;
    }
}
