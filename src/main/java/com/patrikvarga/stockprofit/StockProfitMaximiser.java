package com.patrikvarga.stockprofit;

import static java.lang.Integer.max;

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
        int minPrice = Integer.MAX_VALUE;
        int minIndex = 0;
        int maxPrice = 0;

        for (int i = 0; i < stockPrices.length; i++) {
            int currentPrice = stockPrices[i];
            if (currentPrice < minPrice) {
                minPrice = currentPrice;
                minIndex = i;
            }
            maxPrice = max(currentPrice, maxPrice);
        }

        return maxPrice - minPrice;
    }

}
