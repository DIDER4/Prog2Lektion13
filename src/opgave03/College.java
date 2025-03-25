package opgave03;

import java.util.ArrayList;
import java.util.List;

class College {
    private String name;
    private List<Student> students;

    public College(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public double calcAverage() {
        int totalGrades = 0;
        int count = 0;
        for (Student student : students) {
            for (int grade : student.getGrades()) {
                totalGrades += grade;
                count++;
            }
        }
        return count == 0 ? 0 : (double) totalGrades / count;
    }

    public Student findStudent(int studentNo) {
        for (Student student : students) {
            if (student.getStudentNo() == studentNo) {
                return student;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
