package miller_p1;

import java.util.Scanner;
public class Encrypt {



 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);

 System.out.print("Enter a 4 digit integer to encrypt: ");
 String raw_value = in.next();

 int d1 = Integer.parseInt(raw_value.substring(0, 1));
 int d2 = Integer.parseInt(raw_value.substring(1, 2));
 int d3 = Integer.parseInt(raw_value.substring(2, 3));
 int d4 = Integer.parseInt(raw_value.substring(3, 4));


 d1 = (d1 + 7) % 10;
 d2 = (d2 + 7) % 10;
 d3 = (d3 + 7) % 10;
 d4 = (d4 + 7) % 10;

 int e1 = d3;
 int e2 = d4;
 int e3 = d1;
 int e4 = d2;

 System.out.printf("The encrypted integer is: %d%d%d%d", e1, e2, e3, e4);
 }
 }