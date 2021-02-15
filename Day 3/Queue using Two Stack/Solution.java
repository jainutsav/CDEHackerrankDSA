import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int n = scn.nextInt();
        scn.nextLine();
        for(int i=0;i<n;i++){
            String query = scn.nextLine();
            if(query.length()==1){
                if(query.matches("2")){
                    q.remove();
                }
                else if(query.matches("3")){
                    System.out.println(q.peek());
                }
            }
            else{
                String[] arr = query.split(" ");
                q.add(Integer.parseInt(arr[1]));
            }
        }
    }
}
