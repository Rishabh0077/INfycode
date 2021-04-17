import java.io.*;
import java.util.*;
public class km2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        PriorityQueue<Integer>minheap=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            minheap.add(arr[i]);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        while(minheap.size()>0){
            System.out.print(minheap.peek() + " ");
            minheap.poll();
        }
        
    }
}
