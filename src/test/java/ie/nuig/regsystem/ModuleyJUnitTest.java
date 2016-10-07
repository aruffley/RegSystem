/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuig.regsystem;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Think
 */
public class ModuleyJUnitTest {
    
    public ModuleyJUnitTest() {
    }
        Student student1;
         Student student2;
          Student student3;
          Module ITModule;
    @Before
    public  void setUpClass() {
        student1=new Student();
        student1.setID("12334451");
        student2=new Student();
        student2.setID("1255555");
        student3=new Student();
        student3.setID("1200011");
        ITModule=new Module();
        ITModule.setID("CT340");
  //Adding students to a module
  ITModule.Register(student1.getID());
   ITModule.Register(student2.getID());
    ITModule.Register(student3.getID());
    }
    @Test
    public void TestStudentsList()
    {
        assertArrayEquals(new String[]{"12334451","1255555","1200011"},ITModule.studentsList.toArray());
    }
}
