import java.util.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(34, 35, 27, 42, 5, 28, 39, 20, 28));

        System.out.println(prevSmaller(list)); //-1 34 -1 27 -1 5 28 5 20
    }

    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        
        ArrayList<Integer> res = new ArrayList<>();

        LinkedList<Integer> mins = new LinkedList<>();

        mins.add(A.get(0));
        res.add(-1);
        
        for(int i = 1; i < A.size(); i++) {

            if(A.get(i) > A.get(i - 1)) {
                res.add(A.get(i - 1));
                mins.addFirst(A.get(i - 1));
            } else {
                int num = -1;
                for (Integer j : mins) {
                    if(j < A.get(i)) {
                        num = j;
                        break;
                    }
                }
                res.add(num);
            }
        }

        return res;
    }
}