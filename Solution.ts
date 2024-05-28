
function arraysIntersection(first: number[], second: number[], third: number[]): number[] {
    const numberOfInputArrays = 3;
    const indexes: number[] = new Array(numberOfInputArrays).fill(0);
    const arraysIntersection: number[] = new Array();

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
