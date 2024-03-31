public class EmployeeDetails extends DevopsEngineerS{
    String empName="Sukanya";
    String empId="01fe22bca138";

    public void displayDetails()
    {
       System.out.println("Name:"+empName);
       System.out.println("Employee Id:"+empId);

    }
   public static void main(String[] args) {
       float salary=100000;
       // Creating an Employee object
       EmployeeDetails employee = new EmployeeDetails();
       // Displaying employee details
       employee.displayDetails();
      employee.displaySalary(salary);
   }
}


