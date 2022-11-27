public class Main {
   private static final Employee[] EMPLOYEES = new Employee[10];
    public static void main(String[] args) {
        EMPLOYEES[0]=new Employee("Петров Петр Петрович",1, 38700);
        EMPLOYEES[1]=new Employee("Петров Влад Олегович",3,35500);
        EMPLOYEES[2]=new Employee("Петров Олег Олегович",2,39000);
        EMPLOYEES[3]=new Employee("Олегич Владимир Олегович",4,40000);
        EMPLOYEES[4]=new Employee("Петов Владимир Владимирович",1,50000);
        EMPLOYEES[5]=new Employee("Олеговар Владимир Ольгович",3,43000);
        EMPLOYEES[6]=new Employee("Петров Петр Олегович",4,41000);
        EMPLOYEES[7]=new Employee("Владимиров Владимир Олегович",3,50100);
        EMPLOYEES[8]=new Employee("Петров Петр Петрович",2,36000);
        EMPLOYEES[9]=new Employee("Владимиров Владимир Владимирович",2,37000);
        
        printAllInformation();
        double salariesSum = getSalarieSum();
        System.out.println("Сумма з/п - "+salariesSum);
        Employee employeeMinSalary=findMinSalaryEmployee();
        System.out.println("Сотрудник с мин.з/п - "+employeeMinSalary);
        Employee employeeMaxSalary=findMaxSalaryEmployee();
        System.out.println("Сотрудник с макс.з/п - "+employeeMaxSalary);
        double averageSalary = findAverageSalary();
        System.out.println("Средняя з/п -  "+averageSalary);
        printAllNames();
        getRaiseSalary();

    }
    private static void printAllInformation() {
        for (Employee employee:EMPLOYEES) {
            System.out.println(employee);

        }
    }
    private static double getSalarieSum() {
        double sum=0;
        for (Employee employee:EMPLOYEES) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee findMinSalaryEmployee() {
        double min=Integer.MAX_VALUE;
        Employee employeeMinSalary = null;
        for (Employee employee:EMPLOYEES) {
            if (employee.getSalary() < min) {
                min = employee.getSalary();
                employeeMinSalary = employee;
            }
        }return employeeMinSalary;
    }
    private static Employee findMaxSalaryEmployee() {
        double max = Integer.MIN_VALUE;
        Employee employeeMaxSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }

    private static double findAverageSalary() {
                return (double) getSalarieSum() / EMPLOYEES.length;
    }
    private static void printAllNames() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getfIO());

        }
    }
     private static void getRaiseSalary() {
         double percent=0.02;
          for (Employee employee:EMPLOYEES) {
              employee.setSalary(employee.getSalary()*(1+percent));
              System.out.printf("После индексации з/п "+employee.getfIO()+" получает %.0f "+"рублей%n", employee.getSalary());
         }

        }

}

