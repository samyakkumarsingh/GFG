# Smallest Positive Missing Number

## Problem

Find the smallest positive integer missing from the array.

Example

Input:
[3,4,-1,1]

Output:
2

---

## Approach

Place each number at its correct index.

Number x should be at index x-1.

After rearranging:

First index where arr[i] != i+1 is the answer.

---

## Complexity

Time: O(n)  
Space: O(1)
