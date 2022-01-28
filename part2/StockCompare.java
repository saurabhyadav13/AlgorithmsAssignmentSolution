package xyz;

public class StockCompare {

	
	public void stockRose(boolean[] stockCmp, int length) {

		int count = 0;
		for (int i = 0; i < length; i++) {
			if (stockCmp[i] == true) {
				count++;
			}
		}
		System.out.println("Total no of companies whose stock price rose today : " + count);

	}

	
	public void stockDecline(boolean[] stockCmp, int length) {

		int count = 0;
		for (int i = 0; i < length; i++) {
			if (stockCmp[i] == false) {
				count++;
			}
		}
		System.out.println("Total no of companies whose stock price declined today : " + count);

	}

}
