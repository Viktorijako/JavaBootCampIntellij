package FirstActivity;

public class Students extends Person {

    public String schoolName;

    public static void main(String[] args) {

        Students s = new Students();
        s.schoolName = "BA";


        System.out.println("I am studying in university " + s.schoolName);


        }


    }

/*
in file Students
                3.1 Create file students from scratch
                3.2 Add method for introduce of person ->
                      "I am study in university <schoolName>"
 */