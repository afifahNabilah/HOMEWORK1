//HOMEWORK 1
//STUDENT ID: B221202903
//NAME: AFIFAH NABILAH
//SURNAME: BINTI MOHD SUHAIMI
//COURSE NAME: SWE303 DESIGN PATTERNS

package org.example;
import com.google.gson.Gson;

public class JSONCreator implements SerializeInterface {

    @Override
    public void prepareData(StudentInfo studentInfo) {

        Gson object = new Gson();
        String jsonString = object.toJson(studentInfo);
        System.out.println("======================= JSON Serializer =======================");
        System.out.println(jsonString);
    }


}
