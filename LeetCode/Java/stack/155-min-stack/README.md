# Min Stack

| Field | Value |
| --- | --- |
| Platform | LeetCode |
| Difficulty | Medium |
| Status | Solved — Java solution included |
| Topic | Stack |
| Problem ID | 155 |

## Problem

Design a stack that supports `push`, `pop`, `top`, and retrieving the minimum element, with each operation taking constant time. See the [official problem](https://leetcode.com/problems/min-stack/) for the complete statement, examples, and constraints.

## Solution

See [`Solution.java`](./Solution.java). One stack stores all values and a second stack tracks the current minimums. A value is added to the minimum stack when it is less than or equal to the current minimum; when that value is removed, the matching minimum is also removed.

## Notes

Using `<=` when tracking minimums preserves duplicate minimum values so each can be popped independently.
