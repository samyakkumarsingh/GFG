# Reverse an Array

## Problem
Given an array of integers, reverse the array **in-place**.

The first element becomes the last, the second becomes the second last, and so on.

## Example

Input

[1,2,3,4,5]


Output

[5,4,3,2,1]


## Approach

Use the **two-pointer technique**.

1. Initialize `i` at the beginning and `j` at the end of the array.
2. Swap `arr[i]` and `arr[j]`.
3. Move `i` forward and `j` backward.
4. Continue until `i >= j`.

## Complexity

Time Complexity: O(n)  
Space Complexity: O(1)
