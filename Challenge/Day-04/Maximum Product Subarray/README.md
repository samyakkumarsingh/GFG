# Maximum Product Subarray

## Problem

Find the contiguous subarray that has the largest product.

Example

Input:
[2,3,-2,4]

Output:
6

Explanation:
Subarray [2,3] gives maximum product.

---

## Approach

Track both:

max product  
min product

Because multiplying by a negative number swaps them.

If nums[i] < 0 → swap max and min.

Update:

max = max(nums[i], max * nums[i])
min = min(nums[i], min * nums[i])

---

## Complexity

Time: O(n)  
Space: O(1)
