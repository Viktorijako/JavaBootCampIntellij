package FirstActivity;

public class Employee extends Person {

    //Attributes
    private String name;
    private int age;
    private String title;
    private String company;
    private double salary;


    //Behavior - default constructor
    public Employee() {

        this.name = "Unknown";
        this.age = 0;
        this.title = "Unknown";
        this.company = "Unknown";
        this.salary = 0;

    }

    //Behavior - parameterized constructor
    public Employee(String name, int age, String title, String company, double salary) {

        this.name = name;
        this.age = age;
        this.title = title;
        this.company = company;
        this.salary = salary;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;


    }

    public static void main(String[] args) {

        Employee e = new Employee();
        e.setName("Māris Ozols");
        e.setAge(58);
        e.setTitle("Seller");
        e.setCompany("ABC ");
        e.setSalary(65000);



        System.out.println("My name is " + e.getName() + " and " + e.getAge() + " I am years old. I am working as " + e.getTitle() + " in " +e.getCompany());


        }
    }


/*2.1 Add different constructors
                2.2 Add getters and setters
                2.3 Add method for introduce of person ->
                "My name is <name> and i am <age> years old
                 I am work as <jobTitle> in <company>"

 */