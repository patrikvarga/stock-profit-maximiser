# Stock Profit Maximiser

## Description

Suppose we could access yesterday's stock prices as a list, where:

* The indices are the time in minutes past trade opening time, which was 10:00am local time.
* The values are the price in dollars of the stock at that time.
* So if the stock cost $5 at 11:00am, `stock_prices_yesterday[60] = 5`.

Write an efficient function that takes an array of stock prices
and returns the best profit could have been made from 1 purchase and 1 sale of 1 stock.

For example:

```
int[] stockPrices = {10, 7, 5, 8, 11, 9};

Assert.assertEquals (6, getMaxProfit(stockPrices)); // returns 6 (buy at $5 sell at $11)
```

You must buy before you sell
You may not buy and sell in the same time step (at least 1 minute must pass).

## Usage

Run the JUnit test suite in your favourite tool or use `mvn test` when using Maven.

## Considerations

The project was implemented in a BDD/TDD/test-first manner,
incrementally approaching the final solution by fulfilling requirements and adhering constraints gradually.

Meanwhile, I managed to keep the complexity O(n) all the way.

Main aspects:

* Keeping the implementation as lean as possible
* Keeping the code as clean (readable, easy to change, etc.) as possible
* Javadoc where appropriate, otherwise the test suite is the documentation
* Maximise test overage (for a timeboxed exercise)
* Prices are integers as per the example
