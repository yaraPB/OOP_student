/** Java exercice
  * Author: Yara 
  * Last update on: 15 September 2023
  */

import java.util.*;

public class Main{
  public static void main(String[] args){
    System.out.println("Welcome to the university registration website:"); 
    //since the students are picking from courses, the website should only offer the available ones:
    String[] courses = {"csc1111", "com2222", "mth3333"};
    System.out.println("Here are the available courses:");
    Student s1 = new Student("AAA", 123, 4.09f, courses);
    s1.displayCourses();
  }
}

class Student{
    private String name;
    private int studentID;
    private float gpa;
    //we assume that the maximum amount of courses a student can take is 8
    private String enrolledCourses[] = new String[5];


    //setting up the String with the double strings so that the UI is better:

    private String ec[][] = new String[][] {{"aaa1", "aaa2", "aaa3"},
    {"bbb1", "bbb2", "bbb3"},
    {"ccc1", "ccc2", "ccc3"}
};

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

    //Display the available courses: 
    public void displayCourses(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.printf("|"+ec[i][j] + "|");
            }
            System.out.println();
        }
    }

    //Student enrolling in a course: 
    public String enrollInCourse(String courseName){
        for(int i=0; i< enrolledCourses.length; i++){
            if(courseName==enrolledCourses[i]) return "Enrolled in: " + courseName + " succesfully";
        }
        return "Course not found";
    }   

}
