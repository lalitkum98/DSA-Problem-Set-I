package ProblemSetI;

public class StockMaxProfit {

	// Case first : buy once sell one find maxprofit
	public void MaxProfitBuySellOnce(int arr[]) {

		int min = arr[0];
		int max = arr[0], profit = 0, diff = 0;
		int buy = 0, sell = 0;

		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {

				diff = max - min;
				if (diff > profit) {
					buy = min;
					sell = max;
					profit = diff;
				}
				min = arr[i];
				max = arr[i];
			} else if (max < arr[i]) {
				max = arr[i];
			}

		}
		diff = max - min;
		if (diff > profit) {
			buy = min;
			sell = max;
			profit = diff;
		}
		System.out.println("Max Profit : " + profit + " when we buy at : "
				+ buy + " and sell at : " + sell);

	}

	// Case first : buy once sell one find maxprofit
	public void MaxProfitBuySellMulti(int arr[]) {

		int min = arr[0];
		int max = arr[0], profit = 0, diff = 0;
		int buy = 0, sell = 0;

		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {

				diff = max - min;
				profit = profit + diff;
				min = arr[i];
				max = arr[i];
			} else if (max < arr[i]) {
				max = arr[i];
			}

		}
		diff = max - min;
		profit = profit + diff;
		System.out.println("Max Profit when buy and sell multi : " + profit);
	}

	public static void main(String arrr[]) {
		int arr[] = { 100, 180, 150, 200, 210, 90, 50, 100, 80, 200 };
		StockMaxProfit mp = new StockMaxProfit();
		mp.MaxProfitBuySellOnce(arr);
		mp.MaxProfitBuySellMulti(arr);

	}
}
