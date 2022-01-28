package xyz;

public class Searching {

	
	public int searchStock(double[] stock, int noOfCompanies, double key) {
		for (int i = 0; i < noOfCompanies; i++) {
			if (stock[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
