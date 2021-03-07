package Bonus;


public class Employee extends Person {


    //Attributes
    private String name;
    private String title;
    private String company;
    private double salary;


    //Behavior - default constructor
    public Employee() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name ="<E>"+name;

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
    }

