
package main

import "fmt"

func arraysIntersection(first []int, second []int, third []int) []int {
	const numberOfInputArrays = 3
	indexes := make([]int, numberOfInputArrays)
	arraysIntersection := []int{}

	for indexes[0] < len(first) && indexes[1] < len(second) && indexes[2] < len(third) {
		if first[indexes[0]] == second[indexes[1]] && second[indexes[1]] == third[indexes[2]] {
			arraysIntersection = append(arraysIntersection, first[indexes[0]])
		}
		var currentMin = min(first[indexes[0]], min(second[indexes[1]], third[indexes[2]]))
		if first[indexes[0]] == currentMin {
			indexes[0]++
		}
		if second[indexes[1]] == currentMin {
			indexes[1]++
		}
		if third[indexes[2]] == currentMin {
			indexes[2]++
		}
	}

	return arraysIntersection
}
