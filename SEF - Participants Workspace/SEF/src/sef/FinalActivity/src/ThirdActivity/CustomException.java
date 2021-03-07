package ThirdActivity;

public class CustomException extends Exception {


    public String toString() {
        return "Name cannot contain digits";
    }

}