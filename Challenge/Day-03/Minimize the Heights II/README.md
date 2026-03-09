# Minimize the Heights II

## Problem

Given an array representing heights of towers and an integer k.

For each tower you must either:

Increase height by k  
or  
Decrease height by k

Goal:
Minimize the difference between tallest and shortest tower.

Example:

Input:
k = 2
arr = [1,5,8,10]

Output:
5

Explanation:

Modified heights:
[3,3,6,8]

Difference:
8 - 3 = 5

---

## Approach

1. Sort the array
2. Calculate initial difference
3. Modify smallest and largest
4. Try partitioning the array
5. Track minimum difference

---

## Complexity

Time: O(n log n)  
Space: O(1)
