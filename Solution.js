
/**
 * @param {number[]} first
 * @param {number[]} second
 * @param {number[]} third
 * @return {number[]}
 */
var arraysIntersection = function (first, second, third) {
    const numberOfInputArrays = 3;
    const indexes = new Array(numberOfInputArrays).fill(0);
    const arraysIntersection = new Array();

    while (indexes[0] < first.length && indexes[1] < second.length && indexes[2] < third.length) {
        if (first[indexes[0]] === second[indexes[1]] && second[indexes[1]] === third[indexes[2]]) {
            arraysIntersection.push(first[indexes[0]]);
        }
        const currentMin = Math.min(first[indexes[0]], second[indexes[1]], third[indexes[2]]);
        indexes[0] += (first[indexes[0]] === currentMin) ? 1 : 0;
        indexes[1] += (second[indexes[1]] === currentMin) ? 1 : 0;
        indexes[2] += (third[indexes[2]] === currentMin) ? 1 : 0;
    }

    return arraysIntersection;
};
