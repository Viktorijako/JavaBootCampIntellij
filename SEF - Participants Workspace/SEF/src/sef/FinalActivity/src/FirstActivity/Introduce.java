package FirstActivity;

public class Introduce {

    public static void main(String[] args) {



        Employee e = new Employee();
        e.setName("Antra");
        e.setAge(45);
        e.setTitle("Developer");
        e.setCompany("InKL");
        e.setSalary(50000);


        Employee m = new Employee();
        m.setName("Beāte");
        m.setAge(46);
        m.setTitle("Manager");
        m.setCompany("Housekeeper");
        m.setSalary(30000);

        Employee n = new Employee();
        n.setName("John");
        n.setAge(34);
        n.setTitle("Architect");
        n.setCompany("ABC group");
        n.setSalary(45000);

        // Print Info using Employee object
        System.out.println("-----------------------------");
        System.out.println("Employee's Name is   : " + e.getName());
        System.out.println("Employee's Age is    : " + e.getAge());
        System.out.println("Employee's Title is  : " + e.getTitle());
        System.out.println("Employee's Company is : " + e.getCompany());
        System.out.println("Employee's Salary is : " + e.getSalary());
        System.out.println("-----------------------------");
        System.out.println("Employee's Name is   : " + m.getName());
        System.out.println("Employee's Age is    : " + m.getAge());
        System.out.println("Employee's Title is  : " + m.getTitle());
        System.out.println("Employee's Company is : " + m.getCompany());
        System.out.println("Employee's Salary is : " + m.getSalary());

        System.out.println("-----------------------------");
        System.out.println("Employee's Name is   : " + n.getName());
        System.out.println("Employee's Age is    : " + n.getAge());
        System.out.println("Employee's Title is  : " + n.getTitle());
        System.out.println("Employee's Company is : " + n.getCompany());
        System.out.println("Employee's Salary is : " + n.getSalary());
        System.out.println("-----------------------------");
        System.out.println("Array of Salary is : " + e.getSalary() + ", " + m.getSalary() + " " + n.getSalary());

    }
}



