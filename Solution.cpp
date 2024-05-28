
#include <vector>
#include <algorithm>
using namespace std;

class Solution {

public:
    vector<int> arraysIntersection(const vector<int>& first, const vector<int>& second, const vector<int>& third) const {
        int numberOfInputArrays = 3;
        vector<int> indexes(numberOfInputArrays);
        vector<int> arraysIntersection;

        while (indexes[0] < first.size() && indexes[1] < second.size() && indexes[2] < third.size()) {
            if (first[indexes[0]] == second[indexes[1]] && second[indexes[1]] == third[indexes[2]]) {
                arraysIntersection.push_back(first[indexes[0]]);
            }
            int currentMin = min({ first[indexes[0]], second[indexes[1]], third[indexes[2]] });
            indexes[0] += (first[indexes[0]] == currentMin) ? 1 : 0;
            indexes[1] += (second[indexes[1]] == currentMin) ? 1 : 0;
            indexes[2] += (third[indexes[2]] == currentMin) ? 1 : 0;
        }

        return arraysIntersection;
    }
};
