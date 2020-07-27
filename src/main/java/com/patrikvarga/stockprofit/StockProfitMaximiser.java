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
        if (stockPrices.length < 2) {
            throw new IllegalArgumentException("Single element array is not allowed");
        }

        int minPrice = Integer.MAX_VALUE;
        int minIndex = 0;
        int maxPrice = 0;
        int maxIndex = Integer.MAX_VALUE;

        for (int i = 0; i < stockPrices.length; i++) {
            int currentPrice = stockPrices[i];
            if (currentPrice < 1) {
                throw new IllegalArgumentException("Only positive prices are supported");
            }
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

}
