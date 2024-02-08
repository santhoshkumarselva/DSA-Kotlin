package com.santhosh.dsa

class TwoSum {
    fun solve(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for(i in nums.indices) {
            val complement = target - nums[i]
            if(map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            map[nums[i]] = i;
        }
        throw IllegalArgumentException("no solution exists")
    }
}

fun main() {
    val nums = intArrayOf(2, 7, 11, 15 )
    val target = 9
    val towsum = TwoSum()
    val result = towsum.solve(nums, target)
    println("Indices ${result[0]} and ${result[1]}")
}