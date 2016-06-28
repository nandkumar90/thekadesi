
public class KadaneAlgorithm {
 
    /**
     * Algorithm to find max subarray sum
     * @param a array for which max subarray sum needs to be found
     * @return max subarray sum
     */
    public int maxSubArraySum(int a[]) {
        int totMaxSum = a[0];
        int currMaxSum = a[0];
 
        for (int i = 1; i < a.length; i++) {
            currMaxSum = a[i]>(currMaxSum+a[i])?a[i]:(currMaxSum + a[i]);
            totMaxSum = totMaxSum>currMaxSum?totMaxSum:currMaxSum;
        }
        return totMaxSum;
    }
 
    /**
     * Test
     * @param args
     */
    public static void main(String[] args) {
        KadaneAlgorithm la = new KadaneAlgorithm();
        int a[] = {-1,1,2,-3,3,-1,2,-2};
        int max_sum = la.maxSubArraySum(a);
        System.out.println("Maximum contiguous sum is \n" + max_sum);
    }
}