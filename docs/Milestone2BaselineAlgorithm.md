
# Milestone 2: Baseline Algorithm

## Student Documentation & Progress System

### Selected Algorithm

For Milestone 2, I chose a sequential search algorithm to find a student using their student ID.

This supports FR-01 because educators need to be able to find student records after they have been added to the system.

I chose sequential search because it is simple to understand and works with the arrays we have been learning about in Java.

### Input and Output

**Input:** An array of Student objects and the student ID being searched for.

**Output:** The matching Student object if the ID is found, or null if no student matches.

### Assumptions

Each student should have a unique positive ID. The array should contain valid Student objects without empty positions.

### How the Algorithm Works

1. The program checks whether the array or student ID is invalid.
2. It starts at the beginning of the student array.
3. It compares each student's ID with the ID being searched for.
4. If the IDs match, the program returns that student.
5. If the program reaches the end without finding a match, it returns null.

### Pseudocode

    ALGORITHM findStudentById(students, targetId)

        IF students is null OR targetId <= 0
            REPORT invalid input
        END IF

        FOR each student IN students
            IF student ID equals targetId
                RETURN student
            END IF
        END FOR

        RETURN null

    END ALGORITHM

### Successful Search

The search is successful when a student's ID matches the requested ID. The program returns that student's record.

### Missing or Invalid Input

If no student has the requested ID, the method returns null.

If the student array is null or the requested ID is zero or negative, the method throws an IllegalArgumentException.

### Java Implementation

The algorithm is implemented in StudentSearch.java using a for loop and an if statement.

The program checks students one at a time instead of using a more advanced searching method. This gives me a starting point for comparing other algorithms later in the course.

### Initial Testing

I tested the algorithm in BlueJ using student records with different IDs.

Searching for student ID 102 returned Oliver, and searching for student ID 999 returned null.

I also created eight automated JUnit 5 tests. All eight tests passed with zero errors and zero failures.
