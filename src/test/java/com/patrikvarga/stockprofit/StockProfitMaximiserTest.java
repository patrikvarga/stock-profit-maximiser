package com.patrikvarga.stockprofit;

import static com.patrikvarga.stockprofit.StockProfitMaximiser.getMaxProfit;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StockProfitMaximiserTest {

    /**
     * This is the example from the description. Checks if the solution returns 6 (buy at $5 sell at $11).
     */
    @Test
    public void exampleFromDescription() {
        int[] stockPrices = {10, 7, 5, 8, 11, 9};
        assertEquals(6, getMaxProfit(stockPrices));
    }
}