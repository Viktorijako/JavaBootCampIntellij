package FirstActivity;

public class FirstActivity {
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
    /*
    public static void main(String[] args) {
   if (e.setSalary() < m.setSalary()) {
       if (m.setSalary < n.setSalary) {
           System.out.println(e.setSalary, m.setSalary, n.setSalary);
       } else {
           if (e.setSalary < c.setSalary) {
               System.out.println(e.setSalary, n.setSalary, m.setSalary);
           } else {
               System.out.println(n.setSalary, e.setSalary, m.setSalary);

           }
       }
   } else {

       if (m.setSalary < n.setSalary) {
           if (e.setSalary < m.setSalary) {
               System.out.println(m.setSalary, a.setSalary, n.setSalary);
           } else {
               System.out.println(m.setSalary, n.setSalary, e.setSalary);
           }
   else {

               System.out.println(n.setSalary, m.setSalary, e.setSalary);
           }
       }
       */
/*



   4.1 create few employees
                4.2 try to print them from top salary to less
 */