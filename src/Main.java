public class Main {
   private static final Employee[] EMPLOYEES = new Employee[10];
    public static void main(String[] args) {
        EMPLOYEES[0]=new Employee("Петров Петр Петрович",1, 34000);
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

}
