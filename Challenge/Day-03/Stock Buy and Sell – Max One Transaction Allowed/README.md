# Stock Buy and Sell – Max One Transaction Allowed

## Problem
Given an array `prices[]` representing stock prices.

You can perform **only one transaction**:
1 Buy + 1 Sell.

Return the maximum profit possible.

Example:

Input:
[7,10,1,3,6,9,2]

Output:
8

Explanation:
Buy at price 1  
Sell at price 9  
Profit = 8

---

## Approach

Keep track of:

1. Minimum price seen so far
2. Maximum profit possible

For each price:
profit = currentPrice - minPrice

Update maxProfit if larger.

---

## Complexity

Time: O(n)  
Space: O(1)
