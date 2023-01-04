import java.util.*;

public class MinimumSubarraySum{

    static int solution(int a[], int n){
        int minSum = Integer.MAX_VALUE;

        int curr = Integer.MAX_VALUE;

        for(int i = 0; i<n; i++){
            if(curr > 0){
                curr = a[i];
            }else{
                curr += a[i];
            }
            minSum = Math.min(minSum, curr);
        }
        return minSum;
    }
    public static void main(String args[]){

        int a[] = {3, -4, 2, -3, -1, 7, -5};
        int n = a.length;

        int ans = solution(a, n);

        System.out.println(ans);
    }
}