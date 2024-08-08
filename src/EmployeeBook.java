import java.util.Objects;

public class EmployeeBook {

    private Employee[] employee = new Employee[11]; {
        employee[0] = new Employee("Mikel", 100000, 1);
        employee[1] = new Employee("Franklin", 110000, 2);
        employee[2] = new Employee("Trevor", 95000, 3);
        employee[3] = new Employee("Lester", 120000, 4);
        employee[4] = new Employee("Dave", 130000, 5);
        employee[5] = new Employee("Lamar", 90000, 1);
        employee[6] = new Employee("Steve", 84000, 2);
        employee[7] = new Employee("Davin", 91000, 3);
        employee[8] = new Employee("Jimi", 105000, 4);
        employee[9] = new Employee("Bradly", 89000, 5);
    }
    public void addEmployee(String name, int salary, int department) {
        int count = 0;
        if (!isBookFull()) {
            System.out.println("Нет мест для запси");
        } else {
            for (Employee array : employee) {
                if(array == null) {
                    employee[count] = new Employee(name, salary, department);
                    break;
                } else {
                    count++;
                }
            }
            System.out.println("Добавлен");
        }
    }
    public void removeEmployee(int id) {
        boolean isRemoveEmployee = false;
        for (Employee array : employee) {
            if(array == null) {
                continue;
            }
            int count = 0;
            if (array.id == id) {
                employee[id - 1] = null;
                isRemoveEmployee = true;
                break;
            }
        }
        if(isRemoveEmployee) {
            System.out.println("Удален");
        }
    }
    public void findIdEmployee(int id) {
        for (Employee value : employee) {
            if(value == null) {
                System.out.println("Сотрудник под таким id не найден");
            }
            else if (value.id == id) {
                System.out.println(value.getName() + " " + value.getSalary());
                break;
            }
        }
    }
    public void listEmployees() { // метод списка всех сотрудников
        for (Employee value : employee) {
            if(value == null) {
                System.out.println( ") Свободый слот");
                continue;
            }
            System.out.println(value.toString());
        }
    } // список всех сотрудников
    public void sumSalary() { // метод всех зп
        float temp = 0;
        for (Employee value : employee) {
            if(value == null) {
                continue;
            }
            temp = value.getSalary() + temp;
        }
        System.out.println("Сумма затрат: " + temp);
    } // Метод всех зп
    public void maxSalary() { // метод максимальной зп
        float temp = 0;
        String tempName = "";
        for (Employee value : employee) {
            if(value == null) {
                continue;
            }
            if (value.getSalary() > temp) {
                temp = value.getSalary();
                tempName = value.getName();
            }
        }
        System.out.println("Максимальная зп у " + tempName + " " + temp + " рублей");
    } // Макс зп
    public void minSalary() { // метод минимальной зп
        float temp = Integer.MAX_VALUE;
        String tempName = "";
        for (Employee value : employee) {
            if(value == null) {
                continue;
            }
            if (value.getSalary() < temp) {
                temp = value.getSalary();
                tempName = value.getName();
            }
        }
        System.out.println("Минимальная зп у " + tempName + " " + temp + " рублей");
    } // Мин зп
    public void middleSalary() {
        int temp = 0;
        for (Employee value : employee) {
            if(value == null) {
                continue;
            }
            temp += (int) value.getSalary();
        }
        temp = temp / employee.length;
        System.out.println("Средние затраты " + temp);
    } // Средняя зп
    public void indexSalary(float index) {
        for (Employee value : employee) {
            if(value == null) {
                continue;
            }
            float temp = value.getSalary();
            value.salary = (value.salary * index);
            System.out.println("Зарплата сотрудника " + value.getName() + " Изменилась на " + (value.salary - temp));
        }
    } // Индексируем зп
    public void checkDepartmentMaxSalary(int dep) { //
        String tempName = "";
        float tempSalary = 0;
        for (Employee value : employee) {
            if(value == null) {
                continue;
            }
            if (employee != null && value.getDepartment() == dep && value.salary > tempSalary) {
                tempSalary = value.salary;
                tempName = value.getName();
            }
        }
        System.out.println("В " + dep + " отделе зарплата больше у " + tempName);
    }
    public void checkDepartmentMinSalary(int dep) { //
        String tempName = "";
        float tempSalary = Integer.MAX_VALUE;
        for (Employee value : employee) {
            if(value == null) {
                continue;
            }
            if (value.getDepartment() == dep && value.salary < tempSalary) {
                tempSalary = value.salary;
                tempName = value.getName();
            }
        }
        System.out.println("В " + dep + " отделе зарплата меньше у " + tempName);
    }
    public void checkDepartmentSumSalary(int dep) {
        float tempMiddleSalary = 0;
        for (Employee value : employee) {
            if(value == null) {
                continue;
            }
            if (value.getDepartment() == dep) {
                tempMiddleSalary += value.salary;
            }
        }
        System.out.println("Вcего затрат у " + dep + " отдела " + tempMiddleSalary + " рублей ");
    }
    public void checkDepartmentMiddleSalary(int dep) {
        int tempCount = 0;
        float tempMiddleSalary = 0;
        for (Employee value : employee) {
            if(value == null) {
                continue;
            }
            if (value.getDepartment() == dep) {
                tempCount++;
                tempMiddleSalary += value.salary;
            }
        }
        System.out.println("Средняя зарплата у " + dep + " отдела " + (tempMiddleSalary / tempCount) + " рублей ");
    }
    public void checkDepartmentIndexSalary(int dep, float index) {
        for(Employee value : employee) {
            if(value == null) {
                continue;
            }
            if (value.getDepartment() == dep) {
                value.salary *= index;
                System.out.println("Зарплата у " + value.getName() + " повысилась на " + String.format("%.2f",value.salary * index - value.salary) + " рублей." );
            }
        }
    }
    public void checkDepartmentList(int dep) {
        for(Employee value : employee) {
            if(value == null) {
                continue;
            }
            if (value.getDepartment() == dep) {
                System.out.println(value.getName() + " " + value.salary);
            }
        }
    } // Отделы
    public void salaryLessValue(int valueSalary) {
        for (Employee value : employee) {
            if(value == null) {
                continue;
            }
            if (value.salary <= valueSalary) {
                System.out.println(value.id + ")" + value.getName() + " " + value.salary);
            }
        }
    }
    public void salaryMoreValue(int valueSalary) {
        for (Employee value : employee) {
            if(value == null) {
                continue;
            }
            if (value.salary >= valueSalary) {
                System.out.println(value.id + ")" + value.getName() + " " + value.salary);
            }
        }
    }

    public boolean isBookFull() {
        for (Employee array : employee) {
            if (array == null) {
                return true;
            }
        }
        return false;
    }
}
