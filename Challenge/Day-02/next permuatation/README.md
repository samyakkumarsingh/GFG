# Next Permutation

## Problem
Given an array of integers, rearrange the numbers into the **next lexicographically greater permutation**.

If such a permutation is not possible (the array is in descending order), rearrange it into the **lowest possible order (ascending order)**.

The rearrangement must be done **in-place**.

---

## Intuition

We want the **next bigger arrangement of the same numbers**.

Think of permutations like dictionary order:


123
132
213
231
312
321


Each line is the **next permutation** of the previous one.

Instead of generating all permutations (which is expensive), we follow a smart observation about the **right side of the array**.

---

## Key Observation

If we look from the **right side**, we will notice that some part of the array is already in **descending order**.

Example:


1 3 5 4 2
↑


The suffix `5 4 2` is descending.  
This means this part is already the **largest arrangement** of those numbers.

So we must modify the element **just before this descending part**.

---

# Approach (Step by Step)

### Step 1 — Find the Break Point
Traverse from right and find the first position where:


arr[i] < arr[i + 1]


This is called the **break point**.

Example:


1 3 5 4 2
↑


`3` is the break point because `3 < 5`.

---

### Step 2 — Find the Next Greater Element
Now find the **smallest number greater than arr[index]** from the right side.

Example:


1 3 5 4 2
↑


The next greater element than `3` is `4`.

---

### Step 3 — Swap Them


1 4 5 3 2


---

### Step 4 — Reverse the Right Part

The right side is still in descending order.

To get the **next smallest permutation**, we reverse it.


Before reverse:
1 4 5 3 2

After reverse:
1 4 2 3 5


This becomes the **next permutation**.

---

# Edge Case

If the array is already in **descending order**:


5 4 3 2 1


There is **no larger permutation**.

So we simply reverse the whole array:


1 2 3 4 5


---

# Complexity

Time Complexity:


O(n)


We traverse the array a few times.

Space Complexity:


O(1)


Everything is done **in-place**.

---

# Example

Input:


[1,2,3]


Output:


[1,3,2]


---

Input:


[3,2,1]


Output:


[1,2,3]


---

# Key Pattern to Remember

Whenever you see **Next Permutation**, think:


Find breakpoint

Find next greater element

Swap

Reverse suffix


This pattern works every time.
