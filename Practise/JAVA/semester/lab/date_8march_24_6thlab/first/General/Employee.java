// General package
package semester.lab.date_8march_24_6thlab.first.General;

public class Employee {
    protected int empId;
    private String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public double earnings(int basic) {
        double DA = 0.8 * basic;
        double HRA = 0.15 * basic;
        return basic + DA + HRA;
    }
}
