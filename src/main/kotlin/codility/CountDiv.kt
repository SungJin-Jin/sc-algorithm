package main.kotlin.codility

/*
    Write a function:

    class Solution { public int solution(int A, int B, int K); }

    that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

    { i : A ≤ i ≤ B, i mod K = 0 }

    For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

    Assume that:

    A and B are integers within the range [0..2,000,000,000];
    K is an integer within the range [1..2,000,000,000];
    A ≤ B.
    Complexity:

    expected worst-case time complexity is O(1);
    expected worst-case space complexity is O(1).

    coverage 100%
 */

fun main(args: Array<String>) {

    require(3 == solution(6, 11, 2))
    require(1 == solution(10, 10, 5))
}

private fun solution(start: Int, end: Int, divisor: Int): Int {
    val value = (end - start) / divisor

    return when {
        start % divisor == 0 -> value.inc()
        else -> value
    }
}
