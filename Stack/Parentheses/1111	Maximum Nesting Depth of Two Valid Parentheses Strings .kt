

class Solution {
    fun maxDepthAfterSplit(seq: String): IntArray {
    val ans = mutableListOf<Int>()
    var depth = 0
    for (i in seq.indices) {
        if (seq[i] == '(') depth++
        ans.add(depth % 2)
        if (seq[i] == ')') depth--
    }
    return ans.toIntArray()
}

}
