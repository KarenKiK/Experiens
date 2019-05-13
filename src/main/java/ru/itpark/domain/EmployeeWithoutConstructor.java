package ru.itpark.domain;

public class EmployeeWithoutConstructor {
    private String name = "Anonymous"; // null по умолчанию
    private int hiredYear = 1900; // 0 - по умолчанию

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
