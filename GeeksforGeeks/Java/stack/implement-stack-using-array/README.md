# Implement Stack using Array

| Field | Value |
| --- | --- |
| Platform | GeeksforGeeks |
| Difficulty | Basic |
| Status | Solved — Java solution included |
| Topic | Stack |
| Problem ID | Not recorded |

## Problem

Implement a fixed-capacity stack using an array. Support `push`, `pop`, `peek`, `isEmpty`, and `isFull`; `peek` returns `-1` when the stack is empty. See the [official problem](https://www.geeksforgeeks.org/problems/implement-stack-using-array/1) for the complete statement, examples, and constraints.

## Solution

See [`Solution.java`](./Solution.java). The stack stores its elements in an integer array and tracks the current top index. Pushes to a full stack and pops from an empty stack leave the stack unchanged.

## Notes

The top index starts at `-1`; increment it before writing a pushed value and decrement it after a successful pop.
