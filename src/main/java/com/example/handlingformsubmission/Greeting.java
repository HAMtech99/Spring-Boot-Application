package com.example.handlingformsubmission;

// This class contains or holds the data submitted by the user
public class Greeting {

    // Fields to store form inputs
    private String studentId;
    private String message;
    private int month;
    private int day;
    private int year;

    // getter and setter methods for form data access and assignment
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }


}