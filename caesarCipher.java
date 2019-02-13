import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.lang.*;

public class caesarCipher{

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
       String result = " ";
   
for(int i=0; i<s.length();i++) {
  //  if(isupper(s[i]))
  if(Character.isUpperCase(s.charAt(i)))
     result += (char)(((int)s.charAt(i) + k-65)% 26 + 65);

else if(Character.isLowerCase(s.charAt(i)))
result += (char)(((int)s.charAt(i) + k-97)% 26 +97); 

else
//result +=(char)((int)s.charAt(i));
 //result=(int)s.charAt(i);
//result +=char;
//result += i;
//return s[i];
//result = result;

  //if(s.charAt(i)==s.charAt(i))
                result += s.charAt(i);               
}
return result;
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
