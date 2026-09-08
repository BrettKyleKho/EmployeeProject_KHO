public class BasePlusCommissionEmployee {
    private int empID;
    private String empName;
    private double totalSale;
    private double totalSalary;

    public BasePlusCommissionEmployee() {
        this.empID = 0;
        this.empName = "N/A";
        this.totalSale = 0;
        this.totalSalary = 0;
    }

    public BasePlusCommissionEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.totalSale = 0;
        this.totalSalary = 0;
    }

    public BasePlusCommissionEmployee(int empID, String empName, double totalSale, double totalSalary) {
        this.empID = empID;
        this.empName = empName;
        this.totalSale = 0;
        this.totalSalary = 0;
    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public double getTotalSale() {
        return totalSale;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public double computeSalary(){

    }

    public void displayBasePlusCommissionEmployee(){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
