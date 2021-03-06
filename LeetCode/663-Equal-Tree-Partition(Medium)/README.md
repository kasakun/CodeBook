# Equal Tree Partition

Given a binary tree with n nodes, your task is to check if it's possible to partition the tree to two trees which have the equal sum of values after removing exactly one edge on the original tree.

Example 1:

```bash
Input:
    5
   / \
  10 10
    /  \
   2   3

Output: True
Explanation:
    5
   /
  10

Sum: 15

   10
  /  \
 2    3

Sum: 15
```

Example 2:

```bash
Input:
    1
   / \
  2  10
    /  \
   2   20
```

Output: False
Explanation: You can't split the tree into two trees with equal sum after removing exactly one edge on the tree.

