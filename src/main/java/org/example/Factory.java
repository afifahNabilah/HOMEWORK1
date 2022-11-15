//HOMEWORK 1
//STUDENT ID: B221202903
//NAME: AFIFAH NABILAH
//SURNAME: BINTI MOHD SUHAIMI
//COURSE NAME: SWE303 DESIGN PATTERNS

package org.example;

public class Factory {

    public SerializeInterface createStudent(String student) {

        if (student == null || student.isEmpty())
            return null;
        switch (student) {
            case "JSON":
                return new JSONCreator();
            case "ASCII":
                return new AsciiCreator();
            default:
                throw new IllegalArgumentException("Unknown Serializer");

        }

    }
}
