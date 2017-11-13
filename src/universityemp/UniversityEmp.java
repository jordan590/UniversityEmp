package universityemp;

/**
 * Date created: November 10th, 2017
 * @author joklu7045
 */
public class UniversityEmp {

    
    public static void main(String[] args) {
        Faculty faculty = new Faculty("Jordan", "Klug", 85751.38, "Technology");
        System.out.println(faculty.returnDept());
        System.out.println(faculty.returnName());
        System.out.println(faculty.toString());
        System.out.println("\n#########################################################\n");
        
        UEmployee uemp = new UEmployee("John", "Smith", 95649.34);
        System.out.println(uemp.returnName());
        System.out.println(uemp.returnSalary());
        System.out.println(uemp.toString());
        System.out.println("\n#########################################################\n");
        
        Staff staff = new Staff("Jane", "Doe", 102371.67, "Principal");
        System.out.println(staff.returnJob());
        System.out.println(staff.returnName());
        System.out.println(staff.toString());
    }
    
}
