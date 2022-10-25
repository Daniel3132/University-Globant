package org.globantUniversity.data;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Teacher> teachersList;
    private List<Student> studentsList;
    private List<Subject> subjectsList;

    public University() {
        this.teachersList = new ArrayList<>();
        this.studentsList = new ArrayList<>();
        this.subjectsList = new ArrayList<>();
    }

    
}