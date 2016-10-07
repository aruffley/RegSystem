/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuig.regsystem;

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
public class StudentJUnitTest {
    
    public StudentJUnitTest() {
    }
    Student sampleStudent;
    @Before
    public  void setUpClass() {
        sampleStudent=new Student();
        sampleStudent.setAge(22);
        sampleStudent.setName("John");
        sampleStudent.setID("12334451");
    }
    @Test
    public void TestUsername()
    {
        //sampleStudent.g#
        assertEquals("John22", sampleStudent.getUsername());
    }
    @Test
        public void TestID()
    {
        //sampleStudent.g#
        assertEquals("12334451", sampleStudent.getID());
    }
   
}
