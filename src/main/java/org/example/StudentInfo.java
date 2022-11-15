//HOMEWORK 1
//STUDENT ID: B221202903
//NAME: AFIFAH NABILAH
//SURNAME: BINTI MOHD SUHAIMI
//COURSE NAME: SWE303 DESIGN PATTERNS

package org.example;

public class StudentInfo {

    private String studentId;
    private String name;
    private String surname;

    public StudentInfo(String studentId, String name, String surname) {
        studentId = "2022";
        name = "Afifah";
        surname = "Nabilah";
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
    }

    public StudentInfo() {

    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId() {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname() {
        this.surname = surname;
    }


}
