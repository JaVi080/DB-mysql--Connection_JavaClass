public class Student {
    int id;
    String Student_Name;
    String course;
    int marks;

    public Student(int id, String student_Name, String course, int marks) {
        this.id = id;
        Student_Name = student_Name;
        this.course = course;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudent_Name() {
        return Student_Name;
    }

    public void setStudent_Name(String student_Name) {
        Student_Name = student_Name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Student_Name='" + Student_Name + '\'' +
                ", course='" + course + '\'' +
                ", marks=" + marks +
                '}';
    }
}
