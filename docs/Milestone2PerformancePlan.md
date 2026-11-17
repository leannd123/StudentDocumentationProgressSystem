
# Milestone 2: Performance Measurement Plan

## Student Documentation & Progress System

### Purpose

For Milestone 2, I created a plan to measure how the performance of my sequential search algorithm changes as the number of students increases.

The goal is to determine how efficiently the algorithm searches for a student by their ID when working with different dataset sizes.

### Performance Question

How does increasing the number of student records affect the number of comparisons and execution time needed to find a student using sequential search?

### Input Size

The input size is represented by n, which is the number of students in the array.

I will test the following five dataset sizes:

- 100 students
- 500 students
- 1,000 students
- 5,000 students
- 10,000 students

### Dataset Characteristics

I will create fictional student records using the Student class.

Each student will have a unique positive ID, name, age, school, and class.

The records will be stored in an array. The same dataset will be used for repeated trials at each input size.

### Test Cases

I will measure performance using four search situations:

1. First Student: The target ID is at the beginning of the array.
2. Middle Student: The target ID is near the middle of the array.
3. Last Student: The target ID is at the end of the array.
4. Missing Student: The target ID does not exist in the array.

These situations will help show how the student's position affects search performance.

### Measurements

I will measure two things:

1. Number of Comparisons: How many student IDs the algorithm checks before returning a result.
2. Execution Time: How long the search takes to complete, measured using System.nanoTime() in Java.

Comparison counts will be the primary measurement because they show the amount of work performed by the algorithm.

Execution time will be a secondary measurement because it can change depending on the computer and other running programs.

To count comparisons, I will use a separate instrumented version of the search during the performance experiment.

### Repeated Trials

Each dataset size and search situation will be tested 10 times.

I will record the results and calculate the average comparison count and average execution time.

Repeating the tests will help make the measurements more consistent.

### Controlled Conditions

To keep the experiment fair, I will:

- Use the same computer and Java version for all trials.
- Use the same sequential search algorithm.
- Use the same dataset for repeated trials.
- Keep the student IDs unique.
- Exclude dataset creation time from the search timing.
- Run the tests under similar computer conditions.

### Expected Results

I expect the number of comparisons to increase as the dataset becomes larger.

For the first student, the algorithm should only need one comparison.

For a student near the middle, it should need approximately n / 2 comparisons.

For the last student or a missing student, it should need n comparisons.

These results would support the O(n) worst-case time complexity discussed in my complexity analysis.

Execution times may vary, but searches requiring more comparisons will generally take longer.

### Planned Results Table

I will use the following table to organize the results for each search situation.

| Input Size (n) | Trial 1 | Trial 2 | Trial 3 | Trial 4 | Trial 5 | Trial 6 | Trial 7 | Trial 8 | Trial 9 | Trial 10 | Average |
|----------------|---------|---------|---------|---------|---------|---------|---------|---------|---------|----------|---------|
| 100 | | | | | | | | | | | |
| 500 | | | | | | | | | | | |
| 1,000 | | | | | | | | | | | |
| 5,000 | | | | | | | | | | | |
| 10,000 | | | | | | | | | | | |

I will record comparison counts and execution times in separate tables using this format.

### Conclusion

This performance plan will help me understand how sequential search behaves as the number of student records increases.

The results will help me determine whether sequential search is appropriate for larger datasets or whether a more efficient search algorithm may be useful in a future milestone.

This document describes the planned experiment. Actual performance measurements have not been collected yet.
