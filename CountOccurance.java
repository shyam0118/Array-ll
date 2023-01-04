import java.util.*;

public class CountOccurance{

    static void solution(int a[], int n){

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(map.containsKey(a[i])){
                map.put(a[i] , map.get(a[i]) + 1);
            }else{
                map.put(a[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
    public static void main(String args[]){
        
        int a[] = {1, 1, 1, 3, 3, 5, 5, 6};
        int n = a.length;

        solution(a, n);
    }
}