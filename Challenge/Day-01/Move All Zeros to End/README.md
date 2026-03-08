# Move All Zeros to End

## Problem
Given an array of integers, move all `0`s to the end of the array while maintaining the relative order of non-zero elements.

The operation must be performed **in-place** without using extra space.

## Example

Input

[0,1,0,3,12]


Output

[1,3,12,0,0]


## Approach

Use the **two-pointer technique**.

- `i` keeps track of the position where the next non-zero element should be placed.
- Traverse the array using `j`.

If a non-zero element is found, swap `nums[i]` and `nums[j]` and increment `i`.

## Complexity

Time Complexity: O(n)  
Space Complexity: O(1)
