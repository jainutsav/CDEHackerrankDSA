import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
         char[] ch = s.toCharArray();
         String res="";
         if(ch[ch.length-2]=='A'){
             if(ch[0]=='1' && ch[1]=='2'){
                 res = "00";
                 for(int i=2;i<8;i++)
                    res += ch[i];
             }
             else{
                 for(int i=0;i<8;i++)
                    res += ch[i];
             }
         }
         else{
             if(ch[0]=='1' && ch[1]=='2'){
                 for(int i=0;i<8;i++)
                    res += ch[i];
             }
             else{
                 res += (Character.getNumericValue(ch[0]) + 1);
                 res += (Character.getNumericValue(ch[1]) + 2);
                 for(int i=2;i<8;i++)
                    res += ch[i];
             }
         }
        return res;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
