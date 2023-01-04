import java.util.*;

public class ContainerWithMaxmWater {

    static int solution(int a[], int n){
        int curr = 0;
        int max = Integer.MIN_VALUE;

        int i = 0;
        int j = n-1;

        while(i < j){
            curr = (Math.min(a[i], a[j]) * (j - i));
            if(curr > max){
                max = curr;
            }
            if(a[i] > a[j]){
                j--;
            }else if(a[i]< a[j]){
                i++;
            }else{
                i++;
            }
        }
        return max;
    }
    public static void main(String args[]){
        int a[] = {5, 4, 6, 5, 2, 1, 5};
        int n = a.length;

        int ans = solution(a, n);
        System.out.println(ans);
    }
}
