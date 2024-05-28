
using System;
using System.Collections.Generic;

public class Solution
{
    public IList<int> ArraysIntersection(int[] first, int[] second, int[] third)
    {
        int numberOfInputArrays = 3;
        int[] indexes = new int[numberOfInputArrays];
        IList<int> arraysIntersection = new List<int>();

        while (indexes[0] < first.Length && indexes[1] < second.Length && indexes[2] < third.Length)
        {
            if (first[indexes[0]] == second[indexes[1]] && second[indexes[1]] == third[indexes[2]])
            {
                arraysIntersection.Add(first[indexes[0]]);
            }

            int currentMin = Math.Min(first[indexes[0]], Math.Min(second[indexes[1]], third[indexes[2]]));
            indexes[0] += (first[indexes[0]] == currentMin) ? 1 : 0;
            indexes[1] += (second[indexes[1]] == currentMin) ? 1 : 0;
            indexes[2] += (third[indexes[2]] == currentMin) ? 1 : 0;
        }

        return arraysIntersection;
    }
}
