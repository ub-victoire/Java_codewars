/*
The scenario: You're given an integer array. Find the lowest index where the sum of all elements strictly to the left equals the sum of all elements strictly to the right. That index's own value is ignored. If no such index exists, return -1. Empty sides count as 0.

The naive approach — recomputing left and right sums for each index — is O(n²). The clean approach: compute the total sum once, then walk left to right. At each index, the left side is what you've accumulated so far, and the right side is total - left - arr[i]. Compare the two, and if equal, return that index immediately (which guarantees lowest index). If you fall out of the loop, return -1.

This is O(n) time and O(1) extra space.

*/

