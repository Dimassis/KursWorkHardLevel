 import java.util.Objects;

    public class Employee {
        private final String name;
        float salary;
        private int department;
        int id = 0;
        private static int count = 1;
        public Employee(String name, float salary, int department) {
            this.name = name;
            this.salary = salary;
            this.department = department;
            this.id = count++;
        }
        public int getDepartment() {
            return department;
        }
        public float getSalary() {
            return salary;
        }
        public String getName() {
            return name;
        }
        public void setDepartment(int department) {
            this.department = department;
        }
        public void setSalary(int salary) {
            this.salary = salary;
        }
        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
        public boolean equals(Employee employee) {
            if (this.getName() != employee.getName() && this.getSalary() != employee.getSalary() && this.getDepartment() != employee.getDepartment() ) {
                return false;
            } else {
                return true;
            }
        }
        public String toString() {
            return id + ")" + getName() +  ", salary: " + getSalary() + ", Department: " + getDepartment();
        }
    }
