package miller_p3;

import java.util.Scanner;
public class Polling {

	 public static void main(String[] args) {
		 String[] topics = {"Salary", "Retirement", "Healthcare", "Work/Life Balance",
		"Diversity"};
		 int[][] results = new int[topics.length][10];

		 Scanner in = new Scanner(System.in);

		 int rating = 0;
		 String shouldContinue = "y";
		 while(shouldContinue.equalsIgnoreCase("y")) {
		 for(int topicId = 0; topicId < topics.length; topicId++) {
		 System.out.println("On a scale of 1 to 10 (integers only), please rate the importance of " + topics[topicId]);
		 rating = in.nextInt() - 1; 
		 results[topicId][rating]++;
		 }

		 in.nextLine();

		 System.out.println("Would you like to continue polling?");
		 shouldContinue = in.next();

		 in.nextLine();
		 }

		 System.out.print(" ");
		 for(rating = 0; rating < results[0].length; rating++) {
		 System.out.printf("%4d", rating + 1);
		 }
		 System.out.println(" | Avg");
		 System.out.println("----------------------------------------------------------------------");
		 double sum;
		 double ratingCount;
		 for(int topicId = 0; topicId < topics.length; topicId++) {
		 System.out.printf("%20s", topics[topicId]);
		 for(rating = 0; rating < results[topicId].length; rating++) {
		 System.out.printf("%4d", results[topicId][rating]);
		 }
		 sum = 0;
		 ratingCount = 0;
		 for(rating = 0; rating < results[topicId].length; rating++) {

		 if(results[topicId][rating] > 0) {
		 sum += (rating + 1) * results[topicId][rating];
		 ratingCount++;
		 }
		 }
		 System.out.printf(" |%6.2f", sum / ratingCount);
		 System.out.println();
		 }

		 int[] pointValues = new int[topics.length];
		 for(int topicId = 0; topicId < topics.length; topicId++) {
		 for(rating = 0; rating < results[topicId].length; rating++) {
		 pointValues[topicId] += (rating + 1) * results[topicId][rating];
		 }
		 }

		 System.out.println();
		 int minTopic = 0;
		 int maxTopic = 0;
		 for(int i = 0; i < pointValues.length; i++) {
		 if(pointValues[i] > pointValues[maxTopic]) {
		 maxTopic = i;
		 }

		 if(pointValues[i] < pointValues[minTopic]) {
		 minTopic = i;
		 }
		 }

		 System.out.println("The topic with the most points is " + topics[maxTopic]);
		 System.out.println("The topic with the least points is " + topics[minTopic]);
		 }

		 }
