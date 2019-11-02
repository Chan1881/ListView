package com.example.myapplication.Java;

public class Student {
    public String sn;
    public String si;
    public String sc;

    public Student(){

    }

    public Student(String name, String id, String course){
        sn=name;
        si=id;
        sc=course;
    }

    public String  getStudentName(){
        return sn;
    }

    public String  getStudentId(){
        return si;
    }

    public String  getStudentCourse(){
        return sc;
    }

    public void setStudentName(String name){
        sn=name;
    }

    public void setStudentId(String id){
        si=id;
    }

    public void setStudentCourse(String course){
        sc=course;
    }
}
