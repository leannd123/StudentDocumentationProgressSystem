
public class StudentSearch
{
    public static Student findStudentById(Student[] students,
                                          int targetId)
    {
        if (students == null || targetId <= 0)
        {
            throw new IllegalArgumentException("Invalid input");
        }

        for (int i = 0; i < students.length; i++)
        {
            if (students[i].getStudentId() == targetId)
            {
                return students[i];
            }
        }

        return null;
    }
}
