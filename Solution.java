
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> arraysIntersection(int[] first, int[] second, int[] third) {
        int numberOfInputArrays = 3;
        int[] indexes = new int[numberOfInputArrays];
        List<Integer> arraysIntersection = new ArrayList<>();

        while (indexes[0] < first.length && indexes[1] < second.length && indexes[2] < third.length) {
            if (first[indexes[0]] == second[indexes[1]] && second[indexes[1]] == third[indexes[2]]) {
                arraysIntersection.add(first[indexes[0]]);
            }
            int currentMin = Math.min(first[indexes[0]], Math.min(second[indexes[1]], third[indexes[2]]));
            indexes[0] += (first[indexes[0]] == currentMin) ? 1 : 0;
            indexes[1] += (second[indexes[1]] == currentMin) ? 1 : 0;
            indexes[2] += (third[indexes[2]] == currentMin) ? 1 : 0;
        }

        return arraysIntersection;
    }
}
