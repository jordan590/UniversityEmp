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
public class Staff extends UEmployee {
    
    private String jobTitle;
    
    /**
     * constructor
     * pre: none
     * post: Staff object created. Variable has a temp value
     */
    public Staff(){
        jobTitle = "";
    }
    
    /**
     * constructor
     * pre: none
     * post: Staff object created. Variables have custom values
     * @param f
     * @param l
     * @param s
     * @param j
     */
    public Staff(String f, String l, double s, String j){
        super(f, l, s);
        jobTitle = j;
    }
    
    /**
     * Returns the job title of the Staff
     * pre: none
     * post: Returns the job title of the staff
     * @return 
     */
    public String returnJob(){
        return "Staff Job Title: " + jobTitle;
    }
    
    /**
     * Returns the name of the Staff member
     * pre: none
     * post: returns full name
     * @return
     */
    @Override
    public String returnName(){
        return "Staff Name: " + firstName + " " + lastName;
    }
    
    /**
     * Returns a string that represents the Staff object.
     * pre: none
     * post: return information related to Staff object
     * @return 
     */
    @Override
    public String toString(){
        return "Staff Profile: " + "\n" + "Name: " + firstName + " " + lastName + "\n"
                + "Salary: $" + salary;
    }
    
}
