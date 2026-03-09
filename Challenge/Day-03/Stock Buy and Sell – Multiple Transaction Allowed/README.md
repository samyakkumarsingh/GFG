# Stock Buy and Sell – Multiple Transaction Allowed

## Problem
You are given an array `prices[]` where `prices[i]` represents the price of a stock on day i.

You can:
- Buy and sell multiple times
- But you must sell before buying again.

Return the **maximum profit** possible.

Example:
Input:
[100,180,260,310,40,535,695]

Output:
865

Explanation:
Buy at 100 → Sell at 310 → Profit = 210  
Buy at 40 → Sell at 695 → Profit = 655  

Total Profit = 865

---

## Approach
Instead of finding exact buy/sell days, capture every increasing difference.

If:
price[i] > price[i-1]

Then profit = price[i] - price[i-1]

Add all such profits.

---

## Complexity
Time: O(n)  
Space: O(1)
