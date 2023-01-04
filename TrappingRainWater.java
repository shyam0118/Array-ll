import java.util.*;

public class TrappingRainWater {

    static int trappingWater(int a[], int n){

        int left = 0;
        int right = n-1;

        int totalWater = 0;

        int leftMax = 0;
        int rightMax = 0;

        while(left < right){
            if(a[left] < a[right]){
                if(a[left] > leftMax){
                    leftMax = a[left];
                }else{
                    totalWater += leftMax - a[left];
                }
                left++;
            }else{
                if(a[right] > rightMax){
                    rightMax = a[right];
                }else{
                    totalWater += rightMax - a[right];
                }
                right--;
            }
            
        }
        return totalWater;
    }
    public static void main(String args[]){

        int a[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = a.length;

        int ans = trappingWater(a, n);
        System.out.println(ans);
    }
}
