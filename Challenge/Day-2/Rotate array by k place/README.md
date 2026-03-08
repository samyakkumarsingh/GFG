# Rotate Array (Left Rotation) – Reversal Algorithm

## Problem
Given an array `arr[]` of size `n` and an integer `d`, rotate the array to the **left by `d` positions**.

### Example

Input

arr = [1,2,3,4,5,6]
d = 2


Output

[3,4,5,6,1,2]


---

# Approach: Reversal Algorithm

Instead of shifting elements one by one or using extra space, we rotate the array using **three reversals**.

### Steps

1. Reverse the **first `d` elements**
2. Reverse the **remaining `n - d` elements**
3. Reverse the **entire array**

---

# Example Walkthrough

Initial Array

[1,2,3,4,5,6]
d = 2


### Step 1: Reverse first `d` elements

[2,1,3,4,5,6]


### Step 2: Reverse remaining elements

[2,1,6,5,4,3]


### Step 3: Reverse the whole array

[3,4,5,6,1,2]


Final rotated array is obtained.

---

# Edge Case

If `d` is greater than array length:


d = d % n


Example

n = 5
d = 12

12 % 5 = 2


So the array rotates by **2 positions**.

---

# Time Complexity

O(n)


The array is traversed a constant number of times.

---

# Space Complexity

O(1)
