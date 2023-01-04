import java.util.*;

public class StockBuySell {

    static int stockBuy(int a[], int n){
        int maxProfit = 0;
        int min = a[0];
        for(int i = 0; i<n; i++){
            min = Math.min(min, a[i]);
            int profit = a[i] - min;

            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int a[] = {7,1,5,3,6,4};
        int n = a.length;

        int ans = stockBuy(a, n);
        System.out.println(ans);
    }
}
