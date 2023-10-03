public class Lab {
    private String labId;
    private Computer[] computers;
    private LabStatus status;
    private Employee labAttendant;
    Lab(String labId,Computer[] computers,LabStatus status,Employee labAttendant){
        this.labId=labId;
        this.computers=computers;
        this.status=status;
        this.labAttendant=labAttendant;

    }
    public void setLabAttendant(Employee employeeID,Employee name,Employee designation){
        this.employeeID=id;
        this.name=name;
        this.designation=designation;
    }
}