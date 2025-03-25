package opgave03;
import java.util.*;

class Student implements Comparable<Student> {
    private int studentNo;
    private String name;
    private List<Integer> grades;

    public Student(int studentNo, String name) {
        this.studentNo = studentNo;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public int getStudentNo() {
        return studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.studentNo, other.studentNo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return studentNo == student.studentNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo=" + studentNo +
                ", name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}