public class Main {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();
        book.addEmployee("Dmitry", 100000,1);
        book.removeEmployee(2);
        book.removeEmployee(4);
        book.maxSalary();
        book.findIdEmployee(1);
        book.sumSalary();
        book.minSalary();
        book.middleSalary();
        book.indexSalary(1.05f);
        book.checkDepartmentMaxSalary(4);
        book.checkDepartmentMinSalary(3);
        book.checkDepartmentMiddleSalary(1);
        book.checkDepartmentSumSalary(1);
        book.checkDepartmentIndexSalary(1, 1.1f) ;
        book.checkDepartmentList(1);
        book.salaryLessValue(110000);
        book.salaryMoreValue(110000);

        book.listEmployees();
    /*    // Test easy
        Employee.listEmployees(employee);
        Employee.sumSalary(employee);
        Employee.maxSalary(employee);
        Employee.minSalary(employee);
        Employee.middleSalary(employee);
        Employee.indexSalary(employee, 1.15f);

        // Test upLevel
        int dep = 1;
        Employee.checkDepartmentMaxSalary(employee, dep);
        Employee.checkDepartmentMinSalary(employee, dep);
        Employee.checkDepartmentSumSalary(employee, dep);
        Employee.checkDepartmentMiddleSalary(employee, dep);
        Employee.checkDepartmentIndexSalary(employee, dep, 1.05f);
        Employee.checkDepartmentList(employee, dep);
        Employee.salaryLessValue(employee, 110000);
        Employee.salaryMoreValue(employee, 110000);
*/
    }
}