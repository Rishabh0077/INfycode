import java.util.*;
public class zeromatrix {
    public static void  setZero(int m[][],int n){
        boolean zr[] = new boolean[n];
        boolean zc[] = new boolean[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(m[i][j]==0){
                    zr[i]=true;
                    zc[j]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(zr[i]){
                for(int col=0;col<n;col++){
                    m[i][col]=0;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(zc[i]){
                for(int row=0;row<n;row++){
                    m[row][i]=0;
                }
            }
        }
        //return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("--");
        setZero(arr,n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
