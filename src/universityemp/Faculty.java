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
public class Faculty extends UEmployee {
    
    private String department;
    
    /**
     * constructor
     * pre: none
     * post: Faculty object created. Variable has a temp value
     */
    public Faculty(){
        department = "";
    }
    
    /**
     * constructor
     * pre: none
     * post: Faculty object created. Variables have custom values
     * @param f
     * @param l
     * @param s
     * @param d
     */
    public Faculty(String f, String l, double s, String d) {
        super(f, l, s);
        department = d;
    }
    
    
    /**
     * Returns department of Faculty member
     * pre: none
     * post: return department
     * @return 
     */
    public String returnDept(){
        return "Faculty Department: " + department;
    }
    
    /**
     * Returns the name of the Faculty member
     * pre: none
     * post: returns full name
     * @return
     */
    @Override
    public String returnName(){
        return "Faculty Name: " + firstName + " " + lastName;
    }
    
    /**
     * Returns a string that represents the Faculty object.
     * pre: none
     * post: return information related to Faculty object
     * @return 
     */
    @Override
    public String toString(){
        return "Faculty Profile: " + "\n" + "Name: " + firstName + " " + lastName + "\n"
                + "Salary: $" + salary;
    }
}
