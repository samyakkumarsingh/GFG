Problem

Given an integer array, move all 0s to the end of the array while maintaining the relative order of non-zero elements.

The operation must be performed in-place without using extra space.

Approach

Use the two-pointer technique.

i → tracks the position where the next non-zero element should go.

Steps:

Traverse the array using index j.

Whenever a non-zero element is found:

Swap nums[i] and nums[j]

Increment i

Continue until the end of the array.

This ensures all non-zero elements appear first and zeros move to the end.

Time Complexity

O(n)

Space Complexity

O(1)

Example

Input

[0, 1, 0, 3, 12]

Output

[1, 3, 12, 0, 0]
