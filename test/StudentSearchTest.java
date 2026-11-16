
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StudentSearchTest
{
    @Test
    public void testFindFirstStudent()
    {
        Student[] students = {
            new Student(101, "Alice", 4, "Oak School", "Class A"),
            new Student(102, "Oliver", 5, "Oak School", "Class A")
        };

        Student result = StudentSearch.findStudentById(students, 101);

        assertEquals("Alice", result.getName());
    }

    @Test
    public void testFindLastStudent()
    {
        Student[] students = {
            new Student(101, "Alice", 4, "Oak School", "Class A"),
            new Student(102, "Oliver", 5, "Oak School", "Class A"),
            new Student(103, "Myla", 4, "Oak School", "Class B")
        };

        Student result = StudentSearch.findStudentById(students, 103);

        assertEquals("Myla", result.getName());
    }

    @Test
    public void testEmptyArray()
    {
        Student[] students = new Student[0];

        Student result = StudentSearch.findStudentById(students, 101);

        assertNull(result);
    }

    @Test
    public void testSingleStudent()
    {
        Student[] students = {
            new Student(101, "Alice", 4, "Oak School", "Class A")
        };

        Student result = StudentSearch.findStudentById(students, 101);

        assertNotNull(result);
        assertEquals(101, result.getStudentId());
    }

    @Test
    public void testStudentNotFound()
    {
        Student[] students = {
            new Student(101, "Alice", 4, "Oak School", "Class A"),
            new Student(102, "Oliver", 5, "Oak School", "Class A")
        };

        Student result = StudentSearch.findStudentById(students, 999);

        assertNull(result);
    }

    @Test
    public void testInvalidStudentId()
    {
        Student[] students = new Student[0];

        assertThrows(IllegalArgumentException.class, () ->
            StudentSearch.findStudentById(students, -1));
    }

    @Test
    public void testNullArray()
    {
        assertThrows(IllegalArgumentException.class, () ->
            StudentSearch.findStudentById(null, 101));
    }

    @Test
    public void testSmallestValidId()
    {
        Student[] students = {
            new Student(1, "Alice", 4, "Oak School", "Class A")
        };

        Student result = StudentSearch.findStudentById(students, 1);

        assertNotNull(result);
        assertEquals(1, result.getStudentId());
    }
}
