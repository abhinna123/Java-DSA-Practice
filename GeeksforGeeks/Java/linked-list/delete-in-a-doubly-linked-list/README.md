# Delete in a Doubly Linked List

| Field | Value |
| --- | --- |
| Platform | GeeksforGeeks |
| Difficulty | Easy |
| Status | Solved — Java solution included |
| Topic | Linked List |
| Problem ID | Not recorded |

## Problem

Given the head of a doubly linked list and a 1-based position `k`, delete the node at that position and return the updated head. See the [official problem](https://www.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1) for the complete statement, examples, and constraints.

## Solution

See [`Solution.java`](./Solution.java). The solution handles deleting the head separately, then connects the deleted node's previous and next neighbors. If `k` is outside the list, it leaves the list unchanged.

## Notes

When the head is removed, the new head's `prev` pointer is reset to `null`.
