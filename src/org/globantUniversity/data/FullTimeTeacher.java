package org.globantUniversity.data;

public class FullTimeTeacher extends Teacher {

    private int expYears;

    public FullTimeTeacher(String fullName, int expYears) {
        super(fullName);
        this.expYears = expYears;
    }

    @Override
    public double getSalary() {
        return this.getBaseSalary() * (this.getExpYears() * 1.1);
    }

}