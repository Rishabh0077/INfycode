import java.util.*;
import java.io.*;
public class TeamDivision {
    public static int solve(int arr[],int n,int S1,int S2,int lenS1,int lenS2){
        if(n<0){
            if(Math.abs(lenS1-lenS2)>1){
                return Integer.MAX_VALUE;
            }
            return Math.abs(S1-S2);
        }
        return Math.min(solve(arr,n-1,S1,S2,lenS1,lenS2), solve(arr,n-1,S1+arr[n],S2-arr[n],lenS1+1,lenS2-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String st[]=s.split(",");
        int n=st.length;
        int t=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st[i]);
            t+=arr[i];
        }
        int min=solve(arr,n-1,0,t,0,n);
        System.out.println((int)(t/2f-min/2f) + " " + (int)(t/2f+min/2f));
    }
    
}
