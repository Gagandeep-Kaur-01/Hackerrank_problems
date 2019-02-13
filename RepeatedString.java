import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeated String function below.
    static long repeatedString(String s, long n) {
int count = 0;
for(int i=0; i<s.length(); i++) {
if (s.charAt(i) == 'a')
    
count++;
}

long count1 = 0;
//int n = inp.nextInt();

for(int j=0; j<(n% s.length()); j++) {
if (s.charAt(j)== 'a')
count1++;    
}
long count2;
count2 = count*(n/s.length())+ count1;
System.out.println(count2);
return count2;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
