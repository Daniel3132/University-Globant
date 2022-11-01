package org.globantUniversity.data;

public class FullTimeTeacher extends Teacher {

    private int expYears;

    public FullTimeTeacher(String fullName, int expYears) {
        super(fullName);
        this.expYears = expYears;
        this.isFullTime = true;
    }

    @Override
    public double getSalary() {
        return baseSalary * (this.expYears * 1.1);
    }

    @Override
    public String getContract() {
        return "Full time   " + "Exp. Years: " + this.expYears;
    }

}