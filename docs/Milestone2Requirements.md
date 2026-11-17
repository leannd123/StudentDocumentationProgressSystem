
# Milestone 2: Project Requirements

## Student Documentation & Progress System

### Milestone 1 Revision

I received a 30/30 on Milestone 1 with no additional instructor feedback or requested changes. Since no revisions were required, I will continue developing the project based on my original approved plan.

## Part 1: Functional Requirements

### FR-01: Manage Student Records
**Requirement:** The application shall allow educators to add student records containing a unique student ID, name, age, school, and class name.

**Reason:** Educators need a way to keep student information organized.

**Input:** Student information entered by the educator.

**Expected Result:** A valid student record is added to the system.

**Verification:** Add a student and confirm the information is stored correctly. Test that duplicate student IDs are rejected.

**Status:** Planned

### FR-02: Add Student Documentation
**Requirement:** The application shall allow educators to create documentation records for students.

**Reason:** Educators need to record observations of student learning and development.

**Input:** Student ID, date, content area, skill, observation notes, rating from 1–10, and an optional picture or video reference.

**Expected Result:** The documentation is connected to the correct student.

**Verification:** Add an observation and confirm that the information is saved under the correct student.

**Status:** Planned

### FR-03: Search Documentation
**Requirement:** The application shall allow educators to search student documentation by student name, content area, or skill.

**Reason:** Educators need to find previous observations without looking through every record manually.

**Input:** A student name, content area, or skill.

**Expected Result:** The application returns matching documentation or indicates that no records were found.

**Verification:** Search for existing and nonexistent records and compare the results.

**Status:** Planned

### FR-04: Sort Documentation
**Requirement:** The application shall allow educators to sort documentation by student name, date, content area, or skill rating.

**Reason:** Sorting makes it easier to organize and review information.

**Input:** A collection of documentation records and a selected sorting category.

**Expected Result:** Records appear in the selected order.

**Verification:** Sort a group of records and confirm the order is correct.

**Status:** Planned

### FR-05: Track Student Progress
**Requirement:** The application shall allow educators to review a student's documentation and skill ratings over a selected period of time.

**Reason:** Educators need to compare previous observations when assessing student progress.

**Input:** Student ID, skill or content area, and date range.

**Expected Result:** The application displays matching observations and ratings in chronological order.

**Verification:** Add observations with different dates and ratings, then confirm that the correct records are displayed.

**Status:** Planned

### FR-06: Organize Content Areas and Skills
**Requirement:** The application shall organize skills under their corresponding content areas.

**Reason:** Educators need to connect observations to the appropriate learning objectives.

**Input:** Content area and associated skill.

**Expected Result:** Skills are associated with the correct content areas.

**Verification:** Create content areas with multiple skills and confirm that each skill appears under the correct area.

**Status:** Planned

## Part 2: Quality and Technical Requirements

### QR-01: Correctness and Data Validation
**Requirement:** The application shall reject invalid student IDs, duplicate IDs, and skill ratings outside the 1–10 range.

**Reason:** Invalid information could make documentation inaccurate.

**Input:** Valid and invalid student information or skill ratings.

**Expected Result:** Valid information is accepted, while invalid information is rejected.

**Verification:** Test duplicate IDs, missing required information, and ratings below 1 or above 10.

**Status:** Planned

### QR-02: Performance
**Requirement:** The application shall support searching and organizing collections of at least 1,000 student records.

**Reason:** The system should remain usable as the amount of documentation increases.

**Input:** Generated collections containing at least 1,000 student records.

**Expected Result:** The application completes searches correctly, and its operation counts and execution times can be measured.

**Verification:** Run searches with different dataset sizes and record the results.

**Status:** Planned

### QR-03: Privacy and Security
**Requirement:** The application shall use fictional student information for development and testing.

**Reason:** Student documentation can contain private information.

**Input:** Made-up student records and documentation.

**Expected Result:** No real student information is included in the project or GitHub repository.

**Verification:** Review the source code, sample data, and repository files for personal information.

**Status:** Planned

### QR-04: Java Compatibility and Maintainability
**Requirement:** The application shall compile and run using Java 21 and use separate classes and methods for different responsibilities.

**Reason:** The program needs to work with the required course environment and remain manageable as more features are added.

**Input:** Java source files.

**Expected Result:** The application compiles and runs successfully in the required environment.

**Verification:** Compile and execute the application using Java 21 in BlueJ and run automated tests.

**Status:** In Progress

## Part 3: Assumptions and Constraints

The application will use made-up student information and will be developed using Java 21 and BlueJ. The initial version will focus on organizing student records and documentation rather than creating a complicated graphical interface.

Pictures and videos will only be represented by file names or references, not actual uploaded media. The application will not include real user accounts, cloud storage, or online access.

For testing, I will use generated datasets of different sizes to see how the algorithms perform as the number of records increases. The project will continue to be developed throughout the remaining milestones, with new data structures and algorithms added as they are covered in class.
