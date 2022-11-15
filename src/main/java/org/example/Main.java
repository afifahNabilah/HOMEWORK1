//HOMEWORK 1
//STUDENT ID: B221202903
//NAME: AFIFAH NABILAH
//SURNAME: BINTI MOHD SUHAIMI
//COURSE NAME: SWE303 DESIGN PATTERNS

package org.example;

public class Main {

    public static void main(String[] args) {

        StudentInfo studentInfo = new StudentInfo("", "", "");
        Factory factory = new Factory();

        SerializeInterface jsonSerializer = factory.createStudent("JSON");
        jsonSerializer.prepareData(studentInfo);

        SerializeInterface protobufSerializer = factory.createStudent("ASCII");
        protobufSerializer.prepareData(studentInfo);


    }


}