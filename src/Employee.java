public class Employee {
    private  String  employeeID;
    private String name;
    private static String designation;
    Employee(String employeeIdD,String name,String designation){
        this.setemployeeID(employeeID);
        this.designation=designation;
        this.setName(name);}

    public static String getDesignation() {
        return designation;
    }

    public static void setDesignation(String designation) {
        designation = designation;
    }

    public String getEmployeeIdD() {
        return employeeID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}