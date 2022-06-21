import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ifElse {

    /*
    public static void main(String[]args){

            Scanner scanner = new Scanner(System.in);
                    System.out.println("insira o número");
                int N = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                if (N%2!=0)System.out.println("Weird");
                 else if(N>=2&&N<=5) System.out.println("Not Weird");
                 else if (N>=6&&N<=20) System.out.println("Weird");
                 else System.out.println("Not Weird");

                }

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        String s = new String();
        double d = scan.nextDouble();
        scan.nextLine();
        s = scan.nextLine();



        scan.close();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
            }}




