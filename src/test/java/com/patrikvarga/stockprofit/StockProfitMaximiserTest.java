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

    @Test
    public void makeSureItIsNotFake() {
        int[] stockPrices = {10, 7, 5, 8, 15, 9};
        assertEquals(10, getMaxProfit(stockPrices));
    }

    @Test
    public void youMustBuyBeforeYouSell() {
        int[] stockPrices = {105, 7, 5, 8, 11, 9};
        assertEquals(6, getMaxProfit(stockPrices));
    }

    @Test
    public void youMustSellAfterYouBuy() {
        int[] stockPrices = {10, 7, 5, 8, 11, 1};
        assertEquals(6, getMaxProfit(stockPrices));
    }

    @Test(expected = IllegalArgumentException.class)
    public void youMayNotBuyAndSellInTheSameStep() {
        int[] stockPrices = {1};
        getMaxProfit(stockPrices);
    }

}
