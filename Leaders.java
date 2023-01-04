import java.util.*;

public class Leaders{

    static void printLeaders(int a[], int n){

        int max = Integer.MIN_VALUE;

        int j = 0;
        int temp[] = new int[n];
        for(int i = n-1; i>= 0; i--){
            if(a[i] > max){
                max = a[i];
                temp[j++] = a[i];
                // System.out.print(a[i]+ " ");
            }
        }
        for(int i = n-1; i>= 0; i--){
            System.out.print(temp[i] + " ");
        }
    }
    public static void main(String args[]){

        int a[] = {2, 7, 6, 4, 1, 3};
        int n = a.length;

        printLeaders(a, n);
    }
}
