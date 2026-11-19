# Insertion in a Doubly Linked List

| Field | Value |
| --- | --- |
| Platform | GeeksforGeeks |
| Difficulty | Easy |
| Status | Solved — Java solution included |
| Topic | Linked List |
| Problem ID | Not recorded |

## Problem

Given the head of a doubly linked list, a zero-based position `p`, and an integer `x`, insert a new node containing `x` immediately after the node at position `p`. Return the head of the updated list. See the [official problem](https://www.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1) for the complete statement, examples, and constraints.

## Solution

The solution walks to the node at position `p`, then updates the `next` and `prev` pointers of the new node and its neighbors. It also updates the next node's `prev` pointer when one exists.

Add the platform submission code as `Solution.java` in the problem folder.

## Notes

The position is zero-based. Insertion at the tail is handled by leaving the new node's `next` pointer `null`.
