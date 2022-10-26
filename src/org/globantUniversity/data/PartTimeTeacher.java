package org.globantUniversity.data;

public class PartTimeTeacher extends Teacher {

    @Override
    public double getSalary() {
        return this.getBaseSalary() * this.getWeekHours();
    }



}