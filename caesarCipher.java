import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.lang.*;

public class Solution {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
char value[] = s.toCharArray();  // split character os a string and stores it into an array
k = k%26;

for(int i=0;i<s.length(); i++) {
    if(value[i] >=65 && value[i]<=90)
    {
if(value[i]+k>90)
value[i]= (char)(value[i]+k-26);
else
value[i]=(char)(value[i]+k);
    }
    else if(value[i] >=97 && value[i]<=122)
    {
    if(value[i]+k>122)
value[i]= (char)(value[i]+k-26);
else
value[i]=(char)(value[i]+k);    
    }
    else
    value[i] = value[i];
} 
return String.valueOf(value);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
