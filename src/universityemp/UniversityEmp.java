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
public class UniversityEmp {

    
    public static void main(String[] args) {
        Faculty faculty1 = new Faculty("Richard", "Kaune", 85751.38, "Technology");
        System.out.println(faculty1.returnDept());
        System.out.println(faculty1.returnName());
        System.out.println(faculty1.toString());
        
        UEmployee uemp = new UEmployee("Richard1", "Kaune1", 105649.34);
        System.out.println(uemp.returnName());
        System.out.println(uemp.returnSalary());
        System.out.println(uemp.toString());
    }
    
}
