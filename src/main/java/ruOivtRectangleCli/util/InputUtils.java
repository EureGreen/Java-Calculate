package ruOivtRectangleCli.util;
import java.util.InputMismatchException;
import java.util.Scanner;



public class InputUtils {
	
	public static double readPositiveDouble(Scanner sc, String prompt) {
		
	    while (true) {
	        System.out.print(prompt);
	        String line = sc.nextLine().trim();

	        if (line.isEmpty()) {
	            System.out.println("Error: input cannot be empty. Enter a positive number:");
	            continue;
	        }

	        try {
	            double value = Double.parseDouble(line.replace(',', '.'));
	            if (value > 0) {
	                return value;
	                
	            } else {
	                System.out.println("Error: number must be positive. Try again: ");
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("Error: invalid format. Enter a valid number (2, 10, 3.14): ");
	        }
	    }
	}
	 public static int readInt(Scanner sc, String prompt) {
		 
	        while (true) {
	            System.out.print(prompt);
	            String line = sc.nextLine().trim();

	            if (line.isEmpty()) {
	                System.out.println("Error: input is empty, try again.");
	                continue;
	            }

	            try {
	                return Integer.parseInt(line);
	            } catch (NumberFormatException e) {
	                System.out.println("Error: '" + line + "' Not a number try again.");
	            }
	        }
	    }
	
	
	 public static void pause(Scanner sc) {
	        System.out.print("press Enter, to continue...");
	        sc.nextLine();
	    }
 

}
