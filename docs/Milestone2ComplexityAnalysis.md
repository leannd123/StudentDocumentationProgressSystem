
# Milestone 2: Complexity Analysis

## Student Documentation & Progress System

### Algorithm Overview

For my baseline algorithm, I used sequential search to find a student by their ID.

The algorithm checks each student in the array until it finds a matching ID. If no match is found, it returns null.

### Input Size

The input size is represented by **n**, which is the number of students stored in the array.

The primary operation is comparing a student's ID to the target ID.

### Best Case

The best case happens when the student being searched for is the first student in the array.

The algorithm only needs to make one comparison before finding the student.

**Comparisons:** 1

**Time Complexity:** O(1)

### Worst Case

The worst case happens when the student is the last student in the array or is not in the array at all.

The algorithm must check every student before returning a result.

**Comparisons:** n

**Time Complexity:** O(n)

### Average Case

The average case assumes the student is in the array and is equally likely to be at any position.

The algorithm checks approximately half of the students before finding the correct one.

**Average Comparisons:** (n + 1) / 2

**Time Complexity:** O(n)

### Auxiliary Space Complexity

The algorithm does not create another array or use additional storage that grows with the number of students.

It only uses a loop counter and the information already provided to the method.

**Auxiliary Space Complexity:** O(1)

### Complexity Summary

| Case | Number of Comparisons | Time Complexity |
|------|-----------------------|-----------------|
| Best Case | 1 | O(1) |
| Average Case | (n + 1) / 2 | O(n) |
| Worst Case | n | O(n) |

**Auxiliary Space:** O(1)

### Explanation

Sequential search is simple to implement and works well for the current version of my project.

As the number of students increases, the number of comparisons may also increase. For example, searching through 100 students could require up to 100 comparisons, while searching through 1,000 students could require up to 1,000 comparisons.

This means the worst-case running time grows linearly with the number of students.

For this milestone, sequential search is a reasonable starting point because it allows me to test the basic student search feature before adding more advanced functionality.

### Assumptions and Limitations

The analysis assumes the student array contains valid Student objects with no null entries.

It also assumes the search is performed using a valid positive student ID.

If the array is empty, the algorithm returns null without making any student ID comparisons.

If the array itself is null or the target ID is zero or negative, the algorithm throws an IllegalArgumentException.
