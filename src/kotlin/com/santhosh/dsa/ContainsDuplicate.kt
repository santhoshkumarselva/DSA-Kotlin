package com.santhosh.dsa
class ContainsDuplicate {
    fun solve(arr: IntArray) : Boolean {
        var set = HashSet<Int>()
        for(i in arr.indices) {
            if(set.contains(arr[i])) return true;
            set.add(arr[i])
        }
        return false;
    }

}
fun main() {
    var arr = intArrayOf(1, 2, 3, 4 )
    var obj = ContainsDuplicate()
    if(obj.solve(arr))
            println("The given array has duplicates")
    else
            println("The given array don't have any duplicates")
}