Day 65 – Problem: Smallest Integer Divisible by K

Problem:
Return the length of the smallest number composed only of digit '1' that is divisible by K (i.e.,: 1, 11, 111…).

Approach Used

Directly constructing such numbers is impossible due to their exponential growth.
The trick is to maintain only the remainder when dividing by K.

Start with:

remainder = 0
length = 0


Incrementally build the number using:

remainder = (remainder * 10 + 1) % K;
length++;


If at any step remainder == 0, we found the smallest such number.

Important Constraint:
If K % 2 == 0 OR K % 5 == 0, a number made only of '1' can never be divisible by K → return -1.

Why It Works

Numbers made of '1' grow as:
1, 11, 111, 1111... which is 10 * prev + 1.

Tracking only the modulo keeps the number small.

There are only K possible remainders — hence the loop is at most O(K).

This turns an impossible brute-force into a clean mathematical solution.

Complexity

Time: O(K)

Space: O(1)

Language: Java ☕
