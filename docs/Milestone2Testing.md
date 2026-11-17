
# Milestone 2: Baseline Testing

## Student Documentation & Progress System

### Purpose of Testing

For Milestone 2, I created automated tests to make sure my sequential search algorithm works correctly.

The tests check whether the program can find students by their ID and handle situations where a student is missing or the input is invalid.

I used JUnit 5 in BlueJ to test the StudentSearch class.

### Test Summary

| Test ID | Test Condition | Input | Expected Result | Actual Result |
|---------|----------------|-------|-----------------|---------------|
| T-01 | Find first student | IDs 101, 102; search 101 | Returns Alice | Pass |
| T-02 | Find last student | IDs 101, 102, 103; search 103 | Returns Myla | Pass |
| T-03 | Empty array | Empty array; search 101 | Returns null | Pass |
| T-04 | Single student | ID 101; search 101 | Returns student 101 | Pass |
| T-05 | Student not found | IDs 101, 102; search 999 | Returns null | Pass |
| T-06 | Invalid student ID | Empty array; search -1 | Throws IllegalArgumentException | Pass |
| T-07 | Null array | Null array; search 101 | Throws IllegalArgumentException | Pass |
| T-08 | Smallest valid ID | ID 1; search 1 | Returns student 1 | Pass |

### Testing Results

I ran all eight automated tests in BlueJ.

**Total Tests:** 8

**Passed:** 8

**Errors:** 0

**Failures:** 0

**Total Execution Time:** 99 milliseconds

All eight tests passed, which shows that the sequential search works correctly for the situations tested.

### Manual Testing

Before running the automated tests, I also tested the algorithm using BlueJ's Code Pad.

When I searched for student ID 102, the program returned Oliver.

When I searched for student ID 999, the program returned null because that student was not in the array.

Both searches returned the expected results.

### Testing Limitations

The current tests focus on searching for students by ID. Other features, such as adding documentation, sorting records, and tracking progress, have not been implemented or tested yet.

These features will be developed and tested in later milestones.
