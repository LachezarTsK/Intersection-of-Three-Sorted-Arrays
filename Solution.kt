
import kotlin.math.min

class Solution {
    fun arraysIntersection(first: IntArray, second: IntArray, third: IntArray): List<Int> {
        val numberOfInputArrays = 3
        val indexes = IntArray(numberOfInputArrays)
        val arraysIntersection = ArrayList<Int>()

        while (indexes[0] < first.size && indexes[1] < second.size && indexes[2] < third.size) {
            if (first[indexes[0]] == second[indexes[1]] && second[indexes[1]] == third[indexes[2]]) {
                arraysIntersection.add(first[indexes[0]])
            }
            val currentMin = min(first[indexes[0]], min(second[indexes[1]], third[indexes[2]]))
            indexes[0] += if (first[indexes[0]] == currentMin) 1 else 0
            indexes[1] += if (second[indexes[1]] == currentMin) 1 else 0
            indexes[2] += if (third[indexes[2]] == currentMin) 1 else 0
        }

        return arraysIntersection
    }
}
