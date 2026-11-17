
# Student Documentation & Progress System

## Project Description
This Java application will help educators organize student documentation and track student progress over time.

## Problem
Educators have to keep track of a lot of student documentation over time. This can make it difficult to keep observations organized and review a student's progress when it is time to rate their skills. This system will keep that information organized in one place.

## Intended Users
This project is intended for teachers and other educators who document and assess student learning and development.

## Current Development Status
Milestone 2 - Requirements, Baseline Algorithm, and Performance Plan

Milestone 1 was completed with a grade of 30/30 and no required revisions.

For Milestone 2, I created functional and technical requirements, implemented a sequential search algorithm, and tested the algorithm using JUnit 5.

The search algorithm finds students by their ID. I created eight automated tests, and all eight passed with no errors or failures.

I also completed a complexity analysis and developed a performance measurement plan to test how the algorithm handles larger numbers of student records.

The remaining application features will be developed in future milestones.

## Java Version
Java 21

## Project Structure
- src/: Contains the Java source code for the application.
- test/: Contains automated JUnit tests.
- docs/: Contains project requirements, algorithm documentation, testing results, complexity analysis, and performance plan.
- README.md: Contains the project overview and development progress.

## Current Java Classes
- StudentDocumentationApp.java: Initial application created for Milestone 1.
- Student.java: Stores student information, including ID, name, age, school, and class.
- StudentSearch.java: Searches an array of students using their IDs.
- StudentSearchTest.java: Tests the sequential search algorithm using JUnit 5.

## Baseline Algorithm
The baseline algorithm uses sequential search to find a student by their ID.

The algorithm checks each student until it finds a matching ID. If the student is not found, it returns null.

The algorithm has the following complexity:
- Best Case: O(1)
- Average Case: O(n)
- Worst Case: O(n)
- Auxiliary Space: O(1)

## Testing
I created eight automated tests using JUnit 5 in BlueJ.

All eight tests passed with zero errors and zero failures.

The tests include successful searches, missing students, empty arrays, single-student arrays, and invalid inputs.

## Performance Measurement Plan
I plan to test the algorithm using datasets of 100, 500, 1,000, 5,000, and 10,000 students.

I will measure the number of comparisons and execution time for different search situations.

Each test situation will be repeated ten times. Actual performance measurements have not been collected yet.

## How to Run
### Milestone 1 Application
1. Open the project in BlueJ.
2. Compile the StudentDocumentationApp class.
3. Run the main method.
4. The terminal will display the project title and current project status.

### Milestone 2 Search Algorithm
1. Open the project in BlueJ.
2. Add Student.java, StudentSearch.java, and StudentSearchTest.java.
3. Compile the Java classes.
4. Run the JUnit 5 tests in BlueJ.
5. The results will show whether the tests passed.

## Future Development
Future milestones will focus on adding student observations, organizing documentation, sorting records, and tracking student progress over time.

## Author
LeAnn Johnson
