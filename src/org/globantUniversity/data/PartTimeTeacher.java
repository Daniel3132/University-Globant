package org.globantUniversity.data;

public class PartTimeTeacher extends Teacher { 

    private float weekHours;

    public PartTimeTeacher(String fullName, float weekHours) {
        super(fullName);
        this.weekHours = weekHours;
    }

    @Override
    public double getSalary() {
        return this.getBaseSalary() * weekHours;
    }



}