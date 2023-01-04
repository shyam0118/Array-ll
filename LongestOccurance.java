import java.util.*;

public class LongestOccurance{

    static int solution(int a[], int n){

        int max = 0;
        int count = 0;
        for(int i = 0; i<n; i++){
            if(a[i] == 0){
                count = 0;
            }else{
                count++;
                max = Math.max(max, count);
            }
        }
        return max;

    }
    public static void main(String args[]){

        int a[] = {1, 0, 1, 1, 1, 1, 1, 1, 0, 0};
        int n = a.length;

        int ans = solution(a, n);
        System.out.println(ans);


    }
}