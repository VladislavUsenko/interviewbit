import java.util.*;

public class Solution {


    final static int MOD = 1_000_000_007;

    
    public static void main(String[] args) {

        List<Integer> B = Arrays.asList(2147483647, 2000000014, 2147483647);
        int A = 10;

        System.out.println("-----------------");
        System.out.println(nchoc(A, B));
    }

    public static long nchoc(int A, List<Integer> B) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.addAll(B);

        long res = 0;

        for (int i = 0; i < A; i++) {
            if (queue.isEmpty()) break;

            int max = queue.poll();
            res = (res + max) % MOD;
            queue.offer(max / 2);
        }

        return res;
    }
}
