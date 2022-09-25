package rev;

public class StockMaxProfitSingleStock {
	static void findStockProfit(int [] arr) {
		int profit=0;
		int currentMin = arr[0];
		int result = 0;
		for (int i : arr) {
			currentMin = Math.min(currentMin, i);
			profit = i - currentMin;
			result = Math.max(profit, result);
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		int [] arr = {2,3,7,4,5,8};
		findStockProfit(arr);
	}
}
