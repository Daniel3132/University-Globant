package org.globantUniversity.data;

public class FullTimeTeacher extends Teacher {

    @Override
    public double getSalary() {
        return this.getBaseSalary() * (this.getExpYears() * 1.1);
    }
}