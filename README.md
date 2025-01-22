The Problem:
 Find the longest substring with k unique characters in a given string

Given a string you need to print longest possible substring that has exactly M unique characters. If there is more than one substring of longest possible length, then print any one of them.

Examples: 


Input: Str = “aabbcc”, k = 1
Output: 2
Explanation: Max substring can be any one from {“aa” , “bb” , “cc”}.


Input: Str = “aabbcc”, k = 2
Output: 4
Explanation: Max substring can be any one from {“aabb” , “bbcc”}.


Input: Str = “aabbcc”, k = 3
Output: 6
Explanation: 
There are substrings with exactly 3 unique characters
{“aabbcc” , “abbcc” , “aabbc” , “abbc” }
Max is “aabbcc” with length 6.


Input: Str = “aaabbb”, k = 3
Output: Not enough unique characters
Explanation: There are only two unique characters, thus show error message. 


Source: Google Interview Question.

The Solution:
Algorithm used: Sliding window with two pointers
you can make two pointers, j & i, j for maximizing the window if the number of the distinct characters is less than k. 
while if the number of distinct characters equls k then you need to maximize the length of the window 
after that you have to minimize the window using the i pointer then repeate maximizing the window using j pointer again. 
