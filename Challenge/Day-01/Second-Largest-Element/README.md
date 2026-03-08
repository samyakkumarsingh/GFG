# Second Largest Element in an Array

## Problem
Given an array of integers, find the **second largest element** in the array.

The solution should be efficient and should not rely on sorting.

## Example

Input

[4, 1, 7, 3, 9, 5]


Output

7


## Approach

We traverse the array once while maintaining two variables:

- `largest`
- `secondLargest`

Steps:

1. If the current element is greater than `largest`, update both variables.
2. If the current element is smaller than `largest` but greater than `secondLargest`, update `secondLargest`.

This avoids sorting and solves the problem in one pass.

## Complexity

Time Complexity: O(n)  
Space Complexity: O(1)
