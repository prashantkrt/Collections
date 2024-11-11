package part04_ComparatorVsComparable.comparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
    public int id;
    public String name;
    public int salary;

    public Employee(int id, String name, int salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}

class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.salary-o1.salary;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Rajesh",1200));
        list.add(new Employee(2,"Deepak",1201));
        list.add(new Employee(3,"Madan",1100));
        list.add(new Employee(4,"Pinki",1101));

        Collections.sort(list,new EmployeeComparator());
        System.out.println(list);
    }
}