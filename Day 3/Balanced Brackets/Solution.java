import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        List<Character> res = new ArrayList<>();
        int index=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='('){
                res.add(s.charAt(i));
                index++;
            }
            else {
                if(res.isEmpty()) return "NO";
                if(s.charAt(i)==']'){
                    if(res.get(index-1)=='['){
                        res.remove(index-1);
                        index--;
                        continue;
                    }
                    else return "NO";
                }
                else if(s.charAt(i)=='}'){
                    if(res.get(index-1)=='{'){
                        res.remove(index-1);
                        index--;
                        continue;
                    }
                    else return "NO";
                }
                else if(s.charAt(i)==')'){
                    if(res.get(index-1)=='('){
                        res.remove(index-1);
                        index--;
                        continue;
                    }
                    else return "NO";
                }
            }
        }
        if(res.isEmpty()) return "YES";
        return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
