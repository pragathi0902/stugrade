package stugrade;
import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
	        int[] marks = new int[5];
	        int total = 0;

	        for (int i = 0; i < 5; i++) {
	            System.out.println("Enter mark " + (i + 1) + ":");
	            marks[i] = sc.nextInt();
	            total += marks[i];
	        }

	        float percentage = (total / 500.0f) * 100;
	        System.out.println("Total: " + total);
	        System.out.println("Percentage: " + percentage);

	        if (percentage > 90 && percentage <= 100) {
	            System.out.println("Grade:A+");
	        } else if (percentage > 80 && percentage <= 90) {
	            System.out.println("Grade:B+");
	        } else if (percentage > 70 && percentage <= 80) {
	            System.out.println("Grade:C+");
	        } else if (percentage > 60 && percentage <= 70) {
	            System.out.println("PASS");
	        } else {
	            System.out.println("FAIL");
	        }

	        sc.close();
	}

}
