package part04_ComparatorVsComparable.comparableVsComparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {

    public int marks;
    public String name;
    public String phoneNo;

    public Student(int marks, String name, String phoneNo) {
        this.marks = marks;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //based on the name
       // return o.name.compareTo(name);// descending
        return Integer.compare(marks, o.marks); //ascending order
    }
}

class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(100,"Raghav","123456"));
        students.add(new Student(200,"Binod","123456"));
        students.add(new Student(110,"Rupa","123456"));
        students.add(new Student(130,"Kumar","123456"));
        students.add(new Student(105,"Prerna","123456"));

        Collections.sort(students);
        System.out.println(students);


    }
}
