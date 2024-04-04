package vanshmaheshi;

import java.util.Scanner;

public class week11 {
	
	private Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int goodCount = 0;
		int badCount = 0;
		int totalCount = 0;
		
		do {
			
			System.out.print("Enter the bag size (1 for Regulae, 2 for Large)");
			int sizeCode = scanner.nextInt();
			String size = getSizeFromCode(sizeCode);
			
			
			if (!isValidBagSize(size)) {
				System.out.println("Error: Incorrect chip bag size. Please enter a valid size.");
				continue;
			}
			
			
			System.out.print("Enter the weight of the bag (in ounces): ");
			double weight = scanner.nextDouble();
			
			
			if (isGoodBag(size, weight)) {
				System.out.println("Good bag!");
				goodCount++;
			} else {
				System.out.println("Bad bag!");
				badCount++;
			}
			
			
			totalCount++;
			
			
			System.out.println("Good bags: " + goodCount);
			System.out.println("Bad bags: " + badCount);
			System.out.println("Total bags: " + totalCount);
			
			
			System.out.print("Do you have more data? (YES/NO): ");
			scanner.nextLine();
		} while (scanner.nextLine().equalsIgnoreCase("YES"));
		
		
		scanner.close();
	}
	
	
	private static String getSizeFromCode(int code) {
		return (code == 1) ?"Regular" : (code == 2) ? "Large" : "Unknown";
	}
	
	
	private static boolean isValidBagSize(String size) {
		return size.equalsIgnoreCase("Regular") || size.equalsIgnoreCase("Large");
	}
	
	
	private static boolean isGoodBag(String size, double weight) {
		double expectedWeight = size.equalsIgnoreCase("Regular") ? 9.25 : 15.75;
		double allowableDifference = 0.01;
		
		return Math.abs(weight - expectedWeight) <= allowableDifference;
	}

			
			
		
		

	}


