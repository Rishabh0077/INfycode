import java.util.*;
public class reverse {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
      HashMap<Character,Integer>hm=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)+1);
            }
            else
                hm.put(ch,1);
        }
        int odd=0;
        int even=0;
        for(Character ch: hm.keySet())
        {
            if(hm.get(ch)%2==0)
                ++even;
            else
                ++odd;
        }
        if (odd == 0 || odd == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        StringBuilder sb2=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        char chx='*';
        for(Character ch: hm.keySet())
        {
           int c = hm.get(ch);
           if(c%2!=0)
           {
              chx=ch;
           }
           int x =c/2;
            for (int i = 0; i < x; i++) {
                sb1.append(ch);
                sb2.append(ch);
            }
            //hm.put(ch,hm.get(ch)-x*2);
        }
        if (chx == '*')
            System.out.println(sb1.toString() + sb2.reverse());
        else {
            System.out.println(sb1.toString()+chx+sb2.reverse());
        }
        
    }
    
}
