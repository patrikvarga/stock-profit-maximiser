package com.patrikvarga.stockprofit;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

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
        int maxPrice = 0;

        for (int i = 0; i < stockPrices.length; i++) {
            int currentPrice = stockPrices[i];
            minPrice = min(currentPrice, minPrice);
            maxPrice = max(currentPrice, maxPrice);
        }

        return maxPrice - minPrice;
    }

}
