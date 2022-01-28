package com.xyz;

import service.*;
import java.util.Scanner;

public class DriverClass { 
	public static void main(String[] args) {

		
		Sorting sort = new Sorting();
		StockCompare compare = new StockCompare();
		Searching search = new Searching();
		Scanner scanner = new Scanner(System.in);

		
		System.out.println("Enter the number of companies");
		int NoOfCompanies = scanner.nextInt();

		
		double stock[] = new double[NoOfCompanies];
		boolean stockCmp[] = new boolean[NoOfCompanies];

		
		for (int i = 0; i < NoOfCompanies; i++) {
			System.out.println("Enter current stock price of the company " + (i + 1));
			stock[i] = scanner.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday? ");
			stockCmp[i] = scanner.nextBoolean();
		}

		int choice; 

		do { 

			System.out.println("\nEnter the operation that you want to perform\n"
					+ "1. Display the companies stock prices in ascending order\n"

					+ "2. Display the companies stock prices in descending order\n"
					+ "3. Display the total no of companies for which stock prices rose today\n"

					+ "4. Display the total no of companies for which stock prices declined today\n"
					+ "5. Search a specific stock price\n" + "6. press 0 or 6 to exit\n");

			System.out.println();
			choice = scanner.nextInt();
			switch (choice) {
			case 0: 
				choice = 0;
				break;
			case 1: 
				sort.mergeSortAscending(stock, 0, stock.length - 1);
				System.out.println("Stock prices in ascending order are :");
				for (double x : stock) {
					System.out.print(x + " ");
				}
				System.out.println();
				break;
			case 2: 
				sort.mergeSortDescending(stock, 0, stock.length - 1);
				System.out.println("Stock prices in descending order are :");
				for (double x : stock) {
					System.out.print(x + " ");
				}
				System.out.println();
				break;
			case 3: 
				compare.stockRose(stockCmp, NoOfCompanies);
				break;
			case 4: 
				compare.stockDecline(stockCmp, NoOfCompanies);
				break;
			case 5: 
				System.out.println("enter the key: ");
				double key = scanner.nextDouble();
				int position = search.searchStock(stock, NoOfCompanies, key);
				if (position == -1) {
					System.out.println("Stock of value " + key + " is not present");
				} else {
					System.out.println("Stock of value " + key + " is present");
				}
				break;
			case 6:
				choice = 0;
				break;
			default:
				System.out.println("Please enter the number from given options");

			}
		} while (choice != 0);
		System.out.println("Exited Successfully!!!");

		scanner.close();

	}
}
