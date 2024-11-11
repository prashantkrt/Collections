package part04_ComparatorVsComparable;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String name;
    private String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

class Test {
    public static void main(String[] args) {

        List<Car> list = new ArrayList<>();

        list.add(new Car("Car", "Blue"));
        list.add(new Car("Bus", "Green"));
        list.add(new Car("Vehicle", "Yellow"));
        list.add(new Car("Bike", "Black"));

        list.sort((a,b)->a.getColor().compareTo(b.getColor()));

        System.out.println(list);

    }
}
