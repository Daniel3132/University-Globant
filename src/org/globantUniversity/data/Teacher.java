package org.globantUniversity.data;

public abstract class Teacher {

    protected String fullName;
    protected int teacherId;
    protected static int count = 1;
    protected static final float baseSalary = 1000000;
    protected boolean isFullTime;

    public abstract double getSalary();

    public abstract String getContract();

    public Teacher(String fullName) {
        this.fullName = fullName;
        this.teacherId = count;
        count++;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Id: " + teacherId + "   " +
                fullName + "    " +
                "Contract: " + getContract() + "    " +
                "Salary: $ " + getSalary();
    }
}
