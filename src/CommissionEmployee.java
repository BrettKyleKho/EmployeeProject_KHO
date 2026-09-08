public class CommissionEmployee {
    private int empID;
    private String empName;
    private double totalSale;

    public CommissionEmployee() {
        this.empID = 0;
        this.empName = "N/A";
        this.totalSale = 0;
    }

    public CommissionEmployee(int empID,String empName) {
        this.empID = empID;
        this.empName = empName;
        this.totalSale = 0;
    }

    public CommissionEmployee(int empID,String empName, double totalSale) {
        this.empID = empID;
        this.empName = empName;
        this.totalSale = totalSale;
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

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale;
    }

    public double computeSalary(){

    }

    public void displayCommissionEmployee(){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
