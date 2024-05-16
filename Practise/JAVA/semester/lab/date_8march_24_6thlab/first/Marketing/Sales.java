// Marketing package
package semester.lab.date_8march_24_6thlab.first.Marketing;
import semester.lab.date_8march_24_6thlab.first.General.Employee;



public class Sales extends Employee {
    public Sales(int empId, String empName) {
        super(empId, empName);
    }

    public double tallowance(int basic) {
        double totalEarnings = earnings(basic);
        return totalEarnings + (0.05 * totalEarnings);
    }
}
