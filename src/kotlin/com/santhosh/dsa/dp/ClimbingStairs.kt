package com.santhosh.dsa.dp

import java.util.*

class ClimbingStairs {
    public fun solve(n: Int): Int {
        var mem = IntArray(n + 1)
        Arrays.fill(mem, -1)
        return solveUtil(n, mem)
    }

    private fun solveUtil(n: Int, mem: IntArray): Int {
        if(n<=1) return n
        if(mem[n] != -1) return mem[n]
        mem[n] = solveUtil(n - 2, mem) + solveUtil(n - 1, mem)
        return mem[n];
    }
}
fun main() {
    val sc = Scanner(System.`in`)
    var n = sc.nextInt()
    var obj = ClimbingStairs()
    println("The solution is ${obj.solve(n)}")
}