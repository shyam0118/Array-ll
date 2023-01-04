import java.util.*;

public class MaxmSumSubArray {

    static int maxSumSubArray(int a[], int n){
        int maxSum = 0;
        int sum = 0;

        for(int i = 0; i<n; i++){
            sum += a[i];
            maxSum = Math.max(maxSum, sum);

            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String args[]){
        int a[] =  {-2,1,-3,4,-1,2,1,-5,4};
        int n = a.length;

        int ans = maxSumSubArray(a, n);
        System.out.print(ans);
    }
}
