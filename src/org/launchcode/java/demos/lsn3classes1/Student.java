package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;


    public Student(String name, int studentId, int numberOfCredits, double gpa) {
    }
    public Student(String name, int studentId){
        this(name, studentId, 0, 0);
    }
    public Student(String name){
        this(name, nextStudentId);
            nextStudentId ++;
    }


    private String getName(String name){
        return name;
    }
    public void setName(String aName){
        this.name = aName;
    }
    private int getStudentId(int studentId){
        return studentId;
    }
    private void setStudentId(int aStudentId){
        this.studentId = aStudentId;
    }
    private int getNumberOfCredits(int numberOfCredits){
        return numberOfCredits;
    }
    public void setNumberOfCredits(int aNumberOfCredits){
        this.numberOfCredits = aNumberOfCredits;
    }
    private double getGpa(double gpa){
        return gpa;
    }
    public void setGpa(double aGpa){
        this.gpa =  aGpa;
    }
}
