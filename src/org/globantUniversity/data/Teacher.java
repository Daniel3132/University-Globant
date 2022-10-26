package org.globantUniversity.data;

public abstract class Teacher {

    private String fullName;
    private float weekHours;
    private float expYears;
    private float baseSalary;

    public abstract double getSalary();

    public String getName() {
        return fullName;
    }

    public float getWeekHours() {
        return weekHours;
    }

    public float getExpYears() {
        return expYears;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return fullName +
                "   Hours per week: " + weekHours +
                "   Exp. years: " + expYears +
                "   Salary" + getBaseSalary();
    }

}
