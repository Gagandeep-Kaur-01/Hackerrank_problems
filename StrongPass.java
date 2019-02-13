import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrongPass {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
         int loc = 0, upc = 0,no = 0,sc= 0;
 int sum = 0;
        // Return the minimum number of characters to make the password strong
//String numbers = "0123456789";
//String lower_case = "abcdefghijklmnopqrstuvwxyz";
//String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//String special_characters = "!@#$%^&*()-+";
String lowercase = ".*[a-z]+.*";
String uppercase = ".*[A-Z]+.*";
String num = ".*[0-9]+.*";
 String specialchar = ".*[-!@#$%^&*()+]+.*"; 



 if(!(password.matches(lowercase)))
 loc++;
  if(!(password.matches(uppercase)))
 upc++;
  if(!(password.matches(num)))
 no++;
  if(!(password.matches(specialchar)))
 sc++;

 sum=loc+upc+no+sc;
 return (sum>(6-n))? sum:(6-n);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
