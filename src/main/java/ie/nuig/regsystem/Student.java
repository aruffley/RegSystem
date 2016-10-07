/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuig.regsystem;

import java.util.Date;

/**
 *
 * @author Think
 */
public class Student {
    private String name;
    private String ID;
    private String DOB;
private String username;
private int age;
Programme studyProgram;

public Student()
{
    
}
public Student(String ID,String name,Programme studyProgram)
{
    this.ID=ID;
    this.name=name;
    this.studyProgram=studyProgram;
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getUsername()
    {
        return( this.name+ age);
    }    

    public Programme getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(Programme studyProgram) {
        this.studyProgram = studyProgram;
    }


    
}
