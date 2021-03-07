package FirstActivity;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Salary {

    public static void main(String[] args) {


        Employee employee[] = new Employee[3];

        employee[0] = new Employee();
        employee[0].setName("Antra");
        employee[0].setAge(45);
        employee[0].setTitle("Developer");
        employee[0].setCompany("InKL");
        employee[0].setSalary(50000);


        employee[1] = new Employee();
        employee[1].setName("Beāte");
        employee[1].setAge(46);
        employee[1].setTitle("Manager");
        employee[1].setCompany("Housekeeper");
        employee[1].setSalary(30000);


        employee[2] = new Employee();
        employee[2].setName("John");
        employee[2].setAge(34);
        employee[2].setTitle("Architect");
        employee[2].setCompany("ABC group");
        employee[2].setSalary(45000);

        System.out.println("Order of employee before sorting is");
        //print array as is.
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Employee " + (i + 1) + " name :: " + employee[i].getName() + ", Age :: " + employee[i].getAge() + ", Title :: " + employee[i].getTitle() + ", Company :: " + employee[i].getCompany() + ", Salary :: " + employee[i].getSalary());

        }
        EmployeeSalaryComparator employeeSalaryComparator = new EmployeeSalaryComparator();
        Comparator<Employee> descendingEmployeeSalaryComparator = Collections.reverseOrder(employeeSalaryComparator);


        Arrays.sort(employee, descendingEmployeeSalaryComparator);
        System.out.println("\n\nOrder of employee after sorting by employee salary is");

        for(int i=0; i < employee.length; i++){
            System.out.println( "Employee " + (i+1) + " name :: " + employee[i].getName() + ", Age :: " + employee[i].getAge() + ", Title :: " + employee[i].getTitle() + ", Company :: " + employee[i].getTitle() + ", Salary :: " + employee[i].getSalary());
        }
    }
}





/*
        if (e.getSalary() < m.getSalary()) {
            if (m.getSalary() < n.getSalary()) {
                System.out.println(+ e.getSalary() + " " + m.getSalary() + " "  + n.getSalary());
            } else {
                if (e.getSalary() < n.getSalary()) {
                    System.out.println(e.getSalary() + " " + n.getSalary() + " " +m.getSalary());
                } else {
                    System.out.println(n.getSalary() + " " + e.getSalary() + " " + m.getSalary());

                }
            }
        } else {

            if (m.getSalary() < n.getSalary()) {
                if (e.getSalary() < m.getSalary()) {
                    System.out.println(m.getSalary() + " " + e.getSalary() + " " + n.getSalary());
                } else {
                    System.out.println(m.getSalary() + " " + n.getSalary() + " " + e.getSalary());
                }
   else{

                    System.out.println(n.getSalary() + " " + m.getSalary() + " " + e.getSalary());
                }
            }
        }
    }
}
 /* 4.1 create few employees
          4.2 try to print them from top salary to less
          */


