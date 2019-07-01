package com.stackroute.pe3;

class InvalidGradesException extends Exception {

    public InvalidGradesException (String message) {

        super(message);
    }
}

public class StudentMarks {

    public static void main(String[] args){

        int numOfStudents = 5;
        int[] stuGrades = {20,30,404,50,60};

        for (int i = 0; i < numOfStudents; i++) {
            try {
                String output = checkGrades(stuGrades[i]);
                System.out.println(output);
            }
            catch (InvalidGradesException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static String checkGrades(int stuGrades) throws InvalidGradesException{


            if(stuGrades < 0 || stuGrades > 100)
                throw new InvalidGradesException("Invalid Grades");

            else
                return ("Valid Grades");
    }
}
