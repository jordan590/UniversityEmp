/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package universityemp;

/**
 * Date created: November 10th, 2017
 * @author joklu7045
 */
public class UEmployee {
    
    protected String firstName, lastName;
    protected double salary;
    
    /**
     * constructor
     * pre: none
     * post: UEmployee object created. Variables have temp values
     */
    public UEmployee(){
        firstName = "";
        lastName = "";
        salary = 0;
    }
    
    /**
     * constructor
     * pre: none
     * post: UEmployee object created. Variables have custom values
     * @param fName
     * @param lName
     * @param s
     */
    public UEmployee(String fName, String lName, double s){
        firstName = fName;
        lastName = lName;
        salary = s;
    }
    
    /**
     * Returns the name of the UEmployee member
     * pre: none
     * post: returns full name
     * @return
     */
    public String returnName(){
        return firstName + " " + lastName;
    }
    
    /**
     * Returns the salary of the UEmployee member
     * pre: none
     * post: return full name
     * @return
     */
    public String returnSalary(){
        return "$" + salary;
    }
    
    /**
     * Returns a string that represents the UEmployee object.
     * pre: none
     * post: return information related to UEmployee object
     * @return 
     */
    public String toString(){
        return "Employee Profile: " + "\n" + "Name: " + firstName + " " + lastName + "\n"
                + "Salary: $" + salary;
    }
}
