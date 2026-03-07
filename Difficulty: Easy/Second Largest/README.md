Problem

Given an array of integers, find the second largest element in the array.
The solution should work efficiently without sorting the array.

Approach

The idea is to traverse the array once while maintaining two variables:

largest → stores the largest element found so far

secondLargest → stores the second largest element

Steps:

Initialize largest and secondLargest.

Traverse the array.

If the current element is greater than largest:

Update secondLargest to largest

Update largest to the current element

If the current element is smaller than largest but greater than secondLargest, update secondLargest.

After the traversal, secondLargest contains the answer.

Time Complexity

O(n)

Space Complexity

O(1)

Example

Input

[4, 1, 7, 3, 9, 5]

Output

7
