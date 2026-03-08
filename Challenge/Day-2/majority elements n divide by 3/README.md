# Majority Element More Than n/3

## Problem

Given an integer array `arr` of size `n`, find all elements that appear **more than ⌊n/3⌋ times**.

The returned list should be **sorted**.

Example:


Input:
[2, 2, 3, 1, 3, 2, 1, 1]

Output:
[1, 2]


Because both `1` and `2` appear **3 times**, which is greater than `8/3 = 2`.

---

# Important Observation

An array can have **at most two elements** that appear more than `n/3` times.

Why?

If there were three such elements:


n/3 + n/3 + n/3 > n


which is impossible.

So we only need to track **two possible candidates**.

---

# Approach (Boyer–Moore Voting Algorithm)

Instead of storing frequencies in a HashMap, we track **two potential majority candidates** and their counts.

The algorithm works in **two passes**.

---

# Step 1 — Find Potential Candidates

We maintain:


maj1, count1
maj2, count2


We iterate through the array and update counts.

### Logic

For each element:

1. If the element equals `maj1` → increase `count1`
2. Else if the element equals `maj2` → increase `count2`
3. Else if `count1 == 0` → assign new candidate to `maj1`
4. Else if `count2 == 0` → assign new candidate to `maj2`
5. Otherwise → decrease both counts

### Idea

When we decrease both counts, we are **canceling out different elements**.

Only elements with very high frequency survive this elimination process.

---

# Step 2 — Verify Candidates

The first pass only finds **possible candidates**.

They are not guaranteed to be majority elements.

So we count their **actual frequency** in the array.


if(freq1 > n/3) → add maj1
if(freq2 > n/3) → add maj2


---

# Step 3 — Sort the Result

The problem requires the output to be sorted.


Collections.sort(result);


---

# Example

Array:


[2,2,3,1,3,2,1,1]


After candidate selection:


maj1 = 1
maj2 = 2


Verification step:


1 appears 3 times
2 appears 3 times


Both satisfy:


freq > n/3


Final output:


[1,2]


---

# Time Complexity


O(n)


Two passes through the array.

---

# Space Complexity


O(1)


Only a few variables are used.

---

# Potential Mistakes

### 1. Forgetting the Verification Step

The first pass **does not guarantee** the candidates are majority elements.

Always verify their frequencies.

---

### 2. Forgetting That Only Two Candidates Exist

Many people try to track many candidates.

But mathematically **only two elements can appear more than n/3 times**.

---

### 3. Incorrect Condition Order

The condition order matters.  
If it is wrong, the algorithm may overwrite candidates incorrectly.

Correct order:


check candidate match
then check empty slot
then decrease counts


---

### 4. Not Sorting the Result

The problem requires the returned list to be **sorted**.

---

# Key Idea to Remember

Whenever you see:


majority > n/2 → 1 candidate
majority > n/3 → 2 candidates
majority > n/k → k-1 candidates


This pattern is a **generalization of Boyer–Moore Voting Algorithm**.
