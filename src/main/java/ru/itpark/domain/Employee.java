package ru.itpark.domain;

public class Employee {
    private String name = "Anonymous"; // null по умолчанию
    private int hiredYear = 1900; // 0 - по умолчанию

    // Alt + Insert -> Constructor
    // специальный метод, который инициализирует объект
    // 1. Нет возвращаемого значения
    // 2. Имя метода с большой буквы
    // 3. Имя метода соответствует названию класса
    public Employee(String name, int hiredYear) {
        // TODO: всякие проверки
        // сокрытие имени - name - это параметр, а не поле
        // this.name - чтобы получить доступ к полю
        this.name = name;
        this.hiredYear = hiredYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHiredYear() {
        return hiredYear;
    }

    public void setHiredYear(int hiredYear) {
        this.hiredYear = hiredYear;
    }

    public int getExperienceForYear(int year) {
        if (hiredYear > year) {
            return 0; // 0 - потому что int
        }

        return year - hiredYear;
    }
}
