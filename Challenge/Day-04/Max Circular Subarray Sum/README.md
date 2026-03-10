# Max Circular Subarray Sum

## Problem

Find the maximum possible sum of a circular subarray.

Circular means the end of the array connects to the beginning.

Example

Input:
[5,-3,5]

Output:
10

Explanation:
Circular subarray [5,5] gives sum 10.

---

## Approach

Two cases exist.

Case 1:
Normal maximum subarray → Kadane

Case 2:
Circular case

CircularSum = TotalSum - MinimumSubarray

Final answer:
max(NormalMax, CircularSum)

Edge case:
If all elements are negative return normal max.

---

## Complexity

Time: O(n)  
Space: O(1)
