/** Java exercice
  * Author: Yara 
  * Last update on: 15 September 2023
  */

import java.util.*;

public class Main{
  public static void main(String[] args){
    String[] courses = {"csc1111", "com2222", "mth3333"};
    Student s1 = new Student("AAA", 123, 4.09f, courses);
    s1.display();
  }
  
}


class Student{
    private String name;
    private int studentID;
    private float gpa;
    //we assume that the maximum amount of courses a student can take is 8
    private String enrolledCourses[] = new String[8];

    
    //getter and setter for name
    public void setName(String nameIN){
        this.name = nameIN;
    }
    public String getName(){
        return name;
    }


    //getter and setter for student ID
    public void setStudentID(int studentIDIN) {
        this.studentID = studentIDIN;
    }
    public int getStudentID(){
        return studentID;
    }

    
    //setter and getter for the attribute gpa
    public void setGpa(float gpaIN){
        this.gpa = gpaIN;
    }
    public float getGpa(){
        return gpa;
    }

    
    //setter and getter for enrolledCourses
    public void setenrolledCourses(String[] enrolledCoursesIN){
        this.enrolledCourses = enrolledCoursesIN;
    }
    public String[] getenrolledCourses(){
        return enrolledCourses;
    }

    //Displaying inside the class
    public void display(){
        System.out.println(name + " " + "ID: " + studentID + " has a gpa of: " + gpa);
        System.out.println("Courses enrolled are:");
            for(int i=0; i<8; i++)
            System.out.println(enrolledCourses[i]);
            
    }


    //constructor
    public Student(String name, int studentID, float gpa, String[] enrolledCourses){
        this.name = name;
        this.studentID = studentID;
        this.gpa = gpa;
        for (int i = 0; i < enrolledCourses.length && i < this.enrolledCourses.length; i++) 
        this.enrolledCourses[i] = enrolledCourses[i];
    }
}
