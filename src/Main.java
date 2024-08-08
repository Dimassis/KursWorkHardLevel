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
    }
}