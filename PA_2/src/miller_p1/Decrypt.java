package miller_p1;

import java.util.Scanner;
public class Decrypt {

	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);

		 System.out.print("Enter a 4 digit integer to decrypt: ");
		 String raw_value = in.next();

		 int d1 = Integer.parseInt(raw_value.substring(0, 1));
		 int d2 = Integer.parseInt(raw_value.substring(1, 2));
		 int d3 = Integer.parseInt(raw_value.substring(2, 3));
		 int d4 = Integer.parseInt(raw_value.substring(3, 4));
		 int e1 = d3;
		 int e2 = d4;
		 int e3 = d1;
		 int e4 = d2;

		 e1 = (e1 + 3) % 10;
		 e2 = (e2 + 3) % 10;
		 e3 = (e3 + 3) % 10;
		 e4 = (e4 + 3) % 10;

		 System.out.printf("The decrypted integer is: %d%d%d%d", e1, e2, e3, e4);
		 }

		 }

