# Simplify-Path
## Problem Description
Given a string path representing an absolute path for a file system in Unix-style, simplify it.

In a Unix-style file system, a period '.' refers to the current directory, a double period '..' refers to the directory up a level, and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'.

The simplified path should have no trailing slash.


## Example 1:

Input: path = "/home//foo/"
Output: "/home/foo"
Explanation: In the simplified path, two consecutive slashes are replaced by one, "/foo" is considered as a directory and hence we return "/home/foo".

## Example 2:
Input: path = "/a/./b/../../c/"
Output: "/c"
Explanation: In the simplified path, "./" is replaced by a single period '.', "../" is replaced by a double period '..' and consecutive slashes are replaced by a single slash '/'.
## Approach

We can use a stack data structure to solve this problem. We can first split the input string path using the delimiter '/' into an array of directories. Then, we can 
traverse the array and perform the following operations for each directory:

- If the current directory is '.', we can skip it.
- If the current directory is '..', we can pop the top directory from the stack (if it's not empty).
- If the current directory is not empty and is not '.' or '..', we can push it onto the stack.
- After traversing the entire array, we can construct the simplified path by popping the directories from the stack to another stack
- Then popping the directories from the stack and concatenating them with a delimiter '/' and append that to Stackbuilder then convert it to string
 ## Complexity Analysis
 - the time complexity of this approach is O(n).
 - the space complexity is O(n).
