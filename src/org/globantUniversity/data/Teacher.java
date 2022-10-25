package org.globantUniversity.data;

public abstract class Teacher {

    private String name;
    private float weekHours;
    private float expYears;
    private float baseSalary;

    public abstract double getSalary();

    public String getName() {
        return name;
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


    
}
