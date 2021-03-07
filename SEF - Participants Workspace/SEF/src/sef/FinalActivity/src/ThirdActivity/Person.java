package ThirdActivity;

public class Person {
    String firstName;
    String lastName;
    int age;


    public static void main(String[] args) {

        Person person = new Person();
        person.firstName = "Viktorija";
        person.lastName = "Za6pme";
        person.age = 30;

        try {
            person.checkDigitsInName(person.firstName);
            person.checkDigitsInName(person.lastName);

        } catch (CustomException ce) {
            System.out.println(ce);
        }

    }

    public void checkDigitsInName(String name) throws CustomException {

        for (int i = 0; i < name.length(); i++) {


            if (!Character.isLetter(name.charAt(i))) {
                System.out.println("Error! Name: " + name + " contains digit at position: " + i);
                throw new CustomException();
            }


        }
        System.out.println("Name: " + name + " is OK");
    }
}




