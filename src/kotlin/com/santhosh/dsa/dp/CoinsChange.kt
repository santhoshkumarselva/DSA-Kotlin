package com.santhosh.dsa.dp

import java.util.*

class CoinsChange {
}

fun main() {
    var n: Int;
    val sc = Scanner(System.`in`)
    println("Enter the value of n:")
    n = sc.nextInt()
    var coins = IntArray(n)
    println("Enter each value")
    for(i in 0 until n) {
        coins[i] = sc.nextInt()
    }
    println("Enter the target")
    var target = sc.nextInt()
    println("The solution is ${solve(coins, target)}")
}
fun solve(coins: IntArray, target: Int): Int {
    var tab = IntArray(target + 1)
    Arrays.fill(tab, Int.MAX_VALUE)
    tab[0] = 0;
    for(i in tab.indices) {
        for(j in coins.indices) {
            if(i - coins[j] >= 0) {
                tab[i] = minOf(tab[i], tab[i-coins[j]] + 1)
            }
            else if(i - coins[j] == 0){
                tab[i] = 1;
            }
        }
    }
    if(tab[target] == Int.MAX_VALUE) return -1
    else return tab[target]
}
