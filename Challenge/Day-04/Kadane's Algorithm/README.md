# Kadane's Algorithm

## Problem
Given an integer array, find the contiguous subarray with the maximum sum.

Example

Input:
[-2,1,-3,4,-1,2,1,-5,4]

Output:
6

Explanation:
Subarray [4,-1,2,1] gives maximum sum = 6.

---

## Approach

Use Kadane's Algorithm.

At every index:
1. Either start a new subarray
2. Or extend the existing subarray

currSum = max(arr[i], currSum + arr[i])

Track the maximum value encountered.


## Complexity

Time: O(n)  
Space: O(1)
