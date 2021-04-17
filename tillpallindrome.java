import java.util.*;
public class tillpallindrome {
    public static int reverse(int n){
        StringBuilder s=new StringBuilder(Integer.toString(n));
        s.reverse();
        return Integer.parseInt(s.toString());
    }
    public static boolean ispalindrom(int n){
        return n==reverse(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
       
        while(true){
            n=n+reverse(n);
            if(ispalindrom(n)){
                System.out.println(n);
                break;
            }
        }
        
    }
    
}
