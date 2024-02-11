package com.santhosh.dsa.array

import java.util.Scanner;

class BuySellStock {
    fun solve(arr: IntArray, n: Int) : Int {
        var minValue = arr[0]
        var maxProfit = 0
        for(i in 0 until n) {
            if(arr[i] - minValue > maxProfit) {
                maxProfit = arr[i] - minValue;
            } else if(arr[i] < minValue) {
                minValue = arr[i]
            }
        }
        return maxProfit;
    }

}

fun main() {
    val sc = Scanner(System.`in`)
    println("Enter the number of days")
    var n = sc.nextInt();
    println("Enter the stock price for each day")
    var arr = IntArray(n)
    for(i in 0 until n) {
        arr[i] = sc.nextInt()
    }
    var obj = BuySellStock();
    println("Solution ${obj.solve(arr, n)}")
}