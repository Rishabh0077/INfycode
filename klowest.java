import java.io.*;
import java.util.*;
class km {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		int a[]=new int[t];
                for(int i=0;i<t;i++){
                    a[i]=sc.nextInt();
                }
                int k=sc.nextInt();
                 PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    for (int i = 0; i < t; i++) {
      maxHeap.add(a[i]);
      if (maxHeap.size() > k) {
        maxHeap.poll();
      }
    }
            System.out.println(maxHeap.peek());
		
	}
}
// } Driver Code Ends
