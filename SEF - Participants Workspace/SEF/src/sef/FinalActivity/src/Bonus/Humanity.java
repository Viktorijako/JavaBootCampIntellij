package Bonus;

public class Humanity {


    public static void main(String[] args) {

        // Person_A is abstract class so cannot be instantiated. Following gives error
        // Person_A p = new Person_A();

        Person pE = new Employee();
        pE.setAge(21);
        pE.setName("Smith");


        Employee e = new Employee();
        e.setAge(33);
        e.setName("Raju");
        e.setSalary(80000);
        e.setTitle("Programmer");


        System.out.println("---------------------------");
        System.out.println("Employee Age          : " +pE.getAge());
        System.out.println("Employee Name         : " +pE.getName());


        System.out.println("---------------------------");
        System.out.println("Employee Age          : " +e.getAge());
        System.out.println("Employee Name         : " +e.getName());
        System.out.println("Employee Salary       : " +e.getSalary());
        System.out.println("Employee Title        : " +e.getTitle());








    }
}
