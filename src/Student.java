
public class Student
{
    private int studentId;
    private String name;
    private int age;
    private String school;
    private String className;

    public Student(int studentId, String name, int age,
                   String school, String className)
    {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.school = school;
        this.className = className;
    }

    public int getStudentId()
    {
        return studentId;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getSchool()
    {
        return school;
    }

    public String getClassName()
    {
        return className;
    }
}
