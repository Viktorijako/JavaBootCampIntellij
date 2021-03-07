package FirstActivity;

public class Person {
        public String firstName;
        public String lastName;
        private int age;


    public static void main(String[] args) {

        Person person = new Person();
        person.firstName = "Viktorija";
        person.lastName = "Zapme";
        person.age = 30;


        System.out.println("My name is " + person.firstName + " " + person.lastName + " and I am " + person.age + " years old");
    }}

      /*  public static void person.Age(int age) throws CustomException {
            //1 - Check if age<0. if yes, then throw CustomException
            if (age < 0) {
                //Creating and throwing an instance of CustomException
                //this ensures that CustomException is thrown
                throw new CustomException();
            }
        }

        public static void main(String arg[]) {
            //Since CustomException is a checked exception, it's mandatory to call setAge method
            //inside a try catch block. Else the code would not compile.
            //2 - call setAge method with -1 as its parameter and surround this with a try catch block
            try {
                setAge(-1);
            } catch(CustomException ce) {
                System.out.println("Age cannot be zero " + ce);
                System.out.println(ce.getMessage());}

 }
*/