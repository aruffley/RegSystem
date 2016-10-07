/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuig.regsystem;

import java.util.ArrayList;

/**
 *
 * @author Think
 */
public class Module {
String ID;
String Name;
ArrayList studentsList=new ArrayList();

public Module()
{
}
public Module(String ID, String Name)
{
    this.ID=ID;
    this.Name=Name;
}
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
public boolean Register(String studentID)
{
    if(this.studentsList.contains(studentID))
        return false;
    else
    {
    this.studentsList.add(studentID);
    return true;
    }
}
public ArrayList getRegisteredStudents()
{
return this.studentsList;    
}

}
