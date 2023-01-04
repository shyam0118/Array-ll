import java.util.*;

public class MoveZeros{

    static void solution(int a[], int n){

        int  i = 0;
        int j = n-1;

        while(i < j){
            if(a[i] != 0){
                i++;
            }
            else if(a[j] == 0){
                j--;
            }else{
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        for( int x : a){
            System.out.print(x +  " ");
        }

    }
    public static void main(String args[]){

        int a[] = {3, 0, 5, 1, 0, 0, 3, 5};
        int n = a.length;

        solution(a, n);

    }
    
}