package ru.itpark;

import ru.itpark.domain.Employee;

public class Main {
    public static void main(String[] args) {
        // new Employee(...) -> вызов конструктора
        // new Employee()
        Employee employee = new Employee("Vasya", 2000);
        // null - отсутствие объекта
        String name = employee.getName().toUpperCase();
        System.out.println(name);

        // employee.setHiredYear(2000);
        System.out.println(employee.getExperienceForYear(2018));
        System.out.println(employee.getExperienceForYear(1995));
    }
}
