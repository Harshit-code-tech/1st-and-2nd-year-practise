package semester.lab.date_8march_24_6thlab.first;// Main class
import java.util.Scanner;

import semester.lab.date_8march_24_6thlab.first.Marketing.Sales;

public class first6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the employee id and employee name:");
        int empId = scanner.nextInt();
        String empName = scanner.next();
        System.out.println("Enter the basic salary:");
        int basicSalary = scanner.nextInt();

        Sales salesPerson = new Sales(empId, empName);
        double totalEarnings = salesPerson.tallowance(basicSalary);
        System.out.println("The emp id of the employee is " + empId);
        System.out.println("The total earning is " + totalEarnings);
    }
}
