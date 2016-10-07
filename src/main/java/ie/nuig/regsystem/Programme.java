/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuig.regsystem;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Think
 */
public class Programme {
String ID;
String Name;
Date startDate= new Date();
Date endDate= new Date();
    ArrayList<Module> modulesList = new ArrayList<>();

    public Programme(String ID, String Name)
    {
   this.ID=ID;
   this.Name=Name;
    }
    public void AddModule(Module newModule) {
        boolean exists = false;
        for (int i = 0; i < modulesList.size(); i++) {
            if (modulesList.get(i).ID.equals(newModule.ID)) {
                exists = true;
                break;
            }
        }
        if (exists == false) {
            modulesList.add(newModule);
        }
    }
    public ArrayList<Module> GetModuleList() {
return this.modulesList;
    }
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
    
  
}
