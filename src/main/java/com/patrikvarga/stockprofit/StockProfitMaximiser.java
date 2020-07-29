package com.patrikvarga.stockprofit;

/**
 * Takes an array of stock prices and returns the best profit could have been made from 1 purchase and 1 sale of 1
 * stock.
 *
 * @author Patrik Varga
 */
public class StockProfitMaximiser {

    /**
     * Takes an array of stock prices and returns the best profit could have been made from 1 purchase and 1 sale of 1
     * stock.
     *
     * @param stockPrices array of stock prices
     * @return the best profit
     */
    public static int getMaxProfit(int[] stockPrices) {
        validateSeries(stockPrices);

        int minPrice = Integer.MAX_VALUE;
        int minIndex = 0;
        int maxPrice = 0;
        int maxIndex = Integer.MAX_VALUE;

        for (int i = 0; i < stockPrices.length; i++) {
            int currentPrice = stockPrices[i];
            validatePrice(currentPrice);

            if (currentPrice < minPrice && i < maxIndex) {
                minPrice = currentPrice;
                minIndex = i;
            }
            if (currentPrice > maxPrice && i > minIndex) {
                maxPrice = currentPrice;
                maxIndex = i;
            }
        }

        return maxPrice - minPrice;
    }

    private static void validatePrice(int currentPrice) throws IllegalArgumentException {
        if (currentPrice < 1) {
            throw new IllegalArgumentException("Only positive prices are supported");
        }
    }

    private static void validateSeries(int[] stockPrices) throws IllegalArgumentException {
        if (stockPrices.length < 2) {
            throw new IllegalArgumentException("Minimum two elements are needed");
        }
    }

}
