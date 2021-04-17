import java.io.*;
import java.util.*;
public class sort012 {
    public static void s012(int arr[],int n){
         int l=0;
        int m=0;
        int h=n-1;
        int t=0;
        while(m<=h){
            if(arr[m]==0){
                t=arr[m];
                arr[m]=arr[l];
                arr[l]=t;
                l++;
                m++;
            }
            else if(arr[m]==1){
                m++;
            }
            else if(arr[m]==2){
                t=arr[m];
                arr[m]=arr[h];
                arr[h]=t;
                h--;
            }
        
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("--");
        s012(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
