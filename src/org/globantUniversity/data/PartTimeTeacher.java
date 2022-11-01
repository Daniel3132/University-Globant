package org.globantUniversity.data;

public class PartTimeTeacher extends Teacher {

    private float weekHours;

    public PartTimeTeacher(String fullName, float weekHours) {
        super(fullName);
        this.weekHours = weekHours;
        this.isFullTime = false;
    }

    @Override
    public double getSalary() {
        return Teacher.baseSalary * weekHours;
    }

    @Override
    public String getContract() {
        return "Part time   "  + "Week Hours: " + this.weekHours;
    }

}