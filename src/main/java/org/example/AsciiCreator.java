//HOMEWORK 1
//NAME: AFIFAH NABILAH
//STUDENT ID: B221202903

package org.example;
import java.util.Arrays;

public class AsciiCreator implements SerializeInterface{

    @Override
    public void prepareData(StudentInfo studentInfo) {

        try {

            // translating text String to 7 bit ASCII encoding
            byte[] bytes1 = studentInfo.getStudentId().getBytes("US-ASCII");
            byte[] bytes2 = studentInfo.getName().getBytes("US-ASCII");
            byte[] bytes3 = studentInfo.getSurname().getBytes("US-ASCII");

            System.out.println("\n======================= ASCII Serializer =======================");
            System.out.println("Student ID: " + studentInfo.getStudentId() + " " + "\nAscii Value: " + Arrays.toString(bytes1));
            System.out.println("\nName: " + studentInfo.getName() + " " + "\nAscii Value: " + Arrays.toString(bytes2));
            System.out.println("\nSurname: " + studentInfo.getSurname() + " " + "\nAscii Value: " + Arrays.toString(bytes3));


        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
